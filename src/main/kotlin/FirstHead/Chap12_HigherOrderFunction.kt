package FirstHead

data class Grocery(val name: String, val category: String,
                    val unit: String, val unitPrice: Double,
                   val quantity: Int
)
enum class FoodCategory(val type : String) {
    TYPE_VEG("VEGETABLE"),
    TYPE_BAKERY("Bakery"),
    TYPE_PANTERY("Pantery"),
    TYPE_FROZEN("Frozen"),
}
enum class FoodCategory2 {      // could also use this for ease,,
    VEGETABLE,
    FROZEN,
    PACK
}

fun main() {
    val groceries = listOf(
        Grocery("Tamoatoes", FoodCategory2.VEGETABLE.toString(), "lb", 3.0, 3),
        Grocery("Mushrooms", FoodCategory.TYPE_VEG.type, "lb", 4.0, 1),
        Grocery("Bagels", FoodCategory.TYPE_PANTERY.type, "pack", 1.5, 2),
        Grocery("Olive oil", FoodCategory.TYPE_BAKERY.type, "bottle", 6.0, 1),
        Grocery("Ice cream", FoodCategory.TYPE_FROZEN.type, "pack", 3.0, 2)
    )

    basicHOF(groceries)
      level2HOF(groceries)
         level3HOF(groceries)

}

fun level3HOF(groceries: List<Grocery>) {
    groceries.groupBy { it.category }.forEach {     // where key -> the category Name & value -> respective Obj
        println("key:${it.key}")
        println("value:${it.value}")
    }

    /*
    *  fold takes 2 params (initial value, lambda f)
    * & returns respective expression by lambda in primitive value
    * */
    val ints = listOf(1, 2, 3)
    val sumOfInts = ints.fold(0){ runningSum, item -> runningSum +item}    // this lambda f , runs on all the list & give desired result (Int)
    println("sumOfInts: ${sumOfInts}")

    val productOfInts = ints.fold(1){runningProduct, item -> runningProduct*item}
    println("productOfInts: ${productOfInts}")

    val names = groceries.fold(""){string, item -> string + item.name}
    println("names: ${names}")

    val changeFrom50 = groceries.fold(50.0){change, item -> change - item.quantity}
    println("changeFrom50: ${changeFrom50}")

}

fun level2HOF(groceries: List<Grocery>) {
    val veg = groceries.filter { it.category == FoodCategory.TYPE_VEG.type }     // filter out & return the List of objs satisfying condition
    println("veg: ${veg}")
    val notFrozen = groceries.filterNot { it.category == FoodCategory.TYPE_FROZEN.type }
    println("notFrozen: ${notFrozen}")

    val groceryNames = groceries.map { it.name }        // returns only the List of names
    println("groceryNames: ${groceryNames}")
    val halfUnitPrice = groceries.map { it.unitPrice * 0.5 }
    println(" halfUnitPrice: ${halfUnitPrice}")

    val newPrices = groceries.filter { it.unitPrice > 3.0 }
        .map { it.unitPrice * 2 }
    println("newPrices: ${newPrices}")

    println("Grocery names: ")
    groceries.forEach { print("${ it.name },") }

    println("Grocery with unitPrice >3.0")
    groceries.filter { it.unitPrice > 3.0 }
        .forEach {     print("${it.name},") }

    var itemNames = ""
    groceries.forEach({ itemNames += it.name})
    println("\nitemNames: $itemNames")


}

private fun basicHOF(groceries :List<Grocery>) {


    val higestUnitPrice: Grocery =
        groceries.maxByOrNull { it.unitPrice * 5 }!!  // returns the grocery Obj containing higest uniPrice
    println("higestUnitPrice= ${higestUnitPrice}")
    val lowestQuantity = groceries.minByOrNull { it.quantity }
    println("lowestQuantity= ${lowestQuantity}")

    val sumQuantity = groceries.sumOf { it.quantity }       // returns the summzation of all Qty
    println("sumQuantity= ${sumQuantity}")

    val totalPrice =
        groceries.sumByDouble { it.quantity * it.unitPrice }       // returns the summzation of all ITEMS Qty*UnitPrice
    println("totalPrice= ${totalPrice}")
}