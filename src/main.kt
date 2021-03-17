import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)

    val expression = Expression(scanner.nextDouble(), scanner.nextDouble(), scanner.next())
    Calculation(expression)
}

class Calculation(expression: Expression) {

    private val x = expression.x
    private val y = expression.y
    private val operator = expression.operator

    init {
        when (operator) {
            "+" -> addition()
            "-" -> subtraction()
            "*" -> multiplication()
            "/" -> division()
            else -> println("wrong operator")
        }
    }

    fun addition() { println(x + y) }

    fun subtraction() { println(x - y) }

    fun multiplication() { println(x * y) }

    fun division() { println(x / y) }

}

class Expression(_x: Double, _y: Double, _operator: String) {

    val x = _x
    val y = _y
    val operator = _operator

}

