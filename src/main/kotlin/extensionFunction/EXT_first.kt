package extensionFunction

import Utils
import jdk.jshell.execution.Util

/*
* The first() function returns the first element of the collection or sequence.
*       If the collection is empty, it throws a NoSuchElementException.
*
* SYNTAX:  fun <T> Iterable<T>.first(): T
*
* */

//???
val firstOrNull2 = Utils.numbersNegToPosSeries.firstNotNullOfOrNull {
    it % 2 == 0
}

//  to retrieve the first element that satisfies a condition or provide a default value if no such element is found,
//  you can use the firstOrNull() function instead. It returns null if no matching element is found( here eg, when series has only odd numbers)
val firstOrNull = Utils.numbersNegToPosSeries.firstOrNull {
    it % 2 == 0
}

// it provide a lambda predicate as an argument to first()
val firstNo = Utils.numbersNegToPosSeries.first {
    it % 2 == 0
}

val firstNoGreaterZero = Utils.numbersNegToPosSeries.first {
    it >0
}

fun main() {
    println(firstNoGreaterZero)
//    println(Utils.numbersSeries.first())
//    println(firstNo)
//    println(firstOrNull)
//    println(firstOrNull2)


}
