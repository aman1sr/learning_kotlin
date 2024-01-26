package FirstHead

fun main() {
    val dogRetailer: Retailer<Dog> = DogRetailer()
    dogRetailer.sell()
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
    override fun sell(): Dog {
        println("Sell Dog")
        return Dog("")
    }
    fun checkIff() {            // NO
        println("checking weather dogRetailer Obj could access this f() or not")
    }
}
class FishRetailer: Retailer<Fish>{
    override fun sell(): Fish {
        println("Sell Fish")
        return Fish("")
    }
}
