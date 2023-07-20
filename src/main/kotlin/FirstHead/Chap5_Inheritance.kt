package FirstHead

/*p-265*/

/*
* [p-252] to stop a function or property from being overridden further down the class hierarchy, you can prefix it with final.
* [p-258] When you call a function on an object reference, you’re calling the most
          specific version of the function for that object type: the one that’s lowest on the inheritance tree
*
* When you call a function on the variable, it’s the object’s version that responds
*       When the eat function gets called, it’s the version that’s in the Wolf class that responds.

            val animal: Animal = Wolf()
            animal.eat()

* Polymorphism means “many forms”. It allows different subclasses to have different implementations of the same function
*   Being able to use one type of object in a place that explicitly expects a different type is called polymorphism.
*       It’s the ability to provide different implementations for functions that have been inherited from somewhere else
*
*
* */
fun main() {

    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }
    val vet = Vet()
    val wolf  = Wolf()
    val hippo = Hippo()
    wolf.hunger = 11
    println("wolf has a hunger of ${wolf.hunger}")
    /*
    *  Since Hippo is a subclass of Animal,
    *       it's Obj can be passed as an argument to a function that expects an Animal parameter.
    * */
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}

open class Animal{
    open val image = ""
    open val food = ""
    open val habitat = "Africa"     // subClass can get this proper by --> get() = super.habitat
    var hunger = 10

    open fun makeNoise() {
        println("The Animal is making a noise")
    }
    open fun eat() {
        println("The Animal is eating")
    }
    open fun roam() {
        println("The Animal is roaming")
    }
    fun sleep() {
        println("The Animal is sleeping")
    }
}
class Hippo : Animal(){

    override val image: String = "hippo.jpg"
    override val food: String ="grass"
    override val habitat: String
        get() = super.habitat

    override fun makeNoise() {
        println("Grunt! Grunt!!")
    }

    override fun eat() {
        println("HIppo is eating food")
    }
}

open class Canine : Animal() {
    override fun roam() {
        println("Canine is roaming!!!")
    }
}
class Wolf : Canine() {
    override val image: String = "wolf.png"

    override val food: String = "meat"

    override val habitat: String = "forests"


    override fun makeNoise() {
        println("Hooooow!")
    }

    override fun eat() {
        println("Wolf is eating food")
    }
}

class Vet {
    fun giveShot(animal: Animal) {      // This allows any object of type Animal or its subclasses to be passed as an argument.
        animal.makeNoise()
    }
}