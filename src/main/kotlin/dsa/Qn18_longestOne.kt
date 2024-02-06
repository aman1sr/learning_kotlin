package dsa

import kotlin.math.max
/*
* java intuitive sol: todo: counting 1 , using if-else inside loop
*                               (https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/solutions/4683004/easy-solution-java-better-than-98)
* java creative sol2 : tosee:
*                       (https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/solutions/3722183/creative-but-simple-java-solution-solves-the-problem-in-o-n-time)
* */
//fun longestSubarray(nums: IntArray): Int {
//var left =0
//    var right =0
//    var zeros=0
//    var maxCount =0
//    while (right < nums.size) {
//        if(nums[right]==0) zeros++
//        while (zeros > 1) {
//            if(nums[left]==0)zeros--
//            left++
//        }
//        maxCount = max(maxCount,right-left)
//        right++
//    }
//    if(zeros==0) return nums.size-1
//    else return maxCount
//}

fun longestSubarray(nums: IntArray): Int {
    var back = 0
    var count = 0
    var max = 0
    for (i in nums) {
        if (i == 1) count++
        else {
            max = max(max.toDouble(), (back + count).toDouble()).toInt()
            back = count
            count = 0
        }
    }
    max = max(max.toDouble(), (back + count).toDouble()).toInt()
    return if (max == nums.size) nums.size - 1 else max
}
