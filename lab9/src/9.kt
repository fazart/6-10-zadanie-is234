fun generatePassword(length: Int): String {
    val charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+"
    return (1..length)
        .map { charset.random() }
        .joinToString("")
}

fun main() {
    val passwordLength = 12
    val password = generatePassword(passwordLength)
    println("Сгенерированный пароль: $password")
}