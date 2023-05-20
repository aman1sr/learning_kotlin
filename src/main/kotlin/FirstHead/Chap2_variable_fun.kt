package FirstHead

    /*
    * When an object is assigned to a variable, the object itself doesn’t go into the variable.
    *    A reference to the object goes into the variable instead.
    *
    * Kotlin has 4 basic integer types: Byte, Short, Int and Long. Each type can hold a fixed number of bits
    *   Byte: 8bits  integer values from -128 to 127
    *   Ints:32 bits, integer values from -2,147,483,648 to 2,147,483,647
    *   Long: 64bits
    *
    * 2 basic floating-point types: Float and Double.
    *   Floats can hold 32 bits
    *   Doubles can hold 64 bits.
    *
    * ++ boolean, char & string also,
    *
    * JAVA Vs KOTLIN
    *   In Java, numbers are primitives, so a variable holds the actual number.
    *   In Kotlin, numbers are objects, and the variable holds a reference to the object, not the object itsel
    *
    *An object has state and behavior
    *   An object’s state refers to the data that’s associated with the object:
    *   An object’s behavior describes the things the object can do, or that can be done to it
    *       eg -- Numeric objects know how to perform basic math
    *
    *  Overspill
    *   Trying to put a large value into a small variable is like trying to pour a bucketload of coffee into a tiny teacup
    *   NOTE :If the Long’s value is within the range of values that an Int will hold, converting the value from a Long to an Int isn’t a problem
    *
    *
    * */

    val x = 5   // val, the reference to the object stays in the variable forever and can’t be replaced
    var y: Int = 6  // explicitly declaring variable's type

/*
*  name variable is declared as lateinit var name: String.
*       It doesn't reference any object until you initialize (name = "aman") and assign a value to it.
*       Once you assign a value to the lateinit variable, it starts referencing the assigned value.
* */
    lateinit var name: String

var a: Int = 6; var b = 5; var c = 12       // By using semicolons (;) to separate the variable declarations, you can declare multiple variables on a single line.


fun main() {
    var arr = arrayOf(1,2,34)
    var arr2: Array<Byte> = arrayOf(1, 23, 34)  // explicitly declare an array type

    printArray(arr)

    checkArray(arr2)
    printArray(arr2)

}

private fun <T>printArray(array: Array<T>) {        // printArray function uses generics and accept any type of array:
    array.let {
        for (element in array)
            println(element)
    }
}

fun checkArray(arr2: Array<Byte>) {
    arr2[0] = 113                       // a ref of array is passed to this f(), & here we update the 1st element of it
}
