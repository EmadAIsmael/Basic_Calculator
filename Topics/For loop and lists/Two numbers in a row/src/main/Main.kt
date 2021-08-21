fun main() {
    val n = readLine()!!.toInt()
    val numbers = MutableList<Int>(n) { 0 }
    for (i in numbers.indices)
        numbers[i] = readLine()!!.toInt()
    val pm = readLine()!!.split(" ").map { it.toInt() }.toList()

    var result = "YES"
    for (i in 0..numbers.lastIndex - 1)
        if (pm == listOf(numbers[i], numbers[i + 1]) ||
            pm == listOf(numbers[i + 1], numbers[i])
        ) {
            result = "NO"
            break
        }
    println(result)
}