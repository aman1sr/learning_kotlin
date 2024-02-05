package dsa

import kotlin.math.max

/*
* java sol (https://leetcode.com/problems/max-consecutive-ones-iii/solutions/4483454/java-c-o-n-simple-easy-solution-step-by-step-explanation)
* Approach::::::
1) Initialize two pointers, left and right, both set to the beginning of the array.
2) Move the right pointer to the right, and if the element at the right position is 0, increment the zeroCount.
3) Enter a while loop to check if the number of zeros within the current window is greater than k. If true, move the left pointer to the right until the window satisfies the constraint.
4) Update the maxOnes by calculating the length of the current window (right - left + 1).
5) Continue the process until the right pointer reaches the end of the array.
6) Return the maximum length of a subarray with at most k zeros.
*
* java Sol2: approch same, exe diff(https://leetcode.com/problems/max-consecutive-ones-iii/solutions/4593524/simple-java-code-using-sliding-window-beats-100)
*
* */

fun longestOnes(nums: IntArray, k: Int): Int {
    // 1,1,1,0,0,0,1,1,1,1,0
    var l = 0
    var r = 0
    var countZero=0
    var maxCount = 0
    while (r < nums.size) {
        if(nums[r]==0) countZero++
        while (countZero > k) {
            if(nums[l]==0) countZero--
             l++
        }
         maxCount = max(maxCount,r-l+1)
        r++
    }
    return maxCount
}


//fun longestOnes(nums: IntArray, k: Int): Int {
//    var left = 0
//    var right = 0
//    var maxOnes = 0
//    var zeroCount = 0
//    while (right < nums.size) {
//        if (nums[right] == 0) {
//            zeroCount++
//        }
//        while (zeroCount > k) {
//            if (nums[left] == 0) {
//                zeroCount--
//            }
//            left++
//        }
//        maxOnes = max(maxOnes, (right - left + 1))
//        right++
//    }
//    return maxOnes
//}