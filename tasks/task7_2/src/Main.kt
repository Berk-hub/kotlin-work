// Task 7.2: array comparison
fun main() {
    val numbers = arrayOf(9, 6, 3, 2)

    val cls = numbers::class

    println(cls.qualifiedName)
    println(cls.java)
}