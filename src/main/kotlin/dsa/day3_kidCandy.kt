package dsa

/*
* sol: detailed approch explanantion: (https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/solutions/4328613/easy-to-understand-solution-o-n-approach/)
* sol: kotlin map f() One liner(https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/solutions/4080561/one-line-solution/)
* also see >(https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/solutions/3427682/kotlin-1431-kids-with-the-greatest-number-of-candies/)
* */
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val len = candies.size
    val resultArr = BooleanArray(len)
        for (i in 0..len - 1) {
            var isGreatest = true
            for (j in 0..len - 1) {
                if (candies.get(i) + extraCandies < candies.get(j)){
                    isGreatest = false
                    break
                }
            }
             resultArr[i] = isGreatest
        }
        println("resultArr : ${resultArr.toList()}")
        return resultArr.toList()
    }
