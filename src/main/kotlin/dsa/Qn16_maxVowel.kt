package dsa

import kotlin.math.max

/*
* java sol(https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/solutions/3487378/java-sliding-window-beats-90-me/)
* java sol2 (https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/solutions/3487426/java-code-using-sliding-window/)
* java sol using HastSet (https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/solutions/3487743/easy-approach/)
* */
fun maxVowels(s: String, k: Int): Int {
    var countMax = 0
    var count = 0

    for (i in 0 until k) {
       count += isVowel(s.get(i))
    }
    countMax = count

    for (i in k until s.length) {
        count += -isVowel(s.get(i-k)) + isVowel(s.get(i))     // it's like why sub 0 here: -isVowel(s.get(i-k)) , jike jindigi mai aane se kuch count hi nahi hua, ab we chala gaya so kya gam, but vice-versa situation -1 (kami khal rahi hai)
        countMax = max(countMax, count)
    }

    return countMax
}

    fun isVowel(c: Char): Int {
        return if (c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'o') 1 else 0
    }


