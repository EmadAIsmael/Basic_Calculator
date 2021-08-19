fun isPrime(n: Int, i: Int = 3): Boolean {
    // a few base cases here
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    // if (n == i) return true
    if (n < i * i) return true

    // recursive case here
    return if (n % i == 0) false else isPrime(n, i + 2)
}

fun main() {
    val n = readLine()!!.toInt()
    print(isPrime(n))
}