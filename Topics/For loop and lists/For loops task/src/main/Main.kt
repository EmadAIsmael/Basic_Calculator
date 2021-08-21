fun main() {
    val n = readLine()!!.toInt()
    val elements = MutableList<Int>(n) { 0 }
    for (i in elements.indices)
        elements[i] = readLine()!!.toInt()
    val (p, m) = readLine()!!.split(" ").map { it.toInt() }

    println(if (p in elements && m in elements) "YES" else "NO")
}