package adventOfCode2023

import collection.list
import kotlin.collections.Set

/*
* youtube(https://www.youtube.com/watch?v=M9GvClhYkx4)
* mapIndexed:
* windowed : Returns a list of snapshots of the window of the given size sliding along this collection with the given step, where each snapshot is a list.
Several last lists may have fewer elements than the given size.
* */
typealias SchematicRow = List<Element>

val number : Int = 1
val expectedPart1Test : Long = 4361L
var useTestData = true
val debug  = true
sealed class Element
data class Number(val value: Int, val xRange: IntRange, val row: Int) : Element() {     // 26:30 >> why row field added , becuase set equals methods workds diff
    val expendedColumn = xRange.first -1 .. xRange.last + 1
    val expendedRow = row-1..row+1
}
data class Symbol(val value: Char, val column: Int, val row: Int) : Element()

fun Number(number: String, start: Int, end: Int, row: Int): Number = Number(number.toInt(), start..end, row)


fun day3miaiaPart1(input:List<String>) : Long{
    val engineSchematic : List<SchematicRow> = input.mapIndexed{ i, s -> extractElements(s,i) }         // mapIndexed: Returns a list containing the results of applying the given transform function to each element and its index in the original collection
    return engineSchematic
        .findParts()
        .sumOf { it.value }
        .toLong()
}
fun day3miaiaPart2(input:List<String>) : Long{
    val engineSchematic : List<SchematicRow> = input.mapIndexed{ i, s -> extractElements(s,i) }         // mapIndexed: Returns a list containing the results of applying the given transform function to each element and its index in the original collection
    return engineSchematic
//        .myfindGearRatio()
//        .sumOf { it.value }
        .flatten()
        .findGearParts()
        .sumOf { it.first * it.second}
        .toLong()
}

private fun extractElements(input: String, row: Int):List<Element> = buildList {
    var numberStart = -1
    var currentNumber = ""
    for((index,c) in input.withIndex()){
        when{
            (c.isDigit()) -> {
                currentNumber +=c
                if(numberStart == -1) numberStart = index
            }
            else -> {
                if( c != '.') this.add(Symbol(value = c, column = index, row = row))
                if (currentNumber.isNotEmpty()) {
                    this.add(Number(currentNumber, numberStart, index - 1, row))
                    currentNumber = ""
                    numberStart = -1
                }
            }
        }
    }
    if (currentNumber.isNotEmpty()) {
        this.add(Number(currentNumber,numberStart,input.length-1,row))
    }
}
private fun List <SchematicRow>.findParts(): Set<Number>{
    val parts = mutableSetOf<Number>()
    this.windowed(2).map { twoRows ->               // 24:30 >> working of extracting numbers adjacent to a symbol
        val symbols: List<Symbol> = twoRows.flatten().filterIsInstance<Symbol>()
        val numbers: List<Number> = twoRows.flatten().filterIsInstance<Number>()

        numbers.filter { n ->
            symbols.any { s ->
                s.column in n.expendedColumn
            }
        }.forEach { parts.add(it) }
    }
    return parts
}
private fun List<Element>.findGearParts(): List<Pair<Int, Int>> {
    val parts = this.filterIsInstance<Number>()
    val potentialGears = this.filterIsInstance<Symbol>().filter { it.value == '*' }

    return potentialGears
        .map { s ->
            parts.filter { (s.row in it.expendedRow) && (s.column in it.expendedColumn) }
        }
        .filter {
                it.size == 2
                }
        .map {
            it[0].value to it[1].value
        }

}

private fun List<SchematicRow>.myfindGearRatio(): Int {     // to return set of Pair Numbers, later sum the first & 2nd
    val parts = mutableSetOf<Number>()
    this.windowed(3).map { threeRows ->
        val symbols: List<Symbol> = threeRows.flatten().filterIsInstance<Symbol>()
        val numbers: List<Number> = threeRows.flatten().filterIsInstance<Number>()

        numbers.windowed(2).filter { list ->
            symbols.any { s ->
                s.column in list.first().expendedColumn && s.column in list.last().expendedColumn
            }
        }.forEach {
            println("list 1= ${list.first()}, list 2= ${list.last()}")
        }

    }
return 0
}

