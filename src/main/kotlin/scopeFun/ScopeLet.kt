package scopeFun

import FirstHead.name

/*
*  let block is a non-assignment statement, it is by default a return statement.
*  it is a "non-assignment statement" means that it doesn't change the original object but instead returns the result of the block
*
* Adv:
*   - easily helps in providing null checks
*   -
* */


private fun performRunOperation() {
    val name = Person().name?.run {
        "The name of the Person is: $this"
    }
    print(name)
}

fun main() {
val person = Person()?.let {
    it.name
}
    println(person)

    val str = "Hello, world!"
    val len = str.let { it.length }
    print(len)

}