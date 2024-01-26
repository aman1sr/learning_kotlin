/*
  P1 ans uses:
* .sumOf{}
* .first{}
* .last{}
* .isDigit()


  P2 ans uses:
* enum
* digitToIntOrNull()
* .subString()    .startWith()
*
* mapof()  mapIndexedNorNull{}
* .possibleWordsAt()
* .firstNotNullOfOrNull{}
* .coerceAtMost()
* */

fun main() {
    solvePart1()
//    solvePart2()
}

val digitMap = hashMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4,
    "five" to 5, "six" to 6, "seven" to 7, "eight" to 8, "nine" to 9)

/*
*  It looks like some of the digits are actually spelled out with letters: one, two, three, four, five, six, seven, eight, and nine also count as valid "digits".
*    find the real first and last digit on each line
* */
fun solvePart2() {
//    val input = readInput("input_day01.2_test")         // test INPUT
    val input = readAOCInput("input_day01.2")         // AOC INPUT

    //MyAns
//    println(myCalibrationSum(input))

    // sebAns
    println(sebCalibertionSum(input))

    // toddAns
//    println(todCalibertionSum(input))
}

private val wordsMap : Map<String,Int> = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5, "six" to 6, "seven" to 7, "eight" to 8, "nine" to 9)

fun todCalibertionSum(input: List<String>): Int =
input.sumOf { row ->
    calibrationValue(
        // run through each character and tun it into a digit or a null
        // and then map each of them to a string. In theory we could take
        // and 1st & last digit from the resulting list instead of joining

        row.mapIndexedNotNull { index: Int, c: Char ->
            // if it is a  digit thake it as is
            if (c.isDigit()) c
            else
                // otherwise, see if this the start of a word and if so map to the digit that it represent
                row.possibleWordsAt(index).firstNotNullOfOrNull { candidate ->
                    wordsMap[candidate]
                }
        }.joinToString()
    )
}



private fun String.possibleWordsAt(startingAt: Int): List<String> =
    (3..5).map { len ->
        substring(startingAt,(startingAt+len).coerceAtMost(length))
    }



enum class StartFrom{BEGINNING, END}
val words = listOf("one","two","three","four","five","six","seven","eight","nine")

fun sebCalibertionSum(lines: List<String>): Int {
    return lines.sumOf {
        line: String ->
        getNumber(line,StartFrom.BEGINNING)*10 + getNumber(line,StartFrom.END)
    }
}

fun getNumber(line: String, startFrom: StartFrom): Int {
    val indices = when (startFrom) {
        StartFrom.BEGINNING -> line.indices
        StartFrom.END -> line.lastIndex downTo 0
    }

    for (idx in indices) {
        line[idx].digitToIntOrNull()?.let { return it }
        for ((wordIndex,word) in words.withIndex()){
            if (line.substring(idx).startsWith(word)) {
                return (wordIndex+1)
            }
        }
    }
    error("Unreachable")
}

fun myCalibrationSum(input: List<String>): Int {
    return input.sumOf { calculateSum(it) }
}

fun calculateSum(element: String) : Int {
    var updateStr = element
    for (keys in digitMap.keys) {

        if (element.contains(keys)) {
            updateStr =  updateStr.replace(keys,digitMap[keys].toString())
            println(updateStr)
        }
    }
// todo: getting error>> "eightwothree" = eigh23
    return "${updateStr.first()}${updateStr.last()}".toInt()
}

/*
*  On each line, the calibration value can be found by combining the first digit and the last digit (in that order) to form a single two-digit number
* */
private fun solvePart1() {
    //    val input = readInput("input_day01_test")         // test INPUT
    val input = readAOCInput("input_day01")                // AOC input

    // My Ans
/*    part1(input).println()
    val result1 = sumOfAllCalibrationValues(input)
    println("result1 = $result1")*/

    // Todd Ans
//    println(toddSolvePart1(input))

    //Seb Ans
    println(sebSolvePart1(input))
}

fun sebSolvePart1(lines: List<String>): Int {
return lines.sumOf { line: String ->
    line.first { it.isDigit() }.digitToInt()*10 + line.last { it.isDigit() }.digitToInt()
}
}

fun toddSolvePart1(input: List<String>): Int {
    return input.sumOf { calibrationValue(it) }
}

fun calibrationValue(row: String): Int {
    val firstDigit = row.first { it.isDigit() }
    val lastDigit = row.last { it.isDigit() }
    return "$firstDigit$lastDigit".toInt()
}


/*
* On each line, the calibration value can be found by combining the first digit and the last digit (in that order) to form a single two-digit number
* */
fun sumOfAllCalibrationValues(list: List<String>): Int {
    var result : Int = 0
    for (str in list) {
        var strNum : String = ""
       for(i in 0..str.length-1){
           if (str.get(i).isDigit()) {
               if (strNum.length == 2) {
                   strNum = strNum.substring(0, 1) + str.get(i)
               } else {
                   strNum = strNum+str.get(i).toString()
               }
           }
        }
        //  check if only single 7 is there make > 77
        if (strNum.length == 1) {
            strNum = strNum+strNum
        }
        println("strNum = $strNum")
        result += strNum.toInt()
    }

    return result
}

fun part1(input: List<String>): Int {
    return input.size
}

fun part2(input: List<String>): Int {
    return input.size
}