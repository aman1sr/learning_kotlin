package basics
/*
* lazy :
*       (https://medium.com/huawei-developers/kotlin-lateinit-vs-by-lazy-initialization-example-tutorial-c19d84216480)
*
* */
//lateinit var isNetworkCall : Boolean        // NOTE: we cannot intilize primitive data type
lateinit var musicName: String
data class User(val name: String, val id: Int)

val user : User by lazy {
    println("lazy initlization")
    User("aman", 203)
}
fun main() {

//    println(musicName)                   // UninitializedPropertyAccessException

    if (::musicName.isInitialized) {
        println(musicName)
    } else {
        musicName = "Disco deewane"
        println(musicName)
    }

    println("lazy user: $user")
}


