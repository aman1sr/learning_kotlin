package lambda_stuff

fun main() {
    println("add half of sum: ${giveHalf(5, 10) { x, y -> ((x + y).toDouble()/2) }}")
    println("add half of Sub: ${giveHalf(10, 3) { x, y -> ((x - y).toDouble()/2) }}")
    println("add half of Multiply: ${giveHalf(5, 10) { x, y -> ((x * y).toDouble()/2) }}")
    println("fun : ${giveHalf(4,5)}")


    // function returning lambda
    val resultLamdaReturn = giveHalf2("add")
        .invoke(5,4)
    println("resultLamdaReturn: $resultLamdaReturn")

}
/*NOTE: the way to invoke lambda returning is > fun(param1)(lambdaExp) */
fun giveHalf2(expression: String): (Int, Int) -> Double {
    var result: Double = 0.0

    if (expression.equals("add")) {
        return { x, y ->
            (x + y).toDouble()
        }
    } else if (expression.equals("sub")) {
        return { x, y -> (x - y).toDouble() }
    } else {
        return {x,y-> result}
    }

}

fun giveHalf(x: Int, y: Int): Double {
// ... some...calc....
    val result = giveSumHalf(x, y)

    return result
}

fun giveSumHalf(x: Int, y: Int): Double {
    return (x+y).toDouble()/2;
}

fun giveHalf(x: Int, y: Int, converter: (Int, Int) -> (Double)): Double {
// ... some...calc....
    val result = converter.invoke(x, y)

    return result
}



