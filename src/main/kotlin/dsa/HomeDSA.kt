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
//    day11()

//    day12()
//    Qn13()

//    Qn14()
//    Qn16()
//    Qn17()
    Qn18()
    // todo: 2 Qns more Sliding window : (https://leetcode.com/problems/maximum-students-taking-exam/description/)
    //                                  (https://leetcode.com/problems/display-table-of-food-orders-in-a-restaurant/description/)

    Qn19()
}

class Qn19 {

}

fun Qn18() {
    println(3== longestSubarray(intArrayOf(0,1,1,1)))
    println(0== longestSubarray(intArrayOf(0,0,0)))
    println(3== longestSubarray(intArrayOf(1,1,0,1)))
    println(5== longestSubarray(intArrayOf(0,1,1,1,0,1,1,0,1)))
    println(2== longestSubarray(intArrayOf(1,1,1)))
}

fun Qn17() {
    /*
    * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
    * */
    println(5 == longestOnes(intArrayOf(1,1,1,0,0,0,1),2))
    println(6 == longestOnes(intArrayOf(1,1,1,0,0,0,1,1,1,1,0),2))
    println(10 == longestOnes(intArrayOf(0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1),3))
}

fun Qn16() {
    /*
    * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
    * */
    println(2 == maxVowels("aeiou", 2))

    println(3 == maxVowels("abciiidef", 3))

    println(2 == maxVowels("leetcode", 3))

}

fun Qn14() {
    /*
    * You are given an integer array nums consisting of n elements, and an integer k.
    *   Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value
    * */
    println(3.33333 == findMaxAverage(intArrayOf(3, 3, 4, 3, 0), 3))

    println(
        -594.58065 == findMaxAverage(
            intArrayOf(
                8860,
                -853,
                6534,
                4477,
                -4589,
                8646,
                -6155,
                -5577,
                -1656,
                -5779,
                -2619,
                -8604,
                -1358,
                -8009,
                4983,
                7063,
                3104,
                -1560,
                4080,
                2763,
                5616,
                -2375,
                2848,
                1394,
                -7173,
                -5225,
                -8244,
                -809,
                8025,
                -4072,
                -4391,
                -9579,
                1407,
                6700,
                2421,
                -6685,
                5481,
                -1732,
                -8892,
                -6645,
                3077,
                3287,
                -4149,
                8701,
                -4393,
                -9070,
                -1777,
                2237,
                -3253,
                -506,
                -4931,
                -7366,
                -8132,
                5406,
                -6300,
                -275,
                -1908,
                67,
                3569,
                1433,
                -7262,
                -437,
                8303,
                4498,
                -379,
                3054,
                -6285,
                4203,
                6908,
                4433,
                3077,
                2288,
                9733,
                -8067,
                3007,
                9725,
                9669,
                1362,
                -2561,
                -4225,
                5442,
                -9006,
                -429,
                160,
                -9234,
                -4444,
                3586,
                -5711,
                -9506,
                -79,
                -4418,
                -4348,
                -5891
            ), 93
        )
    )
    println(2.00000 == findMaxAverage(intArrayOf(0, 1, 1, 3, 3), 4))
    println(12.75 == findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4))
}

fun Qn13() {
    println(2 == maxOperations(intArrayOf(2, 2, 2, 3, 1, 1, 4, 1), 4))
    println(2 == maxOperations(intArrayOf(4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4), 2))
    println(1 == maxOperations(intArrayOf(3, 1, 3, 4, 3), 6))
    println(2 == maxOperations(intArrayOf(1, 2, 3, 4), 5))
}

fun day12() {
    println(17 == maxArea(intArrayOf(2, 3, 4, 5, 18, 17, 6)))
    println(49 == maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
    println(1 == maxArea(intArrayOf(1, 1)))
}

fun day11() {
    println(isSubsequence("abc", "ahbgdc"))
    println(isSubsequence("axc", "ahbgdc"))
}

fun day10() {
    println(moveZeroes(intArrayOf(0, 1, 0, 3, 12)))

    println(moveZeroes(intArrayOf(2, 1)))
    println(moveZeroes(intArrayOf(1, 0)))

    println(moveZeroes(intArrayOf(0, 3, 1)))

    println(moveZeroes(intArrayOf(0)))
}

fun day9() {
    println(6 == compress(charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')))
    println(1 == compress(charArrayOf('a')))
    println(4 == compress(charArrayOf('a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b')))
    println("---------------sol-------------------")


}

fun day8() {
//    println(increasingTriplet(intArrayOf(1, 2, 3, 4, 5, 6)))
//    println(increasingTriplet(intArrayOf(2, 1, 5, 0, 4, 6)))
//    println(increasingTriplet2(intArrayOf(2,1,5,0,4,6)))
    println(increasingTripletSol(intArrayOf(20, 100, 10, 12, 5, 13)))
    println(increasingTripletSol(intArrayOf(1, 2, 1, 3)))

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
