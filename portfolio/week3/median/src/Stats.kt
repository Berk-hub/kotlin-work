fun median(values: List<Float>): Float {

    require(values.isNotEmpty()) {
        "List must not be empty"
    }

    val sorted = values.sorted()

    val middle = sorted.size / 2

    return if (sorted.size % 2 == 1) {
        sorted[middle]
    } else {
        (sorted[middle - 1] + sorted[middle]) / 2.0f
    }
}