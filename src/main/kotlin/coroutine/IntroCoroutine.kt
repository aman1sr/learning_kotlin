package coroutine
import kotlinx.coroutines.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

val formatter = DateTimeFormatter.ISO_DATE_TIME
val time = { formatter.format(LocalDateTime.now())}


suspend fun getValue():Double{                  // marking this f() as suspend ::reason is that it calls delay(), which is also a suspend function. Whenever a function calls another suspend function, then it should also be a suspend function.
    println("entering getValue() at ${time()}")
    delay(3000)
    println("leaving getValue() at ${time()}")
    return Math.random()
}

fun main() {

    /*
    *
    * The GlobalScope allows any coroutines in it to run as long as the app is running
    * The launch() function creates a coroutine from the enclosed code wrapped in a cancelable Job object. launch() is used when a return value is not needed outside the confines of the coroutine.
    *
    * */
//    testGlobalScope()

    /*
    * starts a new coroutine and blocks the current thread until completion. It is mainly used to bridge between blocking and non-blocking code in main functions and tests
    *
    * */
//    testRunBlocking()

    /*
    * The async() function returns a value of type Deferred. A Deferred is a cancelable Job that can hold a reference to a future value. By using a Deferred, you can still call a function as if it immediately returns a value - a Deferred just serves as a placeholder, since you can't be certain when an asynchronous task will return. A Deferred (also called a Promise or Future in other languages) guarantees that a value will be returned to this object at a later time.
    * */
//    testAsync()

    testMultipleCoroutines()

}

fun testMultipleCoroutines() {
    runBlocking {           // todo: don't know why GlobalScope.launch{}  isn't working??
        repeat(3) {
            extractPrintingData()
        }
    }
}

suspend fun extractPrintingData()  {
    println("${Thread.currentThread()} has started")
    for (i in states) {
        println("${Thread.currentThread()} - $i")
        delay(1000)
    }
}

private fun testAsync() {
    runBlocking {
        val num1 = async { getValue() }
        val num2 = async { getValue() }
        println("result of num1 + num2 is ${num1.await() + num2.await()}")
    }
}

private fun testRunBlocking() {
    runBlocking {
        val num1 = getValue()
        val num2 = getValue()
        println("result of num1 + num2 is ${num1 + num2}")
    }
}

private fun testGlobalScope() {
    repeat(3) {
        GlobalScope.launch {
            println("Hi from ${Thread.currentThread()}")
        }
    }
}
