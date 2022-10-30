
 class Oct_29 {

    /* -------------------  functions ------------------- */
    fun printMessage(message: String): Unit {
        println(message)
    }

    fun printMessageWithPrefix(message: String, prefix: String = "info") {
        println("[$prefix] $message")
    }

    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun multiply(x: Int, y: Int) = x * y


    /* -------------------  Variable & Null Safety ------------------- */
    var a: String = "initial"

    val b: Int = 1

    lateinit var str: String
    lateinit var str2: String

    var neverNull: String = "this string can't be null"
    var nullble: String? = "this string can be assigned as null"

    fun describeString( maybeString: String?):String{
        if (maybeString != null && maybeString.length>0){
            return "yes , Str okok"
        }else{
            return "Str , wtf"
        }
    }

    /* -------------------  Classes  ------------------- */

    class Customer{
        var a : Int = 3
    }
    class Contact(val id: Int, var email: String)


    /* -------------------  Generics  ------------------- */
    class MutableStack<E>(vararg items: E){
        private val elements = items.toMutableList()
        fun push(element: E) = elements.add(element)

        override fun toString(): String {
            return "MutableStack(${elements.joinToString() })"
        }
    }

    fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)


    /* -------------------  Inheritace  ------------------- */

    open class Dog{
        open fun sayHello() {
            println("whof! whof!")
        }
    }

    class Shino : Dog() {
        override fun sayHello() {
            println("wo wo!!")
        }
    }



}

fun main() {
    val obj = Oct_29()
    /* -------------------  functions  ------------------- */
    obj.printMessage("Oct is great")
    obj.printMessageWithPrefix("whooHoo")
    println("sum= "+ obj.sum(2, 3))
    println( "multiply= "+obj.multiply(4, 5))


    /* -------------------  Var & NullSafety  ------------------- */
    obj.a = "changed"
    println(obj.a)

//    obj.b = 4         // can't be changed , it's val (immutabe)

    println(obj.neverNull)
//    obj.neverNull = null      // can't be assinged as null

    println(obj.nullble)
    obj.nullble = null
    println(obj.nullble)

    var returnedStr = obj.describeString("yes man")
    println(returnedStr)


    /* -------------------  Classes ------------------- */
    val customer = Oct_29.Customer()
    println("inner class Customer a: = "+customer.a)

    val contact = Oct_29.Contact(23, "eyeon4840@gmail.com")
    println("inner contact class: "+contact.id + ", "+ contact.email)


    /* -------------------  Generic ------------------- */
    val generic = Oct_29.MutableStack(23.0, 21.2, 93.2)
    generic.push(21.3)
    println(generic)

    val generic2 = Oct_29.MutableStack("abc","def","ghi","jkl")

    generic2.push("mno")
    println(generic2)


    /* -------------------  Inheritace  ------------------- */

    val animal: Oct_29.Dog = Oct_29.Shino()
    animal.sayHello()


}

