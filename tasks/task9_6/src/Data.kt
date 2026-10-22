import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun readData(filename: String): List<Double> = buildList {
    Path(filename).forEachLine { line ->
        if (line.isNotBlank()) {
            add(line.trim().toDouble())
        }
    }
}
