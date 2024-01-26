package plusUltra

var lastName = "Singh"
fun main() {
    debug1 { "lambda: Aman $lastName" }
//    debug1 { 323 }
    debug2("Aman $lastName")
}
var debug = true
//var debug = false

fun debug1(function: () -> String) {
    if(debug) println(function())
}
fun debug2(value: String) {
    if(debug) println(value)
}