package basics

fun main() {
    val obj1 = InitilizationOrder(23,78)
    val obj2 = InitilizationOrder(33)
    obj2.testLazyStr

}
class InitilizationOrder(val primaryParam: Int) {
    val a: Int = 10
    lateinit var testStr : String
    val testLazyStr : String by lazy {
        println("lazy called")
        "string-_-"
    }
    val c  : Int =40

    init {
        println("Inside init block")
        testStr = "string-_-"
    }

    constructor(primaryParam: Int, secondaryParam: Int) : this(primaryParam){
        println("this is secondary const")
    }

    companion object{
        val companionVar: Int = 30
        init {
            println("Inside companion object init block")
        }
    }

}