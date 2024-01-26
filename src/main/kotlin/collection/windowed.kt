package collection

import kotlin.math.pow

/*
* Returns a list of snapshots of the window of the given size sliding along this collection with the given step, where each snapshot is a list.
    Several last lists may have fewer elements than the given size.
    Both size and step must be positive and can be greater than the number of elements in this collection.

        Params:
        size - the number of elements to take in each window
        step - the number of elements to move the window forward by on an each step, by default 1
        partialWindows - controls whether or not to keep partial windows in the end if any, by default false which means partial windows won't be preserved
* */


/*
* use windowed to calculate the average temperature for each set of consecutive N readings
* NOTE: check all 3 windowed(size,step,partialWindows) parameter
* */
fun calcAvgTemp() {
    val temperatures = listOf(18, 20, 22, 24, 23, 21, 19)
//    val movingAverages = temperatures.windowed(3,) {                     // takes by def 1 step at time
    val movingAverages = temperatures.windowed(3,3) {             //  takes now 3 step jump but eliminates the left over 19th element
//    val movingAverages = temperatures.windowed(3,3,true) {        //   here, it also includes last 19th element regardless of not making proper set of 3
        println("it = $it")
        it.average()
    }
    println("avg = ${movingAverages.toList()}") // Output: [20.0, 22.333333333333336, 22.666666666666668]
}

/*
* todo: to find pairs of words that appear within a certain distance (window size) of each other in at least two sentences
* */
fun findPairWords() {
    val sentences = listOf("The quick brown fox jumps over the lazy dog.", "The lazy dog barks at the quick brown fox.")
    val overlappingWords = sentences.flatMap { it.split(" ") }
        .windowed(4) { words ->
            words.filter { otherSentence ->
                sentences.any {
                    it.contains(otherSentence) && it != otherSentence.trim()
                } }
        }
        .flatten()
        .distinct()
    println(overlappingWords.toList()) // Output: [quick, brown, fox, lazy]
}


/*
* todo: windowed to analyze the data in real-time, comparing each window's statistical properties (mean, standard deviation)
*   to a baseline to identify sudden changes or deviations that might indicate an anomaly.
* */
fun processSensorData(dataStream: Sequence<Double>) {
    dataStream.windowed(100) { window ->
        val mean = window.average()
        val stdDev = standardDeviation(window)
        if (Math.abs(window.first() - mean) > 2 * stdDev) {
            // Alert about potential anomaly
        }
    }
}
fun standardDeviation(window: Collection<Double>): Double {
    val mean = window.average()
    val variances = window.map { (it - mean).pow(2) }
    val variance = variances.average()
    return Math.sqrt(variance)
}

