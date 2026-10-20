fun main(args: Array<String>) {

    if (args.size > 1) {
        println("Error: Too many arguments")
        return
    }

    if (args.isEmpty()) {

        rollDie()

    } else {

        val sides = args[0].toIntOrNull()

        if (sides == null) {
            println("Error: Invalid number")
            return
        }

        rollDie(sides)
    }
}