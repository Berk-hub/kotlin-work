// Task 7.3.1: list element access
fun main() {

    val numbers = listOf(9, 3, 6, 2, 8, 5)

    println("List: $numbers")

    println("First index: ${numbers[0]}")

    println("Slice: ${numbers.slice(2..4)}")

    println("First element: ${numbers.first()}")

    println("Last element: ${numbers.last()}")

    // println(numbers[10])

    // numbers[0] = 1

    // numbers.add(1)
}