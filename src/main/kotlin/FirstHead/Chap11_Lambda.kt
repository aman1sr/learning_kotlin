package FirstHead
private const val CONVERT_KGS_TO_POUNDS = "KgsToPounds"
private const val CONVERT_CENTIGRADE_TO_FARENHEIT = "CentigradeToFarenheit"
private const val CONVERT_POUNDS_TO_USTONS = "PoundsToUsTons"

fun main() {

//    basicsInvocation()
//      singleParameterCase()
    usingLambdaAsParameter()
//    usingLambdaAsReturnTypeAlias()

}

/*
*  for a Single parameterer we can use it, can only use the it syntax in situations where the compiler can infer the type of the parameter
* */
fun singleParameterCase() {
    val addSeven: (Int) -> Int = { it + 7}
    println("adding 5 to Seven: ${addSeven(5)}")

    val addSum: (Int, Int) -> Int = {x, y -> x+y }
    println("adding 3 & 4: ${addSum(3, 4)}")
}


fun usingLambdaAsReturnTypeAlias() {
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
/*
* A type alias lets you provide an alternative name for an existing type, which you
* can then use in your code. This means that if your code uses a function type such
* as (Double) -> Double, you can define a type alias that’s used in its place,
* */
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

fun usingLambdaAsParameter() {

   val result = convert(20.0,{ it * 1.8 + 32})      // invoking lambda in the body  ,  convert(20.0){ it * 1.8 + 32}    same as ab.  | invoking outside the body (like it)
    println("lambda result1 : $result")

    convertFive { it * 1.8 + 32 }       // convertFive()  is taking a lambda f() as a parameter , which isn't returning anything

    mastiKiPaathshala {    // flow of code will stop from convertSix() & come here here in Lambda block{ } & again exeute convertSix() left lines (but gennerally we don't)
       println("masti yuu hi chaleegi ${it * 5}")
    }
}

/*the converter here represent the Lambda function, of type converter: (Double)-> Double)
*  means the convert function wants the converter() to do calc & return back something,,
*   so the flow of code is back in convert()
*  */
fun convert(x: Double, converter: (Double)-> Double): Double{
    val result = converter(x)
    println("$x is converted to $result")

    return result
}

fun convertFive(converter: (Int) -> Double) : Unit{
    val result = converter(5)
    println("4 is converted to $result")
}

fun mastiKiPaathshala(mastiActivated: (Double) -> Unit): Unit{
    println("Masti started")
    mastiActivated(2.0)
    println("is Masti paused???")           // ok AFter we excuted lambda block ,, the rest of the code in mastiKiPaathshala() will also flow like normal

}

private fun basicsInvocation() {
    var addFive = { x: Int -> x + 5 }
    println("Pass 6 to add Five : ${addFive(6)}")


    val addInts = { x: Int, y: Int -> x + y }
    val result = addInts.invoke(6, 7)               // use invoke to use Lambda, when using it in an Expression
    println("Pass 6,7 to addInts: $result")
    println("Pass 2,3 to addInts: ${addInts(2,3)}")

    val intLambda: (Int, Int) -> Int = { x, y -> x * y }
    println("pass 10,11 to intLambda: ${intLambda(10, 11)}")
    val addSeven: (Int) -> Int = { it + 7 }                 // my Fav style for single parameter
    println("Pass 12 to addSeven: ${addSeven(12)}")

    val myLamda: () -> Unit = { println("hello") }
    myLamda()
}