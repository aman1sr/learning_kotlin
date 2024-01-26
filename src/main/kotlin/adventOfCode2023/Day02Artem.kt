package adventOfCode2023

import kotlin.math.max

/*
* groupValues:
* after a successful match, you can access the captured groups using the groupValues property of the match object.
*   groupValues[0] will contain the entire matched string ("Game 7" in our case).
*   groupValues[1] will contain only the captured group, which is the matched digits ("7" in this case).   (here, groupValues[1] is like accessing the "fins" of the fish, which is the extracted number)
*
* .none{}:
*       Returns true if no elements match the given predicate
*
*toRegex ;
*    to convert the string "Game (\\d)" into a regular expression object.
*
*/

data class Set(val red: Int, val green: Int, val blue: Int)
data class Game(val id: Int, val sets: List<Set>)

fun artemSol(input: List<String>): Int {
            val expectedRed = 12
            val expectedGreen = 13
            val expectedBlue = 14

            return parse(input).filter {
                it.sets.none {
                    it.red > expectedRed || it.green > expectedGreen || it.blue > expectedBlue
                }
            }.sumOf { it.id }
        }

private fun parse(input: List<String>) =
    input.map {  // it =  Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green   (like wise will loop till End of Game)...Game100
        val (game, sets) = it.split(":")
        // here sets =  3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
        //       game = Game 1
        val id = "Game (\\d+)".toRegex().find(game)!!.groupValues[1].toInt()      // extract id from GAME 1: eg 1,2,3...

        sets.split(";").map {           //  after split action: it gives an ArrayList of size 3 , where looping on every iteration we calc RED,GREEN,BLUE  & store it in Set data class
            val red = "(\\d+) red".toRegex().find(it)?.groupValues?.get(1)?.toInt() ?: 0
            val green = "(\\d+) green".toRegex().find(it)?.groupValues?.get(1)?.toInt() ?: 0
            val blue = "(\\d+) blue".toRegex().find(it)?.groupValues?.get(1)?.toInt() ?: 0

            Set(red, green, blue)    // in loop storing  R,G,B of 1st  here:  (4,0,3)  => (4red, 0blue, 3green)
        }.let {
            Game(id, it)            // after looping all GAMES 1...100 passes the result of DataClass Game to be filtered in artemSol()
        }
    }

fun artemPart2(input: List<String>): Int{
    return parse(input).map {
        var maxRed =0
        var maxGreen = 0
        var maxBlue = 0
        it.sets.forEach {
            maxRed = max(maxRed, it.red)
            maxGreen = max(maxGreen, it.green)
            maxBlue = max(maxBlue, it.blue)
        }
        maxRed*maxGreen*maxBlue
    }.sumOf { it }
}




