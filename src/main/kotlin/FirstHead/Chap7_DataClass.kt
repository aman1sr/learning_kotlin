package FirstHead

fun main() {
    val r1 = Recipe("Thai Curry", "Chiken")
    val r2 = Recipe(title = "Thai Curry2", ingredient =  "Veg",true)
    val r3 = r1.copy(title = "Chiken Bhuna")
    val r4 = r1.copy()

    println("r1 hash code: ${r1.hashCode()}")
    println("r1 component1: ${r1.component1()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 toString: ${r1.toString()}")

    println("r1 === r3? ${r1 === r3}")         // check obj identity
    println("r1 === r3? ${r1 === r2}")         // false, beacuse they aren't referring to same object memory location

    println("r1 == r4 ${r1 == r4}")            //true,  checks obj equivalance
    println("r1.equals(r4) ${r1.equals(r4)}")  // true , works same as ==

    val (title, mainIngredient, vegetaraian, difficulty) = r1    // destructuring data objects
    println("the title: $title,mainIngredient: $mainIngredient, difficulty:$difficulty,  ")

    val m1 = Mushroom(6, false)  // calling the primary construtor
    val m2 = Mushroom(true)      // calling the 2nd constructor which is delegating to primary cosntructor
    println("m1 size is ${m1.size}")
    println("m2 size is ${m2.size}")

    println(addNumbers(2,3))
    println(addNumbers(2.4,3.5))

}
data class Recipe(val title: String,
                  val ingredient: String = "simple",
    val isVegiterian: Boolean = false,
    val difficulty: String = "Easy")

class Mushroom(val size: Int, val isMagic: Boolean){
    constructor(isMagic_param: Boolean): this(0,isMagic_param)   // 2nd constructor
}

fun findRecipes(title: String="",
                ingredient: String= "",
                isVegetarain: Boolean = false,
                difficulty: String = ""): Array<Recipe>{
    return arrayOf(Recipe(title,ingredient,isVegetarain,difficulty))
}

fun addNumbers(a: Int, b: Int): Int{
    return a+b
}
fun addNumbers(a: Double, b: Double): Double{
    return a+b
}
