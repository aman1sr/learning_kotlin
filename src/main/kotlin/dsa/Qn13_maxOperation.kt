package dsa


/*
* clever way to 1st sort then move 2 pointers (https://leetcode.com/problems/max-number-of-k-sum-pairs/solutions/4508800/easiest-solution-o-n-nlogn-two-pointers)
* both sol 0(N^2) & 0(N*logN) with good exp  (https://leetcode.com/problems/max-number-of-k-sum-pairs/solutions/4367159/o-n-2-o-nlogn-o-n-meme-checkpoint/)
* java HashMap sol Time Complexity 0(N)(https://leetcode.com/problems/max-number-of-k-sum-pairs/solutions/1901186/java-hashmap-solution-best-and-easy-in-few-lines/)
* */
fun maxOperations(nums: IntArray, k: Int): Int {

    var left = 0
    var right = nums.size - 1
    var count = 0
    nums.sort()
    while (left < right) {
        if (nums[left] + nums[right] == k) {
            count++
            left++
            right--
        } else if (nums[left] + nums[right] < k) {
            left++
        } else if (nums[left] + nums[right] > k) {
            right--
        }

    }
    return count
}
fun maxOperationsSol(nums: IntArray, k: Int): Int {        // todo: debug
    val map = HashMap<Int, Int>()
    var count = 0
    for (i in nums.indices) {
        //to check if that k-nums[i] present and had some value left or already paired
        if (map.containsKey(k - nums[i]) && map[k - nums[i]]!! > 0) {
            count++
            map[k - nums[i]] = map[k - nums[i]]!! - 1
        } else {
            //getOrDefault is easy way it directly checks if value is 0 returns 0 where I added 1
            //and if some value is present then it return that value "similar to map.get(i)" and I added 1 on it
            map[nums[i]] = map.getOrDefault(nums[i], 0) + 1
        }
    }
    return count
}