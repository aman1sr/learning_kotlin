package adventOfCode2023

import readAOCInput

enum class Color(val text: String){
    RED("red"),
    GREEN("green"),
    BLUE("blue"),
}


data class SebGame(
    val gameId: Int,
    val moveSet: List<CubeSet>
)

data class CubeSet(
    val red: Int,
    val green: Int,
    val blue: Int
)

val lines = readAOCInput("input_day02")
val games = lines.map { SebGame(it) }

fun semSol(): Int {
    val availableReds = 12
    val availableGreens = 13
    val availableBlues = 14

    val idSum = games
        .filter { it.isPossible(availableReds, availableGreens, availableBlues) }
        .sumOf { it.gameId }
    return idSum
}



fun CubeSet(string: String): CubeSet{
    val individualCubes = string
        .split(", ")
        .associate { numberToColorText : String ->
            // eg "7 green"
            val (countStr, colorName) = numberToColorText.split(" ")
            val color = Color.values().firstOrNull {   it.text == colorName }      // since kotlin 1.9.0 releses entries instead values
            val count = countStr.toInt()
            color to count      // we return pair of key & value
        }
    return CubeSet(
        individualCubes[Color.RED] ?: 0,
        individualCubes[Color.GREEN] ?: 0,
        individualCubes[Color.BLUE] ?: 0
    )
}
fun SebGame.isPossible(avaibleReds: Int, availableGreens: Int, availableBlues: Int): Boolean{
    return moveSet.all {
        it.red < avaibleReds && it.green < availableGreens && availableBlues < availableBlues
    }
}

fun SebGame(line: String): SebGame {
    val gameId = line.removePrefix("Game ").takeWhile { it.isDigit() }.toInt()
    val allVisibleCubeText = line.dropWhile { it != ':' }.removePrefix(": ")
    val cubeSets = allVisibleCubeText
        .split(";")
        .map { CubeSet(it.trim()) }

    return SebGame(gameId,cubeSets)
}
