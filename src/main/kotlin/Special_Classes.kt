


/*--------------------------------------Object Keyword---------------------------------------*/
fun rentPrice(standardDays: Int, festivalDays: Int, specialDays: Int) {
    val dayRates = object {
        val standard: Int = 30 * standardDays
        val festival: Int = 30 * festivalDays
        val special: Int = 30 * specialDays
    }
    val total = dayRates.standard + dayRates.festival + dayRates.special

    println("Total price: $$total")


}

/*--------------------------------------Sealed Class---------------------------------------*/

sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job : String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String{
    when(mammal){
        is Human -> return "Hello ${mammal.name}; you are v good , job: ${mammal.job} "
        is Cat -> return "hello ${mammal.name}"
    }
}

fun main() {

    rentPrice(20,5,3)

                    /* Sealed Class */
    println(greetMammal(Cat("norman")))
    println(greetMammal(Human("Aman","Money & Happiness")))

                   /* Object Keyword */





}
