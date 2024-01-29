package dsa
/*
* forEach iteration in string, inspired by: (https://leetcode.com/problems/string-compression/)
* java Sol (https://leetcode.com/problems/string-compression/solutions/4467773/java-c-o-n-simple-easy-solution-step-by-step-explanation/)
* */
fun compress(chars: CharArray): Int {   // don't know why leetcode don't accept the sol. even though it's returning right Value in Test Cases
    // 'a','a','b','b','c','c','c'
    if(chars.size==1) return 1
    var ch = StringBuilder()
    var count =1
    for (i in 0 until chars.size) {
        if(i != chars.size-1 && chars[i] == chars[i+1]) count++
        else {
            ch.append(chars[i].toString())
            if(count !=1 ){
//                ch.add(count.toString())          // when ch > charArray<Char>() giving an issue of in: 'a','b','b','b','b','b','b','b','b','b','b','b','b'   as: [a,b,12] but it should be: [a,b,1,2]
                count.toString().forEach {
                ch.append(it.toString())
                }
            }
            count =1
        }
    }
println("ch = ${ch}")
    return ch.length
}


