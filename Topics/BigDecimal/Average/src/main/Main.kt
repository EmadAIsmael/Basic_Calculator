import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val a = Array(3) { readLine()!!.toBigDecimal() }
    val mid = a.sumOf { it } / BigDecimal("3")
    println(mid.setScale(0, RoundingMode.DOWN))
}
