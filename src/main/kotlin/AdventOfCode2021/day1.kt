package AdventOfCode2021

import java.io.BufferedReader
import java.io.File
import java.io.InputStream

/* to find :  measurements are larger than the previous measurement */


fun main() {

    fun readInputAsInts(name: String) = File("src","$name.txt").readLines().map { it.toInt() }
    fun calculating(list: List<Int>): Int{
        return list.windowed(2).count { (a,b) -> b>a }
    }

    fun myConventionalAns(list: List<Int>): Int {
        var count =0

        for (i in 0..list.size-4) {
           var i1 = list.get(i)
            var i2 = list.get(i+1)
            var i3 = list.get(i+2)
            var i4 = list.get(i+3)

            if ((i1 + i2 + i3) < (i2 + i3 + i4)) {
                count++
            }
        }

        return count
    }

    /*
    * (A+B+C <=> B+C+D)   is same as : A <=> D
    * */
    fun realKotlinStuff(list: List<Int>): Int {
        return list.windowed(3).count { it[0]< it[3] }

    }

    fun calculating2(list: List<Int>): Int{

//        return myConventionalAns(list)
        return realKotlinStuff(list)
    }

    val input = readInputAsInts("input1")
    val input2 = readInputAsInts("input1.1")
//    val result = input.windowed(2).count { (a,b) -> a<b }
//    println(calculating(input))

    println(calculating2(input2))


    /*
  val bufferReader : BufferedReader = File("D:\\AmanSingh\\kotlin\\kotlin_learning\\src\\main\\resources\\input1.txt").bufferedReader()
  val  lineList = mutableListOf<String>()
    bufferReader.useLines { lines -> lines.forEach { lineList.add(it) } }
//    println(lineList)
    val inputIntList = mutableListOf<Int>()

        lineList.forEach {
           inputIntList.add(it.toInt())
             }
    println(inputIntList.size)

    val testInput = mutableListOf<Int>()
    testInput.addAll(listOf(12, 2, 13, 14, 22))
    println(testInput)

    var count =0
    for (i in 0..inputIntList.size - 2) {
        val a = inputIntList.get(i)
        val b = inputIntList.get(i + 1)
        if (b > a)
            count++
    }
print(count)
*/
}