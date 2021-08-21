fun main() {
    val n = readLine()!!.toInt()
    val numbers = MutableList<Int>(n) { 0 }
    for (i in numbers.indices)
        numbers[i] = readLine()!!.toInt()
    val m = readLine()!!.toInt()

    println(if (m in numbers) "YES" else "NO")
}