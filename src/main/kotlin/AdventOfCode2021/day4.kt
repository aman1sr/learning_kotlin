package AdventOfCode2021
/*
*
*
* */
private val arrTest : Array<Array<Int>> = arrayOf(
    arrayOf(1,4,2),
    arrayOf(3,2,7),
    arrayOf(1,8,3),
    )
private var count =0
fun main() {

    val isHurray = checkMatrix(2, 7, 3)
//    println(" the matrix $isHurray")

}


fun checkMatrix(i: Int, i1: Int, i2: Int): Boolean {
    for (i in 0..2) {
        for (j in 0..2) {
            if (i == arrTest[i][j] || i1 == arrTest[i][j] || i2 == arrTest[i][j]) {
                count++
            }
        }
    }

    if (count ==3) return true else return false

}

