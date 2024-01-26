package scopeFun

import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

fun main() {
    val user = User("Aman")
/*-----------------------------let---------------------------*/
    var name = user.let {
        return@let it.name
    }
    println("testLet: $name")

    val name1 = user.let1 {
        return@let1 it.name
    }
    val name2 = user.let2 {
        return@let2 it.toString()
    }
    println("testLet1: $name1")
    /*-------------------------also---------------------------*/
    val returnedUser = user.also {
        it.name = "Singh"
    }
    println("testalso: $returnedUser")

val returnedUser1 = user.also1 {
        it.name = "Singh"
    }
    println("testalso1: $returnedUser1")

    /*-----------------------------apply-----------------------*/
val returnedUserr = user.apply {
        name = "Aman"
    }
    println("testapply: $returnedUserr")

val returnedUserr2 = user.apply1 {
        name = "Aman"
    }
    println("testapply: $returnedUserr2")

    /*-----------------------------run-----------------------*/
    var namee = user.run {
        return@run "whooHoo"
    }
    println("testrun: $namee")

var namee1 = user.run1 {
        return@run1 "whooHoo1"
    }
    println("testrun: $namee1")


}
data class User(var name: String)
// let
public inline fun <T, R> T.let1(block: (T) -> R): R {
    return block(this)      // whatever return type by this f() will return by let1
}
public inline fun <T, R> T.let2(block: (Int) -> R): R {     // here the block says > take Int & return R , therefore while calling let2 , it is Int
    return block(23)      // whatever return type by this f() will return by let1
}

// also
public inline fun <T> T.also1(block: (T) -> Unit): T {
    block(this)
    return this
}
// apply
public inline fun <T> T.apply1(block: T.() -> Unit): T {        // block is an extension f()
    block()
    return this
}
// run
public inline fun <T, R> T.run1(block: T.() -> R): R {
    return block()
}