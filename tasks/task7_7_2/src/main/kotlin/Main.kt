const val CSV_FILENAME = "phone.csv"

fun main() {

    val database = createDatabase()

    database.load(CSV_FILENAME)

    println("PHONE BOOK")
    println("Press Enter without a name to exit.")

    while (true) {

        print("Enter name: ")
        val name = readln().trim()

        if (name.isEmpty()) {
            break
        }

        val number = database[name]

        if (number != null) {

            println("Phone number: $number")

        } else {

            print("Enter phone number: ")
            val newNumber = readln().trim()

            if (newNumber.isEmpty()) {
                println("No number saved.")
                continue
            }

            database[name] = newNumber

            database.save(CSV_FILENAME)

            println("Contact saved!")
        }
    }

    println("Goodbye!")
}