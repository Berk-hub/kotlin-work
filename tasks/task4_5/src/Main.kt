// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 1) {
        println("Error: One number required")
        exitProcess(1)
    }

    val limit = args[0].toIntOrNull()

    if (limit == null || limit < 1) {
        println("Error: Enter a positive integer")
        exitProcess(1)
    }

    var sum = 0L

    for (number in 1..limit step 2) {
        sum += number.toLong()
    }

    println(sum)
}