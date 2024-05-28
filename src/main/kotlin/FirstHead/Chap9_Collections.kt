package FirstHead

var mShoppintList = mutableListOf<String>("Tea", "Egg", "Milk", "Egg")     // It's Mutable, ie, it got add/remove f()

data class Recipe2(val name: String)

fun main() {

//    checkLists()
//    checkSet()
    checkMap()
}

fun checkMap() {
    val r1 = Recipe2("Chicken soup")
    val r2 = Recipe2("Quinoa Salad")
    val r3 = Recipe2("Thai Curry")
    val r4 = Recipe2("Jambalaya")
    val r5 = Recipe2("Sausage Rolls")

    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    println("mRecipeMap original: $mRecipeMap ")
    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    println("mRecipeMap new: $mRecipeMap ")

    if (mRecipeMap.containsKey("Recipe1")) {
        println("Recipe is: ${mRecipeMap.getValue("Recipe1")}")
    }

}

fun checkSet() {
    val mShoppingSet = mShoppintList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")
    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet item added : $mShoppingSet")
    mShoppintList = mShoppingSet.toMutableList()
    println("mShoppintList new version: $mShoppintList")

}

fun checkLists() {
    println("mShoppingList original: $mShoppintList")
    val extraShoppping = listOf<String>("Cookies", "Sugar", "Eggs")     // it's Immutable , ie, can't add/remove items
    mShoppintList.addAll(extraShoppping)
    println("mShoppingList items added: $mShoppintList")


    if (mShoppintList.contains("Tea")) {
        mShoppintList.set(mShoppintList.indexOf("Tea"), "Coffee")
    }

    mShoppintList.sort()
    println("mShoppingList sorted: $mShoppintList")
    mShoppintList.reverse()
    println("mShoppingList reverse: $mShoppintList")

}
