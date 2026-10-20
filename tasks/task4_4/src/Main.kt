// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal


fun main(args: Array<String>) {

    if (args.size != 3) {
        println("Error: Three values required")
        exitProcess(1)
    }

    val start = args[0].toDouble()
    val max = args[1].toDouble()
    val step = args[2].toDouble()

    if (step <= 0.0) {
        println("Error: Increment must be positive")
        exitProcess(1)
    }

    var celsius = start

    println("%10s %12s".format("Celsius", "Fahrenheit"))

    while (celsius <= max) {

        val fahrenheit = celsius * 9.0 / 5.0 + 32.0

        println("%10.1f %12.1f".format(celsius, fahrenheit))

        celsius += step
    }
}
