package dsa

/*
* NOT that eff (https://leetcode.com/problems/can-place-flowers/solutions/3318945/simple-100-fast-o-n-kotlin/)
* */
fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    // check the 1st occurance of 3 consequtive 3 0s
    var i = 0
    var newFlower = n
    while (i < flowerbed.size - 3) {
        if ((flowerbed[0]==0 && flowerbed[1]==0) ||
            (flowerbed[flowerbed.size-1]==0 && flowerbed[flowerbed.size-2]==0) ||
            (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i + 2] == 0 )) {
            i = i + 2
            newFlower -= 1
        } else {
            i++
        }
        if (newFlower == 0) {
            return true
        }
    }
    return false
}

fun guyPlaceFlowerSol(flowerbed: IntArray, n: Int): Boolean {
    var plots = n
    var i = 0
    while(i<flowerbed.size && plots>0){
        if(flowerbed[i]==0 &&
            (i-1<0 || flowerbed[i-1]==0) &&                     // when i=0 & let flowerbed[i] =0                     (T,exception) = T
            (i+1>=flowerbed.size || flowerbed[i+1]==0)){            // when i= last position  & let flowerbed[i] =0   (T, exception) = T
            plots--
            flowerbed[i] = 1
            i++
        }
        i++
    }
    return plots==0
}
