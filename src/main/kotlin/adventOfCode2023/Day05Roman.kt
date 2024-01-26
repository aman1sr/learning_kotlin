package adventOfCode2023

data class Block(val src: Long, val dst: Long, val length: Long)
data class SeedsMap(val from: String, val to: String, val blocks: List<Block>)

fun day5Part1Sol(input: List<String>): Int{
    val seeds = input[0]
        .substringAfter(":")
        .split(' ')
        .filter { it.isNotBlank() }
        .map { it.toLong() }

    val maps = input.drop(2).fold(mutableListOf(mutableListOf<String>())){acc, string ->
        if (string.isBlank()) {
            acc.add(mutableListOf<String>())
        } else {
            acc.last().add(string)
        }
        acc
    }.map {
        val(from, _, to) = it.first().split('-',' ')
        val blocks = it.drop(1).map {
            val (dst,src,length) = it.split(' ').map { it.toLong() }
            Block(src, dst, length)
        }
        SeedsMap(from, to, blocks)
    }

//    val seedsDF = maps.fold(seeds){acc,map ->
//
//    }

    return 0
}