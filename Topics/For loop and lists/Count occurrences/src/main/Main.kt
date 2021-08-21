fun main() {
    val n = readLine()!!.toInt()
    val numbers = MutableList<Int>(n) { 0 }
    for (i in numbers.indices)
        numbers[i] = readLine()!!.toInt()
    val m = readLine()!!.toInt()

    var count = 0
    for (v in numbers)
        if (v == m) count++

    println(count)
}