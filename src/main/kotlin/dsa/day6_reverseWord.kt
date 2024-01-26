package dsa

// todo: via functional programming
fun reverseWords(s: String): String {

 val revWords = s.split(" ").map { it.trim() }.filter { it.isNotBlank() }.reversed()

    var str = StringBuffer("")
    for (i in 0..revWords.size - 1) {
        str = str.append(" ${revWords[i]}")
    }
    println("revWords: $revWords")
    println("str: $str")
    return str.toString().trim()
}