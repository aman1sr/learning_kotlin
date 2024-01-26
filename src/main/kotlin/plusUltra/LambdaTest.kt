package plusUltra

import FirstHead.calculateGameResult
import kotlin.math.exp

/*
* Anonymous functions that we can treat as values
*    we can, for example, pass them as arguments to functions, return them, or do any other thing we could do with a normal object.
* */
val greeting: () -> String = { "Hello!" }
val addSTuff = { x: Int, y: Int -> x + y }
val addFive: (Int) -> (Double) = { x: Int -> (x + 5).toDouble() }
val addNine: (Int) -> (Double) = { (it + 9).toDouble() }       // single parameter , can use it (compiler can inter)

/*Unit*/
val testUnit: () -> Unit = { println("this is a unit Check") }
val printSum: (x: Int, y: Int) -> Unit = { x, y -> println("x+ y = ${x.plus(y)}") }

/*way to invoke lambda as parameter is > fun(param){lambdaExp} */
fun giveHalf(x: Int, y: Int, converter: (Int, Int) -> (Int)): Double {
    val result = converter(x, y).toDouble()
    return (result / 2)
}

/*NOTE: the way to invoke lambda returning is > fun(param1)(lambdaExp) */
fun giveHalf2(expression: String): (Int, Int) -> Double {
    var result: Double = 0.0

    if (expression.equals("add")) {
        return { x, y -> (x + y).toDouble() }
    } else if (expression.equals("sub")) {
        return { x, y -> (x - y).toDouble() }
    } else {
       return {x,y-> result}
    }

}
fun main() {
    println(greeting)
    println(addSTuff(4, 5))
    println(addFive(5))
    println(addNine(5))

    /* checking Unit case */
    testUnit()
    printSum(3, 4)

    // function taking lambda (to return the half of various expression: add, sub,,,)
    println("add half : ${giveHalf(5, 10) { x, y -> x + y }}")
    println("sub half : ${giveHalf(5, 10) { x, y -> x - y }}")
    println("multiply half : ${giveHalf(5, 10) { x, y -> x * y }}")

    // function returning lambda
    val resultLamdaReturn = giveHalf2("add")(5, 4)
    println("resultLamdaReturn: $resultLamdaReturn")


}
