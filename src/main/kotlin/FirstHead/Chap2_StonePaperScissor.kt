package FirstHead

fun main() {

//    val rock: Int = 1
//    val paper : Int = 2
//    val scissor : Int = 3
    val game = HashMap<String,Int>()
    game.put("rock",0)
    game.put("paper",1)
    game.put("scissor",2)
    println("Please enter one of the following: Rock Paper Scissors")
    val computerInput = (0..2).random()

    /* Testing Hash Map functionality */
//    hashMapTesting( game)

    /*
    * READ INPUT FROM USER
    *
    * 1. String Entered By the User
    *    val stringInput = readLine()!!       // can also convert it to values of other data type (like Int) explicitly.
    *
    * 2.to input of other data types, you can use Scanner object.
    *   val reader = Scanner(System.`in`)     // reader object is used to take input from the user.
    *   var integer:Int = reader.nextInt()      // nextInt() reads the next integer from the keyboard
    *
    * */

    val userInput = readLine()!!.toLowerCase()
    var userInputNO: Int =0

    for (input in game.keys) {
        if (input.equals(userInput))
            userInputNO = game[input]!!.toInt()
    }
    if (userInputNO == 0) {
            println("Errr... dunno")
            println("You must enter a valid choice not $userInput")
            return      //todo: call the top of f()
    }

   println("you chose ${game.keys.elementAt(userInputNO)}. i chose ${game.keys.elementAt(computerInput)}. ${calculateGameResult(game,computerInput,userInputNO)}")


}

fun calculateGameResult(game: HashMap<String, Int>, computerInput: Int, userInputNO: Int): String {
var strResult: String

    if ((computerInput == 0 && userInputNO == 1) || (computerInput == 1 && userInputNO == 2) || (computerInput == 2 && userInputNO == 0)) {
        strResult = "You Win!"
    } else {
        strResult = "You Lose!"
    }
return strResult
}

private fun hashMapTesting(game: HashMap<String, Int>) {   //  <key,value>
    println("hasmap: " + game)
    println(game.get("Rock"))
    println(game.get("Scissor".toLowerCase()))
    println(game.containsValue(3))
    println(game["rock"])           // give value (ie Number) wrt key position
    println(game.getValue("rock"))           // same as Ab
    println(game.keys.elementAt(1))           // give key (ie String) wrt value


    for (key in game.keys) {
        println("Element at key $key ")
    }
}