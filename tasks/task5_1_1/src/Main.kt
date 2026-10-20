// Task 5.1.1: main program
fun main(args: Array<String>) {

    if (args.size != 2) {
        println("Error: Two words required")
        return
    }

    val first = args[0]
    val second = args[1]

    if (anagrams(first, second)) {
        println("$first and $second are anagrams")
    } else {
        println("$first and $second are not anagrams")
    }
}