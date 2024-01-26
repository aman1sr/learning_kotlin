package scopeFun

/*
* The context object is available as a receiver (this).
* The return value is the lambda result.
*
* run does the same as with but it is implemented as an extension function. So like let, you can call it on the context object using dot notation.
* run is useful when your lambda both >>>INITIALIZE objects and >>> COMPUTES the return value.
*
* */
class MultiportService(var url: String, var port: Int) {
    fun prepareRequest(): String = "Default request"
    fun query(request: String): String = "Result for query '$request'"
}
private fun performRunOperation() {
    val name = Person().name?.run {
        "The name of the Person is: $this"
    }

 Person().contactNumber?.run {
    println(this)
}
    println(name)


}
fun main() {
performRunOperation()

    val service =
        MultiportService("https://blog.mindorks.com/using-scoped-functions-in-kotlin-let-run-with-also-apply/", 90)
    val result = service.run {
        port = 8080
        query(prepareRequest()+" to port $port")
    }

    println(result)

}