package lambda_stuff

var lastName = "Singh"
fun main() {
    /*
    * NOTE : isSystemReqDone() contains a lambda f() which has declaration of (Boolean) -> Unit), meaning this fun will accept Boolean & return nothing
    *        the impl of lambda is done here>> within { }
    *        so here we wanted to flow of code to 1st ask all Permission nessisities then invoke lambda f() passing bool, thereby flow reaching withing {...}
    *         & if again we wanted the flow back in isSystemReqDone() we could have declared the lambda f() as (Boolean) -> Obj), where after calling API & fetching data we could have returned the respective data to isSystemReqDone()
    * */
    isSystemReqDone{ isPermissionGranted ->
        if (isPermissionGranted) {
            println("CALLING API2")
        }
    }
    checkSystemReqCallAPI{
        println("calling API")
    }

    debug1 {
        "lambda: Aman $lastName"
    }

    debug2("Aman $lastName")


}
//var debug = true
var isWorking = false

fun debug2(value: String) {
    if(isWorking) println(value)
}


fun debug1(function: () -> String) {
    if(isWorking) println(function.invoke())
}

fun isSystemReqDone(checkPermission: (Boolean) -> Unit) {
    println("asking Permission....1")
    println("asking Permission....2")
    checkPermission.invoke(true)
}

fun checkSystemReqCallAPI(checked: ()->Unit){
    println("checking System Req1")
    println("checking System Req2")
    println("checking System Req3")
    checked()
}

