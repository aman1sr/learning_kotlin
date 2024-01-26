package adventOfCode2023

import collection.str
import readAOCInput
import java.io.File

/*
*
* NOTE: we are allowed to write an UpperCase f() , if it has same DataClass name Eg here: {CubeSet & SebGame}
*
* */
val RED_TOTAL = 12
val GREEN_TOTAL = 13
val BLUE_TOTAL = 14

fun main() {
    solvePart1()
    solvePart2()
}
/*
* In game 1, three sets of cubes are revealed from the bag (and then put back again). The first set is 3 blue cubes and 4 red cubes; the second set is 1 red cube, 2 green cubes, and 6 blue cubes; the third set is only 2 green cubes.
* The Elf would first like to know which games would have been possible if the bag contained only 12 red cubes, 13 green cubes, and 14 blue cubes?
* In the example above, games 1, 2, and 5 would have been possible if the bag had been loaded with that configuration. However, game 3 would have been impossible because at one point the Elf showed you 20 red cubes at once; similarly, game 4 would also have been impossible because the Elf showed you 15 blue cubes at once. If you add up the IDs of the games that would have been possible, you get 8.
* Determine which games would have been possible if the bag had been loaded with only 12 red cubes, 13 green cubes, and 14 blue cubes. What is the sum of the IDs of those games?
* */
private fun solvePart1() {
//    val input = readAOCInput("input_day02_test")                // AOC test input
    val input = readAOCInput("input_day02")                // AOC input

//    println(myElvSolution(input))
    println(artemSol(input))
//    println(semSol())         //  todo: giving 0 ans

}
private fun solvePart2(){
//        val input = readAOCInput("input_day02.2_test")                // AOC test input
    val input = readAOCInput("input_day02.2")                // AOC input
    println(artemPart2(input))
}



/*
* my concept: group the game on basics of sets ,
* which start from : & end with ;
* in a set we have to compare individual Color countings on basis of , (comma)
* if condition matches of all color in a set, return the summation of game ID
* */
fun myElvSolution(input: List<String>): Int {
//    val gameId = line.substringBefore(':').last()
//    val gameCondition = line.substringAfter(':')
//
//return input.sumOf { line -> String
//
    return 0
}
