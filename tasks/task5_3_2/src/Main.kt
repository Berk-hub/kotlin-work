// Task 5.3.2: main program
fun main(args: Array<String>) {

    if (args.size != 1) {
        println("Error: Dice specification required")
        return
    }

    val parts = args[0].split('d')

    if (parts.size != 2) {
        println("Error: Use format like 3d6")
        return
    }

    val numberOfDice = parts[0].toIntOrNull()
    val sides = parts[1].toIntOrNull()

    if (numberOfDice == null || sides == null) {
        println("Error: Invalid numbers")
        return
    }

    rollDice(numberOfDice = numberOfDice, sides = sides)
}