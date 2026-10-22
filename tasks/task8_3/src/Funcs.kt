import kotlin.io.path.Path
import kotlin.io.path.forEachLine

typealias Record = Pair<String, Double>

fun fetchData(filename: String): List<Record> = buildList {

    Path(filename).forEachLine { line ->

        val parts = line.split(",")

        val station = parts[0].trim()
        val temperature = parts[1].trim().toDouble()

        add(station to temperature)
    }
}

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0

    for (record in data) {
        sum += record.second
    }

    return sum / data.size
}