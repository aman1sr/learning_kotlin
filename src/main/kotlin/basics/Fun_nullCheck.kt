package basics

class Oct_29 {

    /* -------------------  functions ------------------- */
    fun printMessage(message: String): Unit {       //  simple function — returns Unit (i.e., no return value).
        println(message)
    }

    fun printMessageWithPrefix(message: String, prefix: String = "info") {
        println("[$prefix] $message")
    }

    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun multiply(x: Int, y: Int) = x * y        // single-expression function


    /* -------------------  Variable & Null Safety ------------------- */
    var a: String = "initial"

    val b: Int = 1

               // lateinit: those variables that are guaranteed to be initialized in the future.
    lateinit var str: String
    lateinit var str2: String

    /* kotlin don't allow variables assinemtn of null (directly) for Null safety , we can use ? that makes a varialbe nullable */
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
    class Contact(val id: Int, var email: String)       // a class with two properties


    /* -------------------  Generics  ------------------- */
    /*E is called the generic type parameter.
    * compiler can infer the generic type from the parameters of mutableStackOf
      so that you don't have to write mutableStackOf<Double>(...)
    *
    * */
    class MutableStack<E>(vararg items: E){
        private val elements = items.toMutableList()
        fun push(element: E) = elements.add(element)

        override fun toString(): String {
            return "MutableStack(${elements.joinToString() })"
        }
    }

    fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)


    /* -------------------  Inheritace  ------------------- */

    /*
    * Kotlin classes & methods are final by default. to allow the class inheritance, mark the class with the openmodifier
    * */
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

    // calling lateInit

//    println("lateInit1 : "+obj.str)       // will give error , since it's not initialized

    obj.str2 = "lateInit initilized"
    println("lateInit1: "+ obj.str2)



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

