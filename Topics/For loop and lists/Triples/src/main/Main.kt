fun main() {
    val n = readLine()!!.toInt()
    val numbers = MutableList<Int>(n) { 0 }
    for (i in numbers.indices)
        numbers[i] = readLine()!!.toInt()

    var triples = 0
    for (i in 0..numbers.lastIndex - 2) {
        if (numbers[i] + 1 == numbers[i + 1] &&
            numbers[i] + 2 == numbers[i + 2]
        ) {
            triples++
        }
    }

    println(triples)
}