fun main() {
    val n = readLine()!!.toInt()
    val elements = MutableList<Int>(n) { 0 }
    for (i in elements.indices)
        elements[i] = readLine()!!.toInt()

    val temp = elements[elements.lastIndex]
    for (i in elements.lastIndex downTo 1)
        elements[i] = elements[i - 1]
    elements[0] = temp

    println(elements.joinToString(" "))
}