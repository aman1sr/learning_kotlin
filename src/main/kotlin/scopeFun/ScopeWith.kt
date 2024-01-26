package scopeFun
/*
* The context object is available as a receiver (this).
* The return value is the lambda result.
*
* performing a null check using a “ with ” operator is difficult and this is where we can replace it with “ run ”
* */

fun performOperationWith(): String{
   val str =  with(Person()){
        return@with "name is ${this.name}"
    }
    return str
}
fun main() {
println(performOperationWith())
}