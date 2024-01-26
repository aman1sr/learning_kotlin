package dsa
/*
* nice Java if else sol(https://leetcode.com/problems/increasing-triplet-subsequence/solutions/4345651/beats-100-super-easy-java-solution)
* */
fun increasingTriplet(nums: IntArray): Boolean {
// nums = 0,4,2,1,0,-1,-3
    var doesExist = false
    var counter = 0
    for (i in 0 until nums.size ) {
        for (j in i until nums.size) {
            if (nums[i] < nums[j]) {
                counter++
                if (counter >= 3) {
                    doesExist = true
                    break
                }
            }
        }
    }
    return doesExist
}

fun increasingTriplet2(nums: IntArray): Boolean {
// nums = 20,100,10,12,5,13
    var s1 : Int= nums[0]
    var s2 : Int?=null
    var s3 : Int?=null

    for (i in 0 until nums.size-1 ) {
        if (nums[i + 1] > nums[i]) {
            if (s2 == null) s2 = nums[i + 1]
            else {
                s3 = nums[i+1]
                break
            }

        } else {
            if (s2 != null && s1 < nums[i+1] ) {
                s2 = nums[i+1]
            } else {
                if(i<nums.size-3) continue          // used for case: 20,100,10,12,5,13   but failing against (1,2,1,3)
                s1 =  nums[i]
                s2 = null
            }

        }
    }

    if (!(s1 == null || s2 == null || s3 == null)) {
        return true
    } else {
        return false
    }
}

fun increasingTripletSol(nums: IntArray): Boolean{
    // nums = 1,2,1,3

    var s1 = Int.MAX_VALUE
    var s2 = Int.MAX_VALUE

    for (n in nums) {
       if(n <= s1) s1 = n
       else if(n <= s2) s2 = n
        else (return true)
    }
    return false
}