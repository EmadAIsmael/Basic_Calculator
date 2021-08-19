fun main() {
    val string = readLine()!!
    val n = readLine()!!.toInt()

    val subStrings = string.split("\\s+".toRegex(), n)
    for (ss in subStrings)
        println(ss)
}