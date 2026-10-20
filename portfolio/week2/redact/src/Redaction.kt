// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(document: String, text: String, replacement: Char = 'X'): String {
    val hidden = replacement.toString().repeat(text.length)
    return document.replace(text, hidden)
}