package plusUltra

// generic function:  will take any type  of parameter(a,b) because used <T> not <T:Int> & return Pair<b,a> reverse order
fun <T> swap(a: T, b: T): Pair<T, T> {
    return Pair(b,a)
}

// the <T:Int> limits the function using of Specific type
fun <T: Int> addTwoNo(a: T, b: T): T{
    return (a + b) as T
}
// generic class : works with various types & intantiate it with it's field
class Box<T>(val item: T)

/*
* <T> :  This is a generic type parameter that represents the type of elements in the iterable.
* Iterable<T>.checkingGenericHOf() : This function is an extension of the Iterable<T> class, which means it can be called on any object that implements the Iterable interface, such as lists, sets, or other collections.
* */
fun <T> Iterable<T>.checkingGenericHOf(): Int{
    return this.toList().size
}

fun main() {
    swapPairs()

    add2Int()

    checkClass()

    checkAnimalClass()

    checkExtension()
}

private fun checkExtension() {
    val list = listOf(1, 2, 44, 5, 33, 1)
    val calSize = list.checkingGenericHOf()
    println("calSize:$calSize")
}

/*Runtime Polymorphism therefore the animalSound() limited to accept of only Animal Type & could only speak() */
private fun checkAnimalClass() {
    val animalList: List<Animal> = listOf(Dog(), Cat())
    animalSound(animalList)
}

private fun checkClass() {
    val stringBox = Box("hello")
    val intBox = Box(1)
    println("stringBox: ${stringBox.item}, intBox: ${intBox.item}")
}

private fun add2Int() {
    println(addTwoNo(3, 4))
    //    println(addTwoNo(3.0,4))     // will not allow type of Double

}

private fun swapPairs() {
    val resultStr = swap("aman", "singh")
    val resultInt = swap(3, 4)
    val resultBoolean = swap(true, false)
    println("resultStr: $resultStr,resultInt: $resultInt,resultBoolean: $resultBoolean")
}

interface Animal{
    fun speak(): String
}
class Dog : Animal{
    override fun speak() = "Woof!!!"
    fun eat() {
        println("dog eating...")
    }
}

class Cat : Animal{
    override fun speak() = "Meooo.."
    fun eat() {
        println("cat eating...")
    }
}
fun <T : Animal> animalSound(animal: List<out T>) {
    animal.forEach {
        println(it.speak())
    }
}



