package FirstHead

fun main() {
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }
    val vet = Vet2()
    val wolf = Wolf2()
    val hippo = Hippo2()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}


interface Roamable{
    fun roam()
}

abstract class Animal2 : Roamable{
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()
    abstract fun eat()
    override fun roam() {
        println("Animal is roaming")
    }
    fun sleep() {
        println("Animal is sleeping")
    }
}

 class Hippo2 : Animal2(),Roamable{
     override val image: String = "hippo.jpg"
     override val food: String = "grass"
     override val habitat: String = "water"
     override fun makeNoise() {
         println("Grunt! Grunt! ")
     }

     override fun eat() {
         println("Hippo is eating stuff")
     }
 }

abstract class Canine2: Animal2(){
    override fun roam() {
        println("Canine is roaming")
    }
}

class Wolf2 : Canine2() {
    override val image: String ="wolf.jpg"
    override val food: String ="meat"
    override val habitat: String = "forests"

    override fun makeNoise() {
        println("Hooooow!!!")
    }

    override fun eat() {
        println("Wolf is eating meat")
    }
}

class Vehicle : Roamable {
    override fun roam() {
        println("Car is Driving --> druum druummm")
    }
}
class Vet2 {
    fun giveShot(animal2: Animal2) {
        animal2.makeNoise()
    }
}



