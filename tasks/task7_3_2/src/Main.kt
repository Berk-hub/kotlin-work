fun main() {

    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)

    println("Original: $numbers")

    // Change first element
    numbers[0] = 1
    println("Modified: $numbers")

    // Add an element
    numbers.add(10)
    println("After add: $numbers")

    // Add multiple elements
    numbers.addAll(listOf(11, 12))
    println("After addAll: $numbers")

    // Remove a value
    numbers.remove(3)
    println("After remove: $numbers")

    // Remove multiple values
    numbers.removeAll(listOf(6, 8))
    println("After removeAll: $numbers")

    // Remove element at index 0
    numbers.removeAt(0)
    println("After removeAt: $numbers")

    // Remove everything
    numbers.clear()
    println("After clear: $numbers")
}