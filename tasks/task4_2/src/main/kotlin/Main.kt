// Task 4.2: use of if and ranges

fun main() {
    println("PIZZA MENU")
    println("a) Margherita")
    println("b) Pepperoni")
    println("c) Vegetarian")
    println("d) Hawaiian")

    print("Choose a pizza (a-d): ")

    val choice = readln().lowercase()

    if (choice.length == 1 && choice[0] in 'a'..'d') {
        println("Order accepted")
    } else {
        println("Invalid choice!")
    }
}