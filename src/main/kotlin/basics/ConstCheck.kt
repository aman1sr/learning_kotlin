package basics

object ConstCheck {
    const val name = "Aman"
    val email = provideEmail()

    private fun provideEmail(): String {
        println("provide Email")
        return "aman@gmail.com"
    }
}
fun main() {
    println(ConstCheck.name)
}