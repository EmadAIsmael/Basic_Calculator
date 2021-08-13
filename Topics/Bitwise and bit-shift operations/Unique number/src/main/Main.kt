fun main() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    // write your code here
    // short solution
    // println(a xor b xor c)
    //
    println(
        when {
            a and b == a -> c
            a and c == a -> b
            else -> a
        }
    )
}