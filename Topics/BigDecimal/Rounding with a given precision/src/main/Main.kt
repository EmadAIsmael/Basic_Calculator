import java.math.RoundingMode

fun main() {             
    val num = readLine()!!.toBigDecimal()
    val newScale = readLine()!!.toInt()

    println(num.setScale(newScale, RoundingMode.HALF_DOWN))
}