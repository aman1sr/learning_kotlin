package FirstHead


fun main() {

    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoise(options)
    val userChoice = getUserChoise(options)
    printResult(gameChoice,userChoice)

}

fun printResult(gameChoice: String, userChoice: String) {
    val result: String
    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")
            ) result = "You Win"
        else
            result = "You Lose"

    println("You choose $userChoice. i choose $gameChoice. \n$result")
}

fun getUserChoise(optionsParam: Array<String>): String {
    var isValidChoise = false
    var userChoise = ""

    while (!isValidChoise) {
        println("Please enter one of the following:")
        for (item in optionsParam) print("$item ")
        println(".")

        val userInput = readLine()!!
        if (userInput != null && userInput in optionsParam) {
            isValidChoise = true
            userChoise = userInput

        }

    }
    return userChoise
}

fun getGameChoise(optionsParam: Array<String>): String {
    val choise  = optionsParam[(Math.random() * optionsParam.size).toInt()]
return choise
}
