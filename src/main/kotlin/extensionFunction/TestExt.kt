package extensionFunction

fun main() {
    val list = mutableListOf(1, 2, 3)
    list.swapList(0,2)
    println(list)
}

fun MutableList<Int>.swapList(index1: Int, index2: Int) {
    val tmp = this[index1]          // NOTE: the this keyword in your extension function is a powerful mechanism that gives you direct access to the object on which the function was called, allowing you to modify its elements as needed.
    this[index1]= this[index2]
    this[index2]  = tmp
}