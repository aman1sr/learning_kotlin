package plusUltra
/*
* youtube: problem1: visulalizing Recurssion (https://www.youtube.com/watch?v=ngCos392W4w&t=224s)
* */
fun main() {
    println(sumStuff(5))
}
fun sumStuff(num: Int): Int {
    if(num ==0) return 0
    else
        return num + sumStuff(num-1)
}