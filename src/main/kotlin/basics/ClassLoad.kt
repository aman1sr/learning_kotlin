package basics

class ClassLoad {
    val name = "Aman Singh"
    val email = provideEmail()

    private fun provideEmail(): String {
        println("provide Email")
        return "aman@gmail.com"
    }
}

fun main() {
    val obj = ClassLoad()
    println(obj.name)
}