package collection


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

fun main() {
    accountReport()
}