/*--------------------------------------Collection---------------------------------------*/

    /* LIST */
//    ordered collection of items.
//    lists can be either mutable (MutableList) or read-only (List)

    val listCheck: MutableList<Int> = mutableListOf(1, 2, 3)

    fun addStuff(newItem: Int) {
        listCheck.add(newItem)
    }

    private val list : List<Int> = listCheck

    fun getList(): List<Int> {
        return list
    }


/* MAP */
//      A map is a collection of key/value pairs
//          where each key is unique and is used to retrieve the corresponding value



/*-----------------------------------Function Scope---------------------------------------*/


    fun main() {

    addStuff(4)
        println(getList())

}