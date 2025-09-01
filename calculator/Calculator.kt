class Calculator(val name: String) {

    init {
        println("Owner: $name")
    }

    fun add(num1: Int, num2: Int): Int {
        return (num1 + num2)
    }

    fun subtract(num1: Int, num2: Int): Int {
        return (num1 - num2)
    }

    fun multiply(num1: Int, num2: Int): Int {
        return (num1 * num2)
    }

    fun divide(num1: Int, num2: Int): Any? {
        if (num2 == 0)
            return (println("Error: division by 0"))
        else
            return (num1 / num2)
    }

    fun power(number: Int, power: Int): Int {
        var result = 1
        for (i in 1..power) {
            result *= number
        }
        return result
    }
}

fun main() {
    var calculator: Calculator = Calculator("Codey")
    println(calculator.add(1, 2))
    println(calculator.subtract(1, 2))
    println(calculator.multiply(1, 2))
    println(calculator.divide(1, 2))
    println(calculator.power(2, 2))
}