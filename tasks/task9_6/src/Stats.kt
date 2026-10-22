fun variance(numbers: List<Double>): Double {
    require(numbers.size >= 2) {
        "At least two numbers are required"
    }

    val mean = numbers.average()

    val sumOfSquares = numbers.sumOf {
        (it - mean) * (it - mean)
    }

    return sumOfSquares / (numbers.size - 1)
}
