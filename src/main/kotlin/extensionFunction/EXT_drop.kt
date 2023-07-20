package extensionFunction

import Utils

/*
* The drop() function returns a new list containing all elements except the first N elements.
*      If the collection size is smaller than N, an empty list is returned.
*
* fun <T> Iterable<T>.drop(n: Int): List<T>
* */

val dropNumber = Utils.numbersSeries.drop(2)

//  it converts the List into a Sequence before applying the drop() function. Using a Sequence can have performance benefits in some cases because
//  it enables lazy evaluation, meaning elements are computed on-demand and not all at once.
val dropNumberSequeced = Utils.numbersSeries.asSequence().drop(2)

fun main() {

//    println(dropNumber)

    for (no in dropNumberSequeced) {
        println(no)
    }


}