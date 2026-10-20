import kotlin.random.Random

fun rollDice(numberOfDice: Int = 1, sides: Int = 6) {

    if (numberOfDice <= 0 || sides !in setOf(4, 6, 8, 10, 12, 20)) {
        println("Error: Invalid dice")
        return
    }

    var total = 0

    for (i in 1..numberOfDice) {
        val result = Random.nextInt(1, sides + 1)

        println("Dice $i: $result")

        total += result
    }

    println("Total score: $total")
}