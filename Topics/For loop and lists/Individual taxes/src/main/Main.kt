fun main() {
    val n = readLine()!!.toInt()
    val income = MutableList<Int>(n) { 0 }
    for (i in income.indices)
        income[i] = readLine()!!.toInt()
    val taxes = MutableList<Int>(n) { 0 }
    for (i in taxes.indices)
        taxes[i] = readLine()!!.toInt()

    var index: Int? = null
    var highestTax = Int.MIN_VALUE
    for ((i, t) in taxes.withIndex()) {
        val tax = t * income[i]
        if (tax > highestTax) {
            highestTax = tax
            index = i
        }
    }
    println(index?.plus(1))
}