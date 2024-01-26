package FirstHead

class Dog2(val name: String, var weight: Int, val breed: String)
class Dog3( name: String,  weight: Int,  breed: String)     // no val/var , so constructor creates NO property for them,  They are plain old parameters, just like the ones you see in function definitions

/*
* Defining properties in the main body of the class gives you a lot more flexibility
*   than adding them to the constructor, as it means that you no longer have to initialize each one with a parameter value.
* Alternatively, you might want to tweak the value of a constructor parameter before assigning it to a property.
* */
class Dog4( name: String,  weight: Int,  breed: String){
    var name = name
    val weight = weight
    val breed = breed
}


fun main() {
    val obj = Dog2("doggy", 34, "local")

    obj.weight = 23
    println("Dog2(name=${obj.name},, weight=${obj.weight}, breed=${obj.breed})")

    obj.weight = 22
//    obj.name = "suman"      // can't update the name property because declared as val
    println("Dog2(name=${obj.name},, weight=${obj.weight}, breed=${obj.breed})")

    val obj3 = Dog3("doggy", 34, "local")
//    obj3.name  // error
//    println("Dog3(name=${obj3.name},, weight=${obj3.weight}, breed=${obj3.breed})")       // error

    val obj4 = Dog4("doggy", 34, "local")
    obj4.name = "wobby"
    println("Dog4(name=${obj4.name},, weight=${obj4.weight}, breed=${obj4.breed})")


}