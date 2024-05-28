package generic
/*
* medium (https://towardsdev.com/understanding-generics-in-kotlin-in-out-where-10227c4c29dc)
*
* By marking the type parameter T as out, you enforce the following constraints:
* T can only be used in 'out' positions: This means the type T can only appear as:
*   - Return types of methods
*   - Types of read-only properties
*
* T cannot be used in 'in' positions: This means you cannot have:
*   - T as a method parameter type
*   - T as a type of a mutable property
* */
fun main() {
// basics()
//    genericOut()
    val strProcess: GenericIn<String> = GenericIn()
    strProcess.consume("yesMan")

    val processAny: GenericIn<Any> = GenericIn()
    processAny.consume(23)
    processAny.consume("aman")


    //todo: where clause
    //          where clause in Kotlin allows us to specify multiple constraints on generic types
}
class GenericIn<in T>{
    fun consume(item: T){
        println("performing...logic...${item.toString()}")
    }
}

interface Consumer<in T>{
    fun consume(item: T)
}
private fun genericOut() {
    val createStr: GenericOut<String> = GenericOut("kotlin")
    val createInt: GenericOut<Int> = GenericOut(33)
    println(createStr.produce())
    println(createInt.produce())
}

class GenericOut<out T>(private val item: T){    // does here using out keyword mean that the T generic class could only be returned
    fun produce(): T = item
}
interface Produce<out T>{
    fun produce(): T
}

private fun basics() {
    val test_str: GenericBox<String> = GenericBox("hello str")
    val test_int = GenericBox(12)

    println("test_str: ${test_str.value}, test_int: ${test_int.value}")
}

class GenericBox<T>(val value: T)
