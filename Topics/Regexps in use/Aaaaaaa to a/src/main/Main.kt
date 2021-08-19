fun main() {
    val text = readLine()!!
    // write your code here
    val newText = text.replace("[aA]+".toRegex(), "a")
    println(newText)
}