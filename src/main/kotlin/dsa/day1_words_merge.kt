package dsa

/*
*
* very beatifully used string builder (https://leetcode.com/problems/merge-strings-alternately/solutions/3430543/kotlin-o-m-n-beat-100/?envType=study-plan-v2&envId=leetcode-75)
* nice simple using Str (https://leetcode.com/problems/merge-strings-alternately/solutions/3429429/easy-kotlin-solution)
* a bit hard to understand, find logic by debug (https://leetcode.com/problems/merge-strings-alternately/solutions/4220402/beat-95-kotlin-solution)
* */
fun mergeAlternately(word1: String, word2: String): String {
    val len1 = word1.length
    val len2 = word2.length
    // 3 case >> equal , len1>len2  else


    var i =0
    var str = ""
    if (len1 == len2) {
        word1.map {l1 ->
            val l2 = word2.toCharArray()
            str = str + "$l1${l2.get(i)}"
            i++
        }
    }else if (len1 < len2) {
        val l1 = word1.toCharArray()
        word2.map { l2 ->
            if (i <= len1 - 1) {
                str = str + "${l1.get(i)}$l2"
                i++
            } else {
                str = str + "$l2"
            }
        }
    } else {
        val l2 = word2.toCharArray()
        word1.map { l1 ->
            if (i <= len2 - 1) {
                str = str + "$l1${l2.get(i)}"
                i++
            } else {
                str = str + "$l1"
            }
        }
    }

return str
}