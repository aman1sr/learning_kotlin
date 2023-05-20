package FirstHead
private const val CONVERT_KGS_TO_POUNDS = "KgsToPounds"
private const val CONVERT_CENTIGRADE_TO_FARENHEIT = "CentigradeToFarenheit"
private const val CONVERT_POUNDS_TO_USTONS = "PoundsToUsTons"

fun main() {
//    test1()
    test1_1()
//    test2()
//    test3()


}
/*
* NOTE:
*   -for a Single parameterer we can use it, can only use the it syntax in situations where the compiler can infer the type of the parameter
*       eg >> val addFive: (Int) -> Int = { it + 5 }
*       { it + 5 } is equivalent to { x -> x + 5 },
*
*   -Use Unit to say a lambda has no return value
*       eg >> val myLambda: () -> Unit = { println("Hi!") }
*
*
*
* */
fun test1_1() {
    val addSeven: (Int) -> Int = { it + 7}
    val addSum: (Int, Int) -> Int = {x, y -> x+y }

    println("adding 5 to Seven: ${addSeven(5)}")
    println("adding 3 & 4: ${addSum(3, 4)}")

}

fun test3() {
    // convert 2.5kg to Pounds
    println("Convert 2.5kg to Pounds: ${getConversionLambda(CONVERT_KGS_TO_POUNDS)(2.5)}")

    //Define two conversion lambdas
    val kgsToPoundsLambda = getConversionLambda(CONVERT_KGS_TO_POUNDS)
    val poundsToUSTonsLambda = getConversionLambda(CONVERT_POUNDS_TO_USTONS)

    //combine 2 lambdas to create 1
    val kgsToUsTonsLambda = combine(kgsToPoundsLambda, poundsToUSTonsLambda)

    //Use the new Lambda to convert 17.4 to US tons
    val value = 17.4
    println("$value kgs is>>> ${convert3(value,kgsToUsTonsLambda)} US tons!!!")


}
typealias DoubleConversion = (Double) -> Double
fun convert3(x: Double, converter: DoubleConversion) : Double{
    val result = converter(x)
    println("$x is converted to $result")
    return result
}


fun getConversionLambda(str: String): DoubleConversion{     // it's return type is a Lambda,, therefore access it >> fun(param)(lambda_param)
    if (str == CONVERT_CENTIGRADE_TO_FARENHEIT) {
        return {it*1.8+32}
    }
    else if (str == CONVERT_KGS_TO_POUNDS) {
        return { it * 2.204623 }
    }else if (str == CONVERT_POUNDS_TO_USTONS) {
        return {it/2000.0}
    } else {
        return { it }
    }
}
fun combine(lambda1: DoubleConversion, lambda2: DoubleConversion) : DoubleConversion{
    return {x: Double -> lambda2(lambda1(x))}
}

fun test2() {

    convert(20.0,{ it * 1.8 + 32})      // invoking lambda in the body (fav)
//    convert(20.0){ it * 1.8 + 32}         // same as ab.  | invoking outside the body
    convertFive { it * 1.8 + 32 }
}

/*the converter here represent the Lambda, via Which we could (input & take return as an output) */
fun convert(x: Double, converter: (Double)-> Double): Double{
    val result = converter(x)
    println("$x is converted to $result")

    return result
}
fun convertFive(converter: (Int) -> Double) : Double{
    val result = converter(5)
    println("4 is converted to $result")
    return result
}

private fun test1() {
    var addFive = { x: Int -> x + 5 }
    println("Pass 6 to add Five : ${addFive(6)}")



    val addInts = { x: Int, y: Int -> x + y }
    val result = addInts.invoke(6, 7)               // use invoke to use Lambda,, when using it in an Expression
    println("Pass 6,7 to addInts: $result")
    println("Pass 2,3 to addInts: ${addInts(2,3)}")

    val intLambda: (Int, Int) -> Int = { x, y -> x * y }
    println("pass 10,11 to intLambda: ${intLambda(10, 11)}")

    val addSeven: (Int) -> Int = { it + 7 }                 // my Fav style
    println("Pass 12 to addSeven: ${addSeven(12)}")

    val myLamda: () -> Unit = { println("hello") }
    myLamda()
}