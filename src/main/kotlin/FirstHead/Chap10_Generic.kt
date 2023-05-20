package FirstHead

import kotlin.reflect.KClass

fun main() {

    /*
    * Generic f()  eg>>
    * */
    var array1 = arrayOf("aman", "raman", "chaman")
    var array2 = arrayOf(2,13,55)
    printArray(array1)
    printArray(array2)


    val catFuzz = Cat("Fuzz Lighyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny Fish")

    /* Contest of only CATS */
    val catContest = Contest<Cat>()
    catContest.addScore(catFuzz, 50)
    catContest.addScore(catFuzz, 55)
    catContest.addScore(catKatsu, 45)
    val topCat = catContest.getWinners().first()
    println("Cat contest winner is:${topCat.name}")     // << test

    /* Contest of PET */
    val petContest = Contest<Pet>()
    petContest.addScore(catFuzz, 50)
    petContest.addScore(fishFinny, 56)
    val topPet = petContest.getWinners().first()
    println("pet Contest Winner is:${topPet.name}")
}

/*
*  how the generic function works:
*       1) The <T> after the fun keyword declares the generic type parameter T.
*               It represents a type that will be determined at the time of function invocation.
*       2) The parameter array: Array<T> indicates that the printArray function expects an array of type T.
*       3) Inside the function, you can use the type parameter T to refer to the type of elements in the array.
*
* NOTE: why we added reified modifier:
*            allows you to use the T::class syntax to access the class of the type parameter T at runtime, without using reified see f() printArray2
* */
private inline fun<reified T> printArray(array: Array<T>) {
    val typeName = T::class.simpleName
    println("============== array Hash: ${array.contentHashCode()}====of type ${typeName} >>>${array.contentToString()}=====================")
    for (element in array) {
        println(element)
    }
}

private fun <T : Any> printArray2(clazz: KClass<T>, array: Array<T>) {  // when NOT using reified modifier, can call this via >> printArray2(Int::class, numbers)
    val typeName = clazz.simpleName
    println("Array of type $typeName: ${array.contentToString()}")
}

abstract class Pet(var name: String)
class Cat(name: String) : Pet(name)
class Dog(name: String): Pet(name)
class Fish(name: String): Pet(name)

/*
*  if we create a Contest<Pet> object, scores type will automatically become MutableMap<Pet, Int>
* but If we create a Contest<Cat> that deals with Cat contestants,
*   the scores property’s type will become MutableMap<Cat, Int>,
*       the compiler will automatically infer that any Contest object
*
*
* */
class Contest<T: Pet>{
    val scores: MutableMap<T,Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) {
            scores.put(t,score)
        }
    }
    fun getWinners(): MutableSet<T>{
        val winners: MutableSet<T> = mutableSetOf()
        val highSore = scores.values.maxOf { it.toInt() }
        for ((t,score) in scores){
            if (score == highSore){
                winners.add(t)
                println(" with high Score of :${score},,,")
            }
        }
        return winners
    }
// todo: check if  i could send winner name & score back
    fun getWinner2(): MutableMap<T,Int>{
        val winners: MutableMap<T,Int> = mutableMapOf()
        val highSore = scores.values.maxOf { it.toInt() }
        for ((t,score) in scores){
            if (score == highSore) winners.put(t,score)
        }
        return winners
    }


}