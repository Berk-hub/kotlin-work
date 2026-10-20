// Task 7.7.1: statistics functions
fun median(numbers: List<Float>): Float {

    val sorted = numbers.sorted()

    val middle = sorted.size / 2

    return if (sorted.size % 2 == 1) {
        sorted[middle]
    } else {
        (sorted[middle - 1] + sorted[middle]) / 2f
    }
}

fun displayStats(numbers: List<Float>) {

    if (numbers.isEmpty()) {
        println("Error: File is empty")
        return
    }

    println("Minimum: ${numbers.min()}")
    println("Maximum: ${numbers.max()}")
    println("Mean: ${numbers.average()}")
    println("Median: ${median(numbers)}")
}