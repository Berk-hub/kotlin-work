fun String.howMany(include: (Char) -> Boolean): Int {
    var count = 0

    for (character in this) {
        if (include(character)) {
            count++
        }
    }

    return count
}
