package scopeFun

/*
* The context object is available as a receiver (this)
* The return value is the object itself
*
* apply function is similar to the run functionality only in terms of referring to the context of the object as “ this ” and not “ it ”
*    also in providing null safety checks.
*
*  DIFF:
*       apply function is typically used when you need to chain multiple functions together,
*       while the run function is typically used when you need to execute a single function and return the result.
*
*
* */

data class Person2(var name: String, var age: Int = 0, var city: String = "")

fun main() {
    var person = Person2("Aman").apply {
        age = 24                        // therefore, no need to access the fields by obj (person.age = 34)
        city = "Delhi"
    }
/*
    person.age = 34
    person.city = "Dehradun"
    */

    println(person)

}