
/*--------------------------------------Higher Order Function---------------------------------------*/

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
return operation(x,y)
}

fun sum(x: Int, y: Int) = x + y
fun multiply (x: Int,y: Int)= x*y

fun main() {
    val sumResult = calculate(4, 5, ::sum)  // takes another function as parameter
    val multiplyResult = calculate(4, 5, ::multiply)

    val mulResult = calculate(3,4){a,b -> a * b}

    println("sumResult = $sumResult, multiplyResult = $multiplyResult, mulResult = $mulResult ")

}