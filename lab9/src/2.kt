fun countVowelsAndConsonants(input: String): Pair<Int, Int> {
    val vowels = "aeiouAEIOU"
    var vowelCount = 0
    var consonantCount = 0

    for (char in input) {
        if (char.isLetter()) {
            if (char in vowels) {
                vowelCount++
            } else {
                consonantCount++
            }
        }
    }

    return Pair(vowelCount, consonantCount)
}

fun main() {
    val inputString = "Hello World"
    val (vowels, consonants) = countVowelsAndConsonants(inputString)
    println("Количество гласных: $vowels")
    println("Количество согласных: $consonants")
}