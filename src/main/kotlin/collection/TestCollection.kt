package collection

import addStuff
import getList

fun main() {
    /* -------------------flatmap------------------- */
extractCharFromStr()


    /* -------------------windowed------------------- */
//    calcAvgTemp()
//    findPairWords()


    /* -------------------Splits------------------- */
//    testSplitBasics()

    /* -------------------map------------------- */
    //    accountReport()
//    mapTransformation1()

//    mapTransformation2()
//    mapTransformation3()
//    mapTransformation4()

    /* -------------------list------------------- */
//    addStuff(4)
//    println(getList())
    /* -------------------first------------------- */
//testFirst()




}

private fun testFirst() {
    val firstElement = list.first()
    val firstChar = list.first()
    val firstElementOrNull = blankList?.firstOrNull()
    val firstRow = array2D.first()

    println(
        "$firstElement, " +
                "$firstChar, " +
                "range First Element = ${range.first}\n" +
                "check_NullOrNot= ${firstElementOrNull}\n" +
                " First row of 2D array = ${firstRow.contentToString()}\n" +        // printing only firstRow gives -> [I@5197848c
                ""

    )
}
