package collection

/*
*
* flatMap in Kotlin is a powerful function used to transform and flatten collections.
*   It applies a transformation to each element of a collection and returns a single, flattened collection containing the results.
*
* It's similar to map but instead of returning a single element for each original element, it returns an Iterable.
*
*  fun <T, R> Collection<T>.flatMap(transform: (T) -> Iterable<R>): Collection<R>
        T: The type of elements in the original collection.
        R: The type of elements in the resulting flattened collection.
        transform: A lambda function that takes an element from the original collection and returns an Iterable of elements of type R.
*
*
* */

// Extracting characters from strings:
fun extractCharFromStr() {
    val words = listOf("Apple", "Bananan", "Orange")
    val letters = words.flatMap { words -> words.toList() }
    val uniqueListetters = words.flatMap { words -> words.toSet() }
    println(letters)
    println(uniqueListetters)
}


// todo: Combining user IDs and their corresponding names:
fun flatmapCombining() {
    val userIds = listOf(1, 2, 3)
    val names = mapOf(1 to "Alice", 2 to "Bob", 3 to "Charlie")
    val userNames = userIds.flatMap { id -> names.get(id)?.let { listOf(it) } ?: emptyList() }
    println(userNames) // Output: [Alice, Bob, Charlie]
}

// todo: Parsing lines of text and extracting numerical values:
fun flatmapParsingLines() {
    val text = """
Line 1: 10 apples
Line 2: 20 bananas
Line 3: 30 oranges
"""
    val values = text.lines()
        .flatMap { line -> line.split(" ").filter { it.matches(Regex("\\d+")) }.map { it.toInt() } }
    println(values) // Output: [10, 20, 30]
}