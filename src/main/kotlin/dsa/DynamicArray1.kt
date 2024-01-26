package dsa

/*
*  require:
*  is a function in Kotlin that throws an IllegalArgumentException if the given condition is not met. It is similar to the assert keyword in other languages, but it is intended for checking preconditions that should always be true, rather than for debugging purposes.
*
* */
class DynamicArray(capacity: Int) {
    private var capacity: Int
    private var size: Int
    private var array: IntArray

    init {
        require(capacity > 0) { "Capacity must be greater than 0" }
        this.capacity = capacity
        this.size = 0
        this.array = IntArray(capacity)
    }

    fun getCapacity(): Int {
        return capacity
    }

    fun getSize(): Int {
        return size
    }

    fun get(i: Int): Int {
        require(i in 0 until size) { "Index out of bounds" }
        return array[i]
    }
    fun getArray() : IntArray{
        return array
    }

    fun set(i: Int, n: Int) {
        require(i in 0 until size) { "Index out of bounds" }
        array[i] = n
    }

    fun pushback(n: Int) {
        if (size == capacity) {
            resize()
        }
        array[size++] = n
    }

    fun popback(): Int {
        require(size > 0) { "Array is empty" }
        return array[--size]
    }

    private fun resize() {
        capacity *= 2
        val newArray = IntArray(capacity)
        System.arraycopy(array, 0, newArray, 0, size)
        array = newArray
    }

}