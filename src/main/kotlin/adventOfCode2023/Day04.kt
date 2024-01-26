package adventOfCode2023

import higherOrderFunction.Car
import readAOCInput


data class Card(val cardNo: Int, val winSet: List<Int>, val checkSet: List<Int>)


fun main() {
//    val input = readAOCInput("input_day04")                // AOC input
    val input = readAOCInput("input_day04_test")                // AOC test input

//    println(solvePart1(input))
    println(solveDay4Seb(input))
    println(solveDay4Part2(input))

}


private fun solvePart1(input: List<String>): Int {
   val stuff =  parse(input).findWins()
    println(stuff)          // todo: why not able to print list of winning cards??  [[debug]]

    return 0
}

private fun List<Card>.findWins(): List<Int> {
    return this.flatMap { card ->
        card.winSet.filter { it in card.checkSet }
    }
}

private fun parse(input: List<String>) = input.map {
    val (game, sets) = it.split(":")
    val gameNo = "Card (\\d+)".toRegex().find(game)!!.groupValues[1].toInt()

    val (winSetString, checkSetString) = sets.split("|")
    val winSet = winSetString.trim().split(" ").mapNotNull { it.toInt() }
    val checkSet = checkSetString.trim().split(" ").filterNot { it.isEmpty() }.mapNotNull(String::toIntOrNull)

    Card(gameNo,winSet,checkSet)
}


