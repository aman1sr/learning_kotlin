package adventOfCode2023

fun solveDay4Seb(list: List<String>): Int{
  val output =  list.map { line ->
        val (_, winningNumberText, ourNumberText) = line.split(":", "|")        // beautiful way of splitting input
        val winningNumber = winningNumberText.split(" ").filter { it.isNotBlank() }.map { it.toInt() } // creative way of converting "41 48 83 86 17" -> ArrayList
        val ourNumber = ourNumberText.split(" ").filter { it.isNotBlank() }.map { it.toInt() }
        winningNumber to ourNumber      // creating a pair  , used for further processing
    }.map { (winningNumber,ourNumber) ->        //  map{} using pair for counting list1 element in list2
        val count = winningNumber.count { it in ourNumber }             // good way of counting presence of winningNumbers in ourNumbers List
        if(count ==0) 0 else 1.shl(count-1)         // 1.shl(count - 1) = 2 raised to the power of (count - 1)
    }
//        .onEach { println(it) }
//        .onEach (::println)
        .sum()
        .also { println(it) }

    return output
}
data class SebCard(val winningNumbers: List<Int>, val ourNumbers: List<Int>)
fun solveDay4Part2(list:List<String>): Int{
    val output = list.map { line ->
        val (_, winningNumberText, ourNumberText) = line.split(":", "|")
        val winningNumbers = winningNumberText.split(" ").filter { it.isNotBlank() }.map { it.toInt() }
        val ourNumbers = ourNumberText.split(" ").filter { it.isNotBlank() }.map { it.toInt() }
        val count = winningNumbers.count { it in ourNumbers }
        SebCard(winningNumbers, ourNumbers) to count// This line creates a pair of SebCard and the count of matches.
    }.let { pairs ->
        val countByCard = MutableList(pairs.size) { 1 }     // initializes a mutable list called countByCard with the same size as the pairs list. Each element in the countByCard list is initialized to 1.
        pairs.mapIndexed { index: Int, (_, count) ->        // mapIndexed function is similar to the map function, but it also provides the index of the element as a second parameter to the lambda function.
            (1..count).forEach {
                countByCard[index + it] += countByCard[index]
            }
        }
        countByCard
    }
//        .onEach(::println)
        .sum()
        .also(::println)

    return output
}