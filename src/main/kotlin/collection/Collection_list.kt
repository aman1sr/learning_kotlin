
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


    fun main() {

        /* LIST */
    addStuff(4)
        println(getList())


}