import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 101)
    var guess: Int
    var attempts = 0

    println("Добро пожаловать в игру 'Угадай число'!")
    do {
        print("Введите вашу догадку: ")
        guess = readLine()!!.toInt()

        when {
            guess < secretNumber -> println("Загаданное число больше")
            guess > secretNumber -> println("Загаданное число меньше")
        }

        attempts++
    } while (guess != secretNumber)

    println("Поздравляем! Вы угадали число $secretNumber за $attempts попыток.")
}