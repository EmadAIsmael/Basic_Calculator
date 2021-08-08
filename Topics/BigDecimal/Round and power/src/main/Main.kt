import java.math.BigDecimal
import java.math.RoundingMode.FLOOR

fun main() {
    // write your code here
    val power = readLine()!!.toInt()
    val mode = readLine()!!.toInt()
    var number = BigDecimal(readLine()!!)

    number = number.setScale(mode, FLOOR)
    number = number.pow(power)
    println(number)
}
