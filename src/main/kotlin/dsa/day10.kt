package dsa

/*
* java : (https://leetcode.com/problems/move-zeroes/solutions/4218030/java-1ms-beats-100/)
* java :    same algo like ab, but simplicity (https://leetcode.com/problems/move-zeroes/solutions/3549476/easy-java-solution-beats-99-9/)
*
* using Only 1for Loop todo:(https://leetcode.com/problems/move-zeroes/solutions/4594739/garda-uda-diya-beats-16-25-users-best-java-solution/)
*             java + kotlin: (https://leetcode.com/problems/move-zeroes/solutions/1664500/java-to-kotlin-converted-solution-less-performant-with-kotlin/)
*      kotlin using 1loop (https://leetcode.com/problems/move-zeroes/solutions/3377277/two-pointer-solution/)
* */
fun moveZeroes(nums: IntArray): Unit {
    if (nums.size == 1) {
        return
    }
    var k = 0

    for (i in 0 until nums.size) {
        if (nums[i] != 0) {
            nums[k++]= nums[i]
        }
    }
    if (k > 0) {
        for (j in k until nums.size) {
            nums[j]=0
        }
    }
    println("nums: $nums")

}