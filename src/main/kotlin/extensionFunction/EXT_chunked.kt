package extensionFunction

/*
* The chunked() function divides the original collection into chunks of the specified size,
*       and returns a list of lists, where each inner list represents a chunk.
*       The last chunk may have a smaller size if the original collection size is not divisible by the chunk size.
*
* SYNTAX:     fun <T> Iterable<T>.chunked(size: Int): List<List<T>>

*
* */

val chunk = Utils.numbersSeries.chunked(3)

//  provide a lambda function as a second argument to chunked() to transform the chunks.
val lambdaChunk = Utils.numbersSeries.chunked(3){chunk ->
    chunk.map { it*2 }
}

fun main() {
//    println(chunk)
    println(lambdaChunk)


}