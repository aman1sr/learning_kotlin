package plusUltra

/*
* without sealed you can't have to expelitely write open for extention & you can't access Result.Success
* 
* */
sealed class Result{
    // Sealed classes can have subclasses, but all subclasses must be defined within the same file.
    // This restricts inheritance and allows for exhaustive when expressions.

    class Success(val data: String) : Result()
    class Error(val message: String): Result()
}

fun processResult(result: Result) {
    when (result) {
      is  Result.Success -> {
            println("success ${result.data}")
        }
        is  Result.Error -> {
            println("error ${result.message}")
        }
    }
}

fun main() {
    val successResult = Result.Success("Data retrived successfullly")
    val errorResult = Result.Error("Failed to retrive data")

    processResult(successResult)
    processResult(errorResult)
}