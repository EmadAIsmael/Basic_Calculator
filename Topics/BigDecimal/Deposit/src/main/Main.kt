import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val principal = readLine()!!.toBigDecimal()
    val rate = (readLine()!!.toDouble() / 100).toBigDecimal()
    val years = readLine()!!.toInt()

    val compounding = (BigDecimal.ONE + rate).pow(years)

    val amount = (principal * compounding).setScale(2, RoundingMode.CEILING)
    println("Amount of money in the account: $amount")
}
