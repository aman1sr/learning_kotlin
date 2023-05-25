package collection

/*
*  first() function in Kotlin is commonly used with collections like lists, arrays, or sequences
*           to retrieve the first element of the collection.
*
* */

val list = listOf<Int>(1,2,3,4,5)
val str = "Hello, World!"
val range = 1..10
val blankList : List<Int>? = null

val array2D = arrayOf(                  // 2d array
    intArrayOf(1, 2, 3),
    intArrayOf(4, 5, 6),
    intArrayOf(7, 8, 9)
)
fun main() {
val firstElement = list.first()
    val firstChar = list.first()
    val firstElementOrNull = blankList?.firstOrNull()
    val firstRow = array2D.first()

    println("$firstElement, " +
            "$firstChar, " +
            "range First Element = ${range.first}\n" +
            "check_NullOrNot= ${firstElementOrNull}\n" +
            " First row of 2D array = ${firstRow.contentToString()}\n" +        // printing only firstRow gives -> [I@5197848c
            ""

    )


}