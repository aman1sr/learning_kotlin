package adventOfCode2021

import java.io.File

class Utils {

    companion object{
        fun readInput(name: String) = File("src", "$name.txt").readLines().map { it.toString() }
    }
}