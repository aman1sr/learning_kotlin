package dsa
/*
* deepank_Sol_java [https://leetcode.com/problems/reverse-vowels-of-a-string/solutions/3723102/easy-solution-with-simple-explanation-using-two-pointer/]
* todo  kotlinSol (filter, with) [https://leetcode.com/problems/reverse-vowels-of-a-string/solutions/4065507/simple-kotlin-solution/]
* */
fun reverseVowels1attempt(s: String): String {
    val vowelArray = arrayOf('a', 'e', 'i', 'o', 'u')
    val sb = StringBuilder(s)
    var k= 0
    for (i in 0..((sb.length/2)+1)) {
        if (sb[i] in vowelArray) {
            for (j in (s.length - 1-k) downTo ((sb.length / 2))) {        // why this loop isn't working?
                if (sb[j] in vowelArray) {
                    val temp = sb[i]
                    sb[i] = sb[j]
                    sb[j] = temp
                    k++
                    break
                }
            }
        }
    }
println("sb = $sb")
return sb.toString()
}

fun reverseVowels2attempt(s: String): String {
    var word = s.toCharArray()
    var start =0
    var end = s.length - 1
    val vowels = "aeiouAEIOU"

    while (start < end) {
        while (start < end && vowels.indexOf(word[start])==-1) {
            start++
        }
        while (start < end && vowels.indexOf(word[end])==-1) {
            end--
        }
        val temp = word[start]
        word[start] = word[end]
        word[end] = temp

        start++
        end--
    }
    println("Inverted word : ${String(word)}")
    return String(word)
}