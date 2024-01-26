package coroutine

val states = arrayOf("Starting", "Doing Task 1", "Doing Task 2", "Ending")

fun main() {
    /*
    *  simple thread by providing a lambda::
    * */
//    simpleThreadEx()

    /*
    *  let's create a couple threads to execute. The code will create 3 threads printing the information line :::
    * This invariability is caused by how the threads are executed.
    * The scheduler gives out a slice of time to each thread and it either completes in the time period or is suspended until it receives another time slice.
    * */
//    multipleTreadEx()

    /*
    *  simple loop to count from 1 to 50, but in this case, a new thread is created for each time the count is incremented::
    *  some of the other threads were executed out of order.
    * This is just one way threads can lead to unpredictable behavior. When working with multiple threads, you may also run into what's called a race condition. This is when multiple threads try to access the same value in memory at the same time.
    *
    * */
    var count =0
    for (i in 1..50) {
        Thread{
            count += 1
            println("Thread: $i count: $count")
        }.start()
    }

}

private fun multipleTreadEx() {
    repeat(3) {
        Thread {
            println("${Thread.currentThread()} has started")
            for (i in states) {
                println("${Thread.currentThread()} - $i")
                Thread.sleep(5000)
            }
        }.start()
    }
}

private fun simpleThreadEx() {
    val thread = Thread {
        println("${Thread.currentThread()} has run")        // currentThread() returns a Thread instance which is converted to its string representation which returns the thread's name, priority, and thread group.
    }
    thread.start()
}