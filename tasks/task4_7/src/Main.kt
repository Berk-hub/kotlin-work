// Task 4.7: finding the longest line in a file
import kotlin.io.path.Path
import kotlin.io.path.readLines
import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 1) {
        println("Error: Filename required")
        exitProcess(1)
    }

    val lines = Path(args[0]).readLines()

    if (lines.isEmpty()) {
        println("File is empty")
        return
    }

    var longestLine = 0
    var maxLength = -1

    for (i in lines.indices) {

        if (lines[i].length > maxLength) {
            maxLength = lines[i].length
            longestLine = i + 1
        }
    }

    println("Line $longestLine is the longest (length = $maxLength)")
}