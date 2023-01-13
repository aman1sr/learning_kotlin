package AdventOfCode2021

private data class BitCount(val zeros: Int, val ones: Int)
fun main() {

/*
* BINARY -> DECIMAL:
* println("11001".toInt(2))
*
* ONE'S COMPLEMENT:
*
*
* */

//    var input = Utils.readInput("input3")
    var input = Utils.readInput("input3.2_test")

//println(powerConsuption(input))
//println(SirPart1(input))

}

fun SirPart1(input: List<String>): Int {
    val columns = input[0].indices      // return >> 0..11  ( for the input3.txt)
    val gammaRate = buildString {   //
        for (column in columns) {
            val (zeroes,ones) = input.countBitsInColumn(column)
//            input.checkBitsCount(column)    // (test) way of sending -- List of input & Int parameter

        val commonBit = if (zeroes > ones) "0" else "1"
            append(commonBit)
        }
    }
    val epsilonRate = gammaRate.invertBinaryString()
    return gammaRate.toInt(2)*epsilonRate.toInt(2)
}

private fun String.invertBinaryString() = this
    .asIterable()
    .joinToString (""){ if (it =='0' ) "1" else "0"}


private fun List<String>.countBitsInColumn(column: Int): BitCount{
    var zeros = 0
    var ones = 0
    for (line in this) {
        if (line[column] == '0') zeros++ else ones++
    }
    return BitCount(zeros, ones)
}

private fun List<String>.checkBitsCount(column:Int){
    for (line in this) {        // here , this is the list of Inputs we
        println(line[column])   // gives the list of  nth column, bits
//        println(line[0])          // eg, give the list of 1st bits of input.txt
    }
}

fun powerConsuption(input: List<String>): Any? {

    val binarySize = input.get(0).length        // to get the number of bits in an INPUT

//    var arr= IntArray(size-1)       // to store the result
        val arrayList = ArrayList<String>()

    for (i in 0..binarySize - 1) {
        var count = input.groupingBy { it[i] == '1' }.eachCount()

        if (count.get(true) != null && count.get(false) != null) {
            if (count.get(true)!! > count.get(false)!!) {
                arrayList.add("1")
            } else {
                arrayList.add("0")
            }
        } else {
            if (count.get(true) == null)
                arrayList.add("0")
            else
                arrayList.add("1")
        }

    }
    var gammaStr = ""
    var totalBinaryCount = ""
    for (i in 0 .. arrayList.size-1) {
        gammaStr = gammaStr+ arrayList.get(i).toString()
        totalBinaryCount = totalBinaryCount + "1"

    }
    val gammaStuff = gammaStr.toInt(2)
    println("gammaStuff: "+gammaStuff)
    val deltaStuff = totalBinaryCount.toInt(2) - gammaStuff

    return gammaStuff*deltaStuff
}
