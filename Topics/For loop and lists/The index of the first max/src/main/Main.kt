fun main() {
    val n = readLine()!!.toInt()
    val numbers = MutableList<Int>(n) { 0 }
    for (i in numbers.indices)
        numbers[i] = readLine()!!.toInt()
    var max = Int.MIN_VALUE
    var index: Int? = null
    for ((i, v) in numbers.withIndex())
        if (v > max) {
            max = v
            index = i
        }

    println(index)
}