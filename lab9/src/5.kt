fun findPrimesUpToN(n: Int): List<Int> {
    val primes = mutableListOf<Int>()
    for (num in 2..n) {
        if ((2..num-1).all { num % it != 0 }) {
            primes.add(num)
        }
    }
    return primes
}

fun main() {
    val n = 30
    val primes = findPrimesUpToN(n)
    println("Простые числа до $n: $primes")
}