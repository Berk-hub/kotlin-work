fun main() {

    val text = "Hello Kotlin 123!"

    // Count vowels
    val vowels = text.howMany {
        it.lowercaseChar() in "aeiou"
    }

    // Count digits
    val digits = text.howMany {
        it.isDigit()
    }

    // Count uppercase letters
    val uppercase = text.howMany {
        it.isUpperCase()
    }

    println("Text: $text")
    println("Vowels: $vowels")
    println("Digits: $digits")
    println("Uppercase letters: $uppercase")

    // Compare with Kotlin's built-in count()
    println("Built-in digit count: ${text.count { it.isDigit() }}")
}