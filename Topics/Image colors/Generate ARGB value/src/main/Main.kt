fun printARGB() {
    val (a, r, g, b) = readLine()!!.split(" ").map { it.toInt() }

    if (arrayOf(a, r, g, b).any { it !in 0..255 }) {
        println("Invalid input")
    } else {
        val c = Color(r, g, b, a)
        println(c.rgb.toUInt())
    }
}
