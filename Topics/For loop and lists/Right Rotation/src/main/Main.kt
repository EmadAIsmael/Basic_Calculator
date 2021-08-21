fun main() {
    val n = readLine()!!.toInt()
    val numbers = MutableList<Int>(n) { 0 }
    for (i in numbers.indices)
        numbers[i] = readLine()!!.toInt()
    val rotate = readLine()!!.toInt()

    numbers.rotateRight(rotate)
    println(numbers.joinToString(" "))
}

fun MutableList<Int>.rotateRight(r: Int) {
    val rr = r % this.size
    val head = this.slice(0..this.lastIndex - rr)
    val tail = this.slice(this.lastIndex - rr + 1..this.lastIndex)
    val rotated = tail + head
    for (i in this.indices)
        this[i] = rotated[i]
}
