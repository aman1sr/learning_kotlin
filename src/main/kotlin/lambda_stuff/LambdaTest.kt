package lambda_stuff

/*
* Anonymous functions that we can treat as values
*    we can, for example, pass them as arguments to functions, return them, or do any other thing we could do with a normal object.
* */
val greeting: () -> String = { "Hello!" }
val addSTuff = { x: Int, y: Int -> x + y }

val addFive = { x: Int -> (x + 5).toDouble() }
val addFivee: (Int) -> (Double) = { (it + 5).toDouble() }      // it can be used in single parameter case
val addFiveee: (Int) -> (Double) = { x -> (x + 5).toDouble() }

val addNine: (Int) -> (Double) = { (it + 9).toDouble() }       // single parameter , can use it (compiler can inter)

/*Unit*/
val testUnit: () -> Unit = { println("this is a unit Check") }
val printSum: (x: Int, y: Int) -> Unit = { x, y -> println("x+ y = ${x.plus(y)}") }

/* way to invoke lambda as parameter is > fun(param){lambdaExp} */
fun giveSumHalf(x: Int, y: Int, converter: (Int, Int) -> (Double)): Double {
    val result = converter.invoke(x, y)
    return result
}
fun giveSubHalf(x: Int, y: Int, converter: (Int, Int) -> (Int)): Double {
    val result = converter(x, y).toDouble()
    return result
}
fun giveMulHalf(x: Int, y: Int, converter: (Int, Int) -> (Int)): Double {
    val result = converter(x, y).toDouble()
    return result
}


fun main() {
    println(greeting.invoke())
    println(addSTuff(4, 5))
    println(addFive.invoke(5))
    println(addNine(5))

    /* checking Unit case */
    testUnit.invoke()
    printSum.invoke(3, 4)

    // function taking lambda (to return the half of various expression: add, sub,,,)
    println("add half : ${giveSumHalf(5, 10) { x, y -> ((x + y).toDouble()/2) }}")
    println("sub half : ${giveSubHalf(5, 10) { x, y -> (x - y)/2 }}")
    println("multiply half : ${giveMulHalf(5, 10) { x, y -> (x * y)/2 }}")



}
