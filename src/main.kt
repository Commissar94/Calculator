import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    val x = scanner.nextDouble()
    val y = scanner.nextDouble()

    when (val operator = scanner.next()) {
        "+" -> Calculation(x, y, operator).addition()
        "-" -> Calculation(x, y, operator).subtraction()
        "*" -> Calculation(x, y, operator).multiplication()
        "/" -> Calculation(x, y, operator).division()
        else -> println("wrong operator")
    }
}

class Calculation(_x: Double, _y: Double, _operator: String) {

    private val x = _x
    private val y = _y
    val operation = _operator

    fun addition() {
        println(x + y)
    }

    fun subtraction() {
        println(x - y)
    }

    fun multiplication() {
        println(x * y)
    }

    fun division() {
        println(x / y)
    }

}