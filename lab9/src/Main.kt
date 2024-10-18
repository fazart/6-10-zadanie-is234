import kotlin.random.Random

fun main() {
    val randomNumbers = List(10) { Random.nextInt(1, 101) }
    println("Случайные числа от 1 до 100:")
    randomNumbers.forEach { println(it) }
}