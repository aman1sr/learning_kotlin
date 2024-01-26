package collection

/*
* split() function is used to split a string into multiple parts based on a delimiter and returns an array of substrings.
*       To access the individual elements after splitting the string, you need to use the indexing operator []
*
* Parameters:
        delimiters - One or more strings to be used as delimiters.
        ignoreCase - true to ignore character case when matching a delimiter. By default false.
        limit -The maximum number of substrings to return. Zero by default means no limit is set.

* Syntax:
        fun CharSequence.split(
                    vararg delimiters: String,
                    ignoreCase: Boolean = false,
                    limit: Int = 0
                                ): List<String>
* */


 fun testSplitBasics() {
    val str = "Hello,World"
    val str2 = "Apple;Banana;Cherry"

    val part = str.split(",")           // returing a List<String>
    val part2: List<String> = str2.split(";")

    println("part1 = $part")
    println("part2 = $part2")
    println("part2 array, 1st element= ${part2[0]}")

}