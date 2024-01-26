package dsa

import collection.str

/*
* eispoohw sol: simple GCD check: (Giveing Mathamatical resonining) https://leetcode.com/problems/greatest-common-divisor-of-strings/solutions/3126608/kotlin-100-runtime/?envType=study-plan-v2&envId=leetcode-75
* 
*
* */
fun gcdOfStrings(str1: String, str2: String): String {      // forgot to see this t condition  (s = t + ... + t)  >> could be done using substring, i pos read >> substring (len-i) check & store in var.
val len1 = str1.length
    val len2 = str2.length
    var i=0
    val str = StringBuffer()
    while (i < minOf(len1, len2)) {
        if (str1[i] == str2[i]) {
            if (str1.substring(0,i).equals(str1.substring(len1 - i))) {
                str.append(str1.substring(i))
            }
        }
        i++
    }
println("gcdOfStrings: ${str.toSet().joinToString("")}")
    return str.toSet().joinToString("")
}

/* eispoohw ANS*/

fun  eispoohwGcdSol(str1: String, str2: String): String {
    // check if gcd exists
    if (str1 + str2 != str2 + str1) {
        return ""
    }
    // count gcd of string lenghths
    var l1 = str1.length
    var l2 = str2.length
    while (l1 != l2) {
        if(l1>l2) {
            l1 -= l2
        }
        else {
            l2 -= l1
        }
        }

println("gcdOfStr = ${str1.substring(0,l1)}")
    return str1.substring(0,l1)     // why not l2/str2 becuase at the end when str are GCD, after passing from while loop, l1=l2 & therefore in either case would be same
}
