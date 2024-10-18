fun findLongestWord(input: String): String {
    val words = input.split("\\s+".toRegex())
    return words.maxByOrNull { it.filter { char -> char.isLetter() }.length } ?: ""
}

fun main() {
    val inputString = "Этот текст содержит несколько слов и мы ищем самое длинное"
    val longestWord = findLongestWord(inputString)
    println("Самое длинное слово: $longestWord")
}