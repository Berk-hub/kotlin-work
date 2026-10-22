// Task 9.6: application to compute dataset variance

import java.io.IOException

fun main(args: Array<String>) {

    if (args.size != 1) {
        println("Error: Please provide a filename")
        return
    }

    try {
        val numbers = readData(args[0])

        val result = variance(numbers)

        println("Variance: $result")

    } catch (error: NumberFormatException) {
        println("Error: File contains invalid numbers")

    } catch (error: IllegalArgumentException) {
        println("Error: ${error.message}")

    } catch (error: IOException) {
        println("Error: Cannot read file")
    }
}