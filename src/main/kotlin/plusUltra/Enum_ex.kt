package plusUltra

/*
* an enum  is a special data type that represents a set of predefined constants.
* Each enum constant is an object. Enum constants are separated by commas.
* each enum is an instance of the enum class, so it can be initialized  (see Color(val rgb: Int)
*
* NOTE: In Kotlin 1.9.0, the entries property is introduced as a replacement for the values() function
* */
enum class RGB { RED, GREEN, BLUE}
enum class Direction{
    NORTH, SOUTH, WEST, EAST
}
enum class Color(val rgb: Int){     // here:  RED, GREEN, and BLUE are instances of the Color enum class, and they each have an associated rgb property.
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
//    BLACK(asdf)               // error since you need to input only Int values
}
fun getColorName(color:Color): String{
    return when (color) {
        Color.RED -> "red!!"
        Color.GREEN -> "green,,"
        Color.BLUE -> "Blue.."
    }
}

fun main() {
//    setColor()
//    setDirections()
    setColor2()

}

/*initialize the enum Color class, having their Objects by def rgb property, then accessing the class via getColorName() */
fun setColor2() {
    val selectedColor = Color.GREEN
    println("SElected color: ${getColorName(selectedColor)}")
    println("RGB value of ${Color.GREEN} is 0x${selectedColor.rgb.toString()}")
}

/*to check direction based on Input & print, else recalling */
fun setDirections() {
    println("Enter which direction wanted to go")
    val inputDirection = readLine()!!.uppercase().trim()
    var isDirectionFound = false
    for(direction in Direction.values()){                       // Direction.values() : gives the String format value in CAPITAL form
        if (inputDirection.equals(direction.name)) {
            println("Direction set!! lets go >>${direction}")
            isDirectionFound = true
        }
    }
    if (!isDirectionFound) {
            println("Sorry please enter correct direction")
            setDirections()
    }
}

/*simple looping in enum constants*/
private fun setColor() {
    for (color in RGB.values()) {
        println(color.toString())
    }
    println("The first color is ${RGB.valueOf("RED")}")
    println("The first color is ${RGB.RED}")
}