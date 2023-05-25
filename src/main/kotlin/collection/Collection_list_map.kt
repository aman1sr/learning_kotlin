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

private val EZPassAccoutns: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 220, 3 to 330)
private val EZPassReport : Map<Int, Int> = EZPassAccoutns

fun accountReport() {
    println("report:::")
    EZPassReport.forEach{
        k,v -> println("ID: $k , credit: $v")
    }
}



/*-----------------------------------Function Scope---------------------------------------*/


    fun main() {

        /* LIST */
    addStuff(4)
        println(getList())

        /* MAP */
        accountReport()

}