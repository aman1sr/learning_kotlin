package scopeFun

fun main() {
     val obj = getUserStuff()
    val stuff = obj.let {
          it.get(0).age.toDouble()
     }
     println(stuff)
     val obj2 = DemoUser("aman",25)
     obj2.apply {

     }
}
data class DemoUser(val name: String, val age: Int)

fun getUserStuff(): List<DemoUser>  {
   return listOf<DemoUser>(
        DemoUser("aman",25),
        DemoUser("aman2",25),
        DemoUser("aman3",25),
        DemoUser("aman4",25)
        )
}