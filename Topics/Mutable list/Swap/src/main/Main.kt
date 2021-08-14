fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    val a = numbers.first()
    val b = numbers.last()

    numbers[0] = b
    numbers[numbers.lastIndex] = a

    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}