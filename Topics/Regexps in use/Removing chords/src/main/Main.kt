fun main() {
    val text = readLine()!!
    val cleanText = text.replace("\\b(Am|A|Em|E|Dm|D|G|C)\\b\\s?".toRegex(), "")
    println(cleanText)
}