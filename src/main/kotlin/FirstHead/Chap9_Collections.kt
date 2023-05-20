package FirstHead

fun main() {

    checkLists()

}

fun checkLists() {
    val mShoppintList = mutableListOf<String>("Tea", "Egg", "Milk")     // It's Mutable, ie, it got add/remove f()
    println("mShoppingList original: $mShoppintList")
    val extraShoppping = listOf<String>("Cookies", "Sugar", "Eggs")     // it's Immutable , ie, can't add/remove items
    mShoppintList.addAll(extraShoppping)
    println("mShoppingList items added: $mShoppintList")


    if (mShoppintList.contains("Tea")) {
        mShoppintList.set(mShoppintList.indexOf("Tea"),"Coffee")
    }

    mShoppintList.sort()
    println("mShoppingList sorted: $mShoppintList")
    mShoppintList.reverse()
    println("mShoppingList reverse: $mShoppintList")




}
