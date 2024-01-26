package dsa

import java.util.*
/*
* java detailed post (https://leetcode.com/problems/product-of-array-except-self/solutions/1342916/3-minute-read-mimicking-an-interview/)
* kotlin : done using 1 loop (https://leetcode.com/problems/product-of-array-except-self/solutions/4203737/96-no-extra-space-one-loop-3-solutions/)
*
* */
fun productExceptSelf(nums: IntArray): IntArray {       // issue time complexity very much
// arr = 1,2,3,4

    val newNums = IntArray(nums.size)
    for (i in 0..nums.size - 1) {
        var p = 1
        for (j in 0..nums.size - 1) {
            if(i==j) continue
            else p *=nums[j]
        }
        newNums[i] = p
    }

println("newNumsArr = $newNums")
    return newNums
}
fun productExceptSelf2(nums: IntArray): IntArray {      // todo: via 1 loop 
// arr = 2,4,5,6

    val n2 = IntArray(nums.size)
    Arrays.fill(n2,1)
    val n3 = IntArray(nums.size)
    Arrays.fill(n3,1)
    var c=1
    var x =1
    for(i in 0 until nums.size){
        n3[i]= c
        c *= nums[i]

        n2[(nums.size-1)-i] *= x *n3[(nums.size-1)-i]                           // placing 1 at from last digit to first
        x *= nums[(nums.size-1)-i]
    }

    println("newNumsArr = $n2")
    return n2
}
fun productExceptSo1(nums: IntArray) : IntArray {       // a bit hard to understand code, for input = [2,4,5,6] rev Engineer as Ans = [4x5x6, 2x5x6, 2x4x6, 2x4x5]
    /*
    * pre = [ 1, 2, 2x4, 2x4x5]
    * suff = [4x5x6, 5x6, 6, 1]
    *      ( so now he formulated the for loop in forward & downTo way
    * */
    val n = nums.size
    val pre = IntArray(n)
    val suff = IntArray(n)
    pre[0] =1
    suff[n-1] =1

    for(i in 1..n-1){
        pre[i] = pre[i-1] * nums[i-1]
    }
    for (i in n - 2 downTo 0) {
        suff[i] = suff[i+1]  * nums[i+1]
    }
    val ans = IntArray(n)
    for (i in 0..n-1) {
        ans[i] = pre[i]*suff[i]
    }

    return ans
}


    fun productExceptSo2(nums: IntArray): IntArray {
        val n = nums.size
        val ans = IntArray(n)
        Arrays.fill(ans, 1)
        var curr = 1
        for (i in 0 until n) {
            ans[i] *= curr
            curr *= nums[i]
        }
        curr = 1
        for (i in n - 1 downTo 0) {
            ans[i] *= curr
            curr *= nums[i]
        }
        return ans
    }

    fun productExcept3(nums: IntArray): IntArray {
        val end = nums.lastIndex
        val res = IntArray(nums.size) { 1 }
        var left = 1
        var right = 1

        for (i in nums.indices) {
            res[i] *= left
            res[end - i] *= right

            right *= nums[end - i]
            left *= nums[i]
        }

        return res
    }

