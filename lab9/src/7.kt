fun reverseCase(input: String): String {
    return input.map {
        when {
            it.isLowerCase() -> it.toUpperCase()
            it.isUpperCase() -> it.toLowerCase()
            else -> it
        }
    }.joinToString("")
}

fun main() {
    val inputString = "Hello World"
    val reversedString = reverseCase(inputString)
    println("Строка с изменённым регистром: $reversedString")
}