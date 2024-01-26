package FirstHead

class Dog5(val name: String, weight_param: Int, breed_param: String){

    init {
        println("Dog $name has been created ")
    }
    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()
    init {
        println("The breed is $breed")
    }
    var weight = weight_param
        set(value) {
            if (value > 0)  field = value
        }
    val weightInKgs: Double
        get() = weight/2.2

    fun bark() {
        println(if(weight<20)"Yip" else "Woof")
    }
}

fun main() {
    val myDog = Dog5("Jacks", 70, "Mixed")
    myDog.bark()
    println("weight: ${myDog.weight}")
    myDog.weight = 75

    myDog.activities = arrayOf("walks", "Fetching balls", "Frisbee")
    for (items in myDog.activities) {
        println("My dog enjoys $items")
    }

}
