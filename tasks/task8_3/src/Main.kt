fun main(args: Array<String>) {

    if (args.size != 1) {
        println("Error: Please provide a CSV filename.")
        return
    }

    val data = fetchData(args[0])

    if (data.isEmpty()) {
        println("Error: No temperature data.")
        return
    }

    val lowest = data.minBy { it.second }

    val highest = data.maxBy { it.second }

    val average = data.sumOf { it.second } / data.size

    println("Coldest: ${lowest.first} (${lowest.second})")
    println("Warmest: ${highest.first} (${highest.second})")
    println("Average: %.2f".format(average))
}