class Nov_4 {

    companion object {
        val upperCase1: (String) -> String = {str: String -> str.uppercase()}

        val upperCase2= { str: String -> doit(str) }    // Type inference inside lambda  ( compiler automatically guessed it's String)
        private fun doit(str: String): String {
            return "wola " + str
        }

        // val upperCase4 = { str -> str.uppercase() }      // can't do both , Type inference , inside & outside

        val upperCase3 = {str: String -> str.uppercase()}       // Type inference outside lambda

        val upperCase5 : (String) -> String = { it.uppercase()}     // For lambdas with a single parameter, can use it

        val upperCase6 : (String) -> String = String::uppercase     // if your lambda consists of a single function call, you may use function pointers (::) .


    }


}
fun main() {
   println( Nov_4.upperCase1("hello"))
   println( Nov_4.upperCase2("hello2"))
   println( Nov_4.upperCase3("hello3"))
   println( Nov_4.upperCase5("hello5"))
   println( Nov_4.upperCase6("hello6"))

}