package basics

fun main() {
    println(testMultipleReturnType())
//    println(testMultipleReturnType2())        // todo: giving error
    testEvisOperator()
}
class GenerateNo{
    val hunger:Int? = 100
    val learning:Int? = null
}

fun testEvisOperator() {
    val obj = GenerateNo()
    val no = obj?.hunger ?: -1
    val no2 = obj?.learning ?: -1
    println("no = $no")
    println("no2 = $no2")
}

fun testMultipleReturnType2(): Array<Int> {
var list : Array<Int>? = null
    list?.set(0,11)
    list?.set(1,34)
    list?.set(2,4)

    return list!!
}

fun testMultipleReturnType() : ArrayList<Int>{
    val list = arrayListOf(1, 2, 3, 55)
    return list
}