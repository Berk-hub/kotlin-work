import kotlin.io.path.Path
import kotlin.io.path.exists
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

typealias Database = MutableMap<String, String>

fun createDatabase(): Database {
    return mutableMapOf()
}

fun Database.load(filename: String) {

    val file = Path(filename)

    if (!file.exists()) return

    file.forEachLine { line ->

        val parts = line.split(",", limit = 2)

        if (parts.size == 2) {
            val name = parts[0].trim()
            val number = parts[1].trim()

            if (name.isNotEmpty() && number.isNotEmpty()) {
                this[name] = number
            }
        }
    }
}

fun Database.save(filename: String) {

    Path(filename).writer().use { output ->

        for ((name, number) in this) {
            output.write("$name,$number\n")
        }
    }
}