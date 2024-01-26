package collection
/*  todo:
* "distinct" refers to the act of removing duplicate elements from a collection while preserving the order of the remaining elements
* distinct and distinctBy keep the original order of elements.
* distinctBy >>  allows you to specify a custom selector function to determine equality. The selector function returns a key for each element, and elements with the same key are considered duplicates
*
*/


fun findDistantNumber() {
    val numbers = listOf(1, 2, 1, 3, 4, 2)
    val distinctNumbers = numbers.asSequence().distinct().toList()
    println(distinctNumbers) // Output: [1, 2, 3, 4]
}

data class User(val id: Int, val name : String)
fun findDistantByCollection(){
    val users = listOf(User(1, "Alice"), User(2, "Bob"), User(1, "Charlie"))
    val distinctUsers = users.asSequence().distinctBy { it.id }.toList()
    println(distinctUsers) // Output: [User(id=1, name=Alice), User(id=2, name=Bob)]
}


