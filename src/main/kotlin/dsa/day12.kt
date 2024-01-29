package dsa

import kotlin.math.absoluteValue
import kotlin.math.min
/*
* java (https://leetcode.com/problems/container-with-most-water/submissions/1160448787)
*
* */
fun maxArea(height: IntArray): Int {
    var ar = 0
    var left =0
    var right = height.size-1
    while (left < right) {
        val l = min(height[left],height[right])
        val b = (right-left).absoluteValue
        ar = maxOf(ar,l*b)

        if(height[left]<height[right]) left++
        else    right--
    }

   return ar
}