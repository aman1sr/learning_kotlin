package dsa
/*
*
* */

fun isSubsequence(s: String, t: String): Boolean {
    if(s.length==0) return true
    var k=0
    for (ch in t) {
        if (s.get(k) == ch) {
            k++
        }
        if(k == s.length){
            return true
        }
    }
    return false
}