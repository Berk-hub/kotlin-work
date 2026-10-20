// Task 5.1.2: main program
fun main(args: Array<String>) {

    if (args.size != 1) {
        println("Error: Please provide the number of die sides")
        return
    }

    val sides = args[0].toIntOrNull()

    if (sides == null) {
        println("Error: Please enter a valid number")
        return
    }

    rollDie(sides)
}