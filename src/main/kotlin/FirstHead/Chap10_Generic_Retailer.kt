package FirstHead
/*
* working : (https://chat.openai.com/share/8dd195b7-dc44-41e5-a2b8-a4e9fd5aba76)
* */

fun main() {
    val dogRetailer: Retailer<Dog> = DogRetailer()          //  Liskov Substitution Principle, which states that a subtype should be usable wherever a supertype is expected.
    dogRetailer.sell()
//    dogRetailer.checkIff()       // unable to access
    val dogRetailer2 = DogRetailer()
    dogRetailer2.checkIff()             // here this obj is able to access NON interface f()

    val catRetailer: Retailer<Cat> = CatRetailer()
    catRetailer.sell()
    val petRetailer: Retailer<Pet> = CatRetailer()
    petRetailer.sell()


}
interface Retailer<out T>{ // out: it means that a subtype can be used in place of a supertype.
    fun sell(): T
}
class CatRetailer: Retailer<Cat>{
    override fun sell(): Cat {
        println("Sell Cat")
        return Cat("")
    }
}
class DogRetailer: Retailer<Dog>{
    val size : Long = 60L
    override fun sell(): Dog {
        println("Sell Dog")
        return Dog("")
    }
    fun checkIff() {
        println("checking weather dogRetailer Obj could access this f() or not")
    }
}
class FishRetailer: Retailer<Fish>{
    override fun sell(): Fish {
        println("Sell Fish")
        return Fish("")
    }
}
