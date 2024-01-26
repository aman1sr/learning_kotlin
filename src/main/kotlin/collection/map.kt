package collection

/*
* map function is used to transform each element of a collection into another form based on the provided transformation function.
* fun <T, R> Iterable<T>.map(transform: (T) -> R): List<R>
        * <T>: Represents the type of the elements in the original collection.
        * <R>: Represents the type of the elements in the resulting collection.
        * Iterable<T>: Refers to the original collection on which the map function is called.
        * List<R>: Represents the resulting collection after applying the transformation function to each element of the original collection.
*
* */

private val EZPassAccoutns: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 220, 3 to 330)
private val EZPassReport : Map<Int, Int> = EZPassAccoutns
val number = listOf<Int>(9,4,13,12,3)


data class Person(val name: String, val age: Int)
val people = listOf(Person("Alice", 25), Person("Bob", 30), Person("Charlie", 35))

val fruits = listOf("apple", "banana", "cherry")

val names = listOf("Alice", "Bob", "Charlie")


fun main() {


}
fun accountReport() {
    println("report:::")
    EZPassReport.forEach{
            k,v -> println("ID: $k , credit: $v")
    }
}
fun mapTransformation1(){
    val trans = number.map { it*it }        // doubling all the numbers
    println(trans)
}
fun mapTransformation2() {
    val trans = fruits.map { it.toUpperCase() }
    println(trans)
}
fun mapTransformation3() {
//    val trans = names.map { it.length }
    val trans = names.map { "$it len = ${it.length}" }
    println(trans)
}
fun mapTransformation4() {
    val trans = people.map { it.name }
    println(trans)
}
