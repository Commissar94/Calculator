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
            "+" -> Addition(x,y)
            "-" -> Subtraction(x,y)
            "*" -> Multiplication(x,y)
            "/" -> Division(x,y)
            else -> println("wrong operator")
        }
    }

    class Addition(_x: Double, _y: Double){
        private val x =_x
        private val y =_y
        init { println(x + y) }
    }

    class Subtraction(_x: Double, _y: Double){
        private val x =_x
        private val y =_y
        init { println(x - y) }
    }

    class Multiplication(_x: Double, _y: Double){
        private val x =_x
        private val y =_y
        init { println(x * y) }
    }

    class Division(_x: Double, _y: Double){
        private val x =_x
        private val y =_y
        init { println(x / y) }
    }
}

class Expression(_x: Double, _y: Double, _operator: String) {

    val x = _x
    val y = _y
    val operator = _operator

}

