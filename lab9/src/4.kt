fun checkAnagram(str1: String, str2: String): Boolean {
    val s1 = str1.toLowerCase().filter { it.isLetter() }.toList().sorted()
    val s2 = str2.toLowerCase().filter { it.isLetter() }.toList().sorted()
    return s1 == s2
}

fun main() {
    val word1 = "listen"
    val word2 = "silent"
    if (checkAnagram(word1, word2)) {
        println("$word1 и $word2 - анаграммы")
    } else {
        println("$word1 и $word2 - не анаграммы")
    }
}