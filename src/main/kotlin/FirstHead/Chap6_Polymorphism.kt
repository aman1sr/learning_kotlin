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

/*
* -------------------------------x--ABSTRACT Class--x-------------------------------
* abstract class means that nobody can create any objects of that type
* they define the protocol for a group of subclasses
* An abstract class can have abstract properties and functions
* The first concrete class in the inheritance tree below the abstract superclass must
implement all abstract properties and functions.
*
* */
/*
*-------------------------------x--INTERFACE Class--x-------------------------------
*Interfaces are used to define a protocol for common behavior
* a class can implement multiple interfaces, but can only inherit from a single direct superclass
* Interface functions can be abstract or concrete
* Restriction:
    * Unlike properties in abstract classes, properties that are defined in an interface can’t store state,and therefore can’t be initialized. You can, however, return a value for a property by defining a custom getter
    * Interface properties don’t have backing fields ( ie can't define custom setters)
*
* */
/** -------------------------------x--CONCLUSION--x-------------------------------
* Make an abstract class:
    * when you want to define a template for a group of subclasses.
    * when you want to guarantee that nobody can make objects of that type.
* Make an interface :
    * when you want to define common behavior, regardless of where these classes are in the inheritance tree
* */
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



