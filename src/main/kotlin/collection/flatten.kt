package collection

/*
* it process  a nested collection and transforming it into a single, one-dimensional collection.
* NOTE:
* flatMap: This function allows you to apply a transformation to each element of the collection before flattening.
* */
val nestedList = listOf(listOf(1, 2), listOf(3, 4), listOf(5, 6))

fun flattenTransformation() {
    val flattenedList = nestedList.flatten()
    println(flattenedList) // Output: [1, 2, 3, 4, 5, 6]
}

fun flatmapTransformation() {
    val flattenedList = nestedList.flatMap { innerList -> innerList.map { it * 2 } }
    println(flattenedList) // Output: [2, 4, 6, 8, 10, 12]
}


//------------------------------else old convention ways----------------------------------

fun foreachTransformation() {
    val flattenedList = mutableListOf<Int>()
    nestedList.forEach { innerList ->
        innerList.forEach { element ->
            flattenedList.add(element)
        }
    }
    println(flattenedList) // Output: [1, 2, 3, 4, 5, 6]
}
fun nestedLoopTransformation() {
    val nestedList = listOf(listOf(1, 2), listOf(3, 4), listOf(5, 6))
    val flattenedList = mutableListOf<Int>()
    for (outerList in nestedList) {
        for (element in outerList) {
            flattenedList.add(element)
        }
    }
    println(flattenedList) // Output: [1, 2, 3, 4, 5, 6]

}


