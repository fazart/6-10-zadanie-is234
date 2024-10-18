fun sortStrings(strings: Array<String>): Array<String> {
    return strings.sortedArray()
}

fun main() {
    val strings = arrayOf("banana", "apple", "orange", "grape")
    val sortedStrings = sortStrings(strings)
    println("Отсортированный массив строк:")
    sortedStrings.forEach { println(it) }
}