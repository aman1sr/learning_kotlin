package dsa

import java.util.Arrays

lateinit var list: MutableList<String>
fun main() {
    //    dynamicArray()

//    day1()      // str mergeAlternately
//    day2()      // Greatest Common Divisor of Strings
//    day3()
//day4()
//day5()
//day6()
//    day7()
//    day8()
//    day9()

//    day10()
    day11()

}

fun day11() {
println(isSubsequence("abc","ahbgdc"))
println(isSubsequence("axc","ahbgdc"))
}

fun day10() {
    println(moveZeroes(intArrayOf(0,1,0,3,12)))

    println(moveZeroes(intArrayOf(2,1)))
    println(moveZeroes(intArrayOf(1,0)))

    println(moveZeroes(intArrayOf(0,3,1)))

    println(moveZeroes(intArrayOf(0)))
}

fun day9() {
    println(6 == compress(charArrayOf('a','a','b','b','c','c','c')))
    println(1 == compress(charArrayOf('a')))
    println(4 == compress(charArrayOf('a','b','b','b','b','b','b','b','b','b','b','b','b')))
    println("---------------sol-------------------")
 

}

fun day8() {
//    println(increasingTriplet(intArrayOf(1, 2, 3, 4, 5, 6)))
//    println(increasingTriplet(intArrayOf(2, 1, 5, 0, 4, 6)))
//    println(increasingTriplet2(intArrayOf(2,1,5,0,4,6)))
    println(increasingTripletSol(intArrayOf(20,100,10,12,5,13)))
    println(increasingTripletSol(intArrayOf(1,2,1,3)))

}

fun day7() {
    println(Arrays.equals(intArrayOf(24, 12, 8, 6), productExceptSelf(intArrayOf(1, 2, 3, 4))))

    println(Arrays.equals(intArrayOf(120, 60, 48, 40), productExceptSo1(intArrayOf(2, 4, 5, 6))))
    println(Arrays.equals(intArrayOf(24, 12, 8, 6), productExceptSo1(intArrayOf(1, 2, 3, 4))))
    println(Arrays.equals(intArrayOf(-4, -2, -4, 2), productExceptSo1(intArrayOf(1, 2, 1, -2))))

    println(Arrays.equals(intArrayOf(120, 60, 48, 40), productExceptSo2(intArrayOf(2, 4, 5, 6))))
    println(Arrays.equals(intArrayOf(-4, -2, -4, 2), productExceptSo2(intArrayOf(1, 2, 1, -2))))

    println(Arrays.equals(intArrayOf(120, 60, 48, 40), productExceptSelf2(intArrayOf(2, 4, 5, 6))))
    println(Arrays.equals(intArrayOf(-4, -2, -4, 2), productExceptSelf2(intArrayOf(1, 2, 1, -2))))


}

fun day6() {
    println("blue is sky the".equals(reverseWords("the sky is blue")))
    println("example good a".equals(reverseWords("a good   example")))
}

fun day5() {
//    println("holle".equals(reverseVowels1attempt("hello")))
//    println("leotcede".equals(reverseVowels1attempt("leetcode")))

    println("leotcede".equals(reverseVowels2attempt("lleetcode")))
    println("holle".equals(reverseVowels2attempt("hello")))


}

fun day4() {
    /* MY ONE */
//    println(canPlaceFlowers(intArrayOf(1,0,0,0,1),1))
//    println(canPlaceFlowers(intArrayOf(1,0,0,0,1),2))
//    println(canPlaceFlowers(intArrayOf(0,0,1,0,1),1))
//    println(canPlaceFlowers(intArrayOf(1,0,0,0,1,0,0),2))               // expected true
//    println(canPlaceFlowers(intArrayOf(0,0,1,0,0),2))               // expected true

    /* His sol. */
    println(guyPlaceFlowerSol(intArrayOf(1, 0, 0, 0, 1, 0, 0), 2))               // expected true
    println(guyPlaceFlowerSol(intArrayOf(0, 0, 1, 0, 0), 2))               // expected true


}

fun day3() {
    println(listOf(true, true, true, false, true).equals(kidsWithCandies(intArrayOf(2, 3, 5, 1, 3), 3)))
}

/*
* For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
* Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
*
* */
fun day2() {
//println("ABC".equals(gcdOfStrings("ABCABC","ABC")))
//println("AB".equals(gcdOfStrings("ABABAB","ABAB")))
//println("".equals(gcdOfStrings("LEET","CODE")))
//println("ABC".equals(gcdOfStrings("ABCDEF","ABC")))

    println("ABC".equals(eispoohwGcdSol("ABCABC", "ABC")))
    println("ABC".equals(eispoohwGcdSol("ABCDEF", "ABC")))
}

fun day1() {
    println("apbqcr".equals(mergeAlternately("abc", "pqr")))
    println("apbqrs".equals(mergeAlternately("ab", "pqrs")))
    println("apbqcd".equals(mergeAlternately("abcd", "pq")))
}

fun dynamicArray() {
    val dynamicArray = DynamicArray(1)
    println(dynamicArray.getCapacity())
    dynamicArray.pushback(1)
    println(dynamicArray.getCapacity())
    dynamicArray.pushback(2)
    println(dynamicArray.getCapacity())
    println(dynamicArray.getArray().size)

}
