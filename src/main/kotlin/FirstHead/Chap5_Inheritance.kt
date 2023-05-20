package FirstHead

/*p-265*/
fun main() {

    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }
    val vet = Vet()
    val wolf  = Wolf()
    val hippo = Hippo()
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
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}