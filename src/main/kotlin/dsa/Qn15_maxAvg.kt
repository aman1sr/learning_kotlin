package dsa

import kotlin.math.absoluteValue
import kotlin.math.max

/*
* java mathematical tigdam (https://leetcode.com/problems/maximum-average-subarray-i/solutions/3799916/java-100-faster-solution-sliding-window/)
* */
fun findMaxAverage(nums: IntArray, k: Int): Double {

    var sum = 0.0
    var maxSum = 0.0
    for (i in 0 until k)
        sum += nums[i]

    maxSum = sum
    for (i in k until nums.size) {
        sum+= nums[i] - nums[i-k]
        maxSum = max(sum,maxSum)
    }

    return String.format("%.5f", maxSum.div(k)).toDouble()
}

