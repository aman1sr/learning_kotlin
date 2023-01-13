package AdventOfCode2021

import AdventOfCode2021.Utils.Companion.readInput
import java.io.File
import kotlin.system.exitProcess

fun main() {


//    var input = readNavigationInputs("input2")
    var input = readInput("input2.2")

/* My way of getting ANS */
//    println(findTheNavP2(input))
//    println(findTheNav(input))

/* Sir's way  */
    println(findTheNavSir(input))


}

fun findTheNavSir(input: List<String>): Int {
    var depth =0
    var horizontalPosition = 0
    val operations = input.map { it.split(' ') }

    for ((direction, amount) in operations) {
        val amount = amount.toInt()
        when (direction) {
            "up" -> depth-=amount
            "down" -> depth+=amount
            "forward" -> horizontalPosition+=amount
        }

    }

    return depth*horizontalPosition
}

fun findTheNavP2(input: List<String>): Int {
    var horizontalPos = 0
    var finalDepth = 0
    var aim = 0

    for (i in 0..input.size - 1) {
        val item = input.get(i)

        val words = item.split("\\s".toRegex()).toTypedArray()
        val direction = words[0]   // the direction
        val x = words[1].toInt()   // the qty

        if (direction.equals("forward")) {
            horizontalPos = horizontalPos + x
            finalDepth = finalDepth + aim * x
        } else if (direction.equals("down")) {
            aim = aim + x
        } else if (direction.equals("up")) {
            aim = aim - x
        } else {
            println("invalid input")
            exitProcess(1)
        }
        print("")
    }

    return horizontalPos * finalDepth

}

fun findTheNav(input: List<String>): Int {
    var forward = 0
    var depth = 0

    for (i in 0..input.size - 1) {
        val item = input.get(i)

        val words = item.split("\\s".toRegex()).toTypedArray()
        val i1 = words[0]   // the direction
        val i2 = words[1].toInt()   // the qty

        if (i1.equals("forward")) {
            forward = forward + i2
        } else if (i1.equals("down")) {
            depth = depth + i2
        } else if (i1.equals("up")) {
            depth = depth - i2
        } else {
            println("invalid input")
            exitProcess(1)
        }


    }

    return forward * depth

}
