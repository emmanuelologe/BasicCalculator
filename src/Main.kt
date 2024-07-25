import java.util.Scanner

// A class representing the Calculator
class Calculator {
    // Function to add two numbers
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    // Function to subtract two numbers
    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    // Function to multiply two numbers
    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    // Function to divide two numbers
    fun divide(a: Double, b: Double): Double {
        // Check for division by zero
        if (b == 0.0) {
            println("Division by zero is not allowed.")
            return 0.0
        }
        return a / b
    }
}

// Main function to run the Calculator application
fun main() {
    val scanner = Scanner(System.`in`)
    val calculator = Calculator()

    while (true) {
        println("Welcome to Basic Calculator")
        println("Please select an operation:")
        println("1. Addition")
        println("2. Subtraction")
        println("3. Multiplication")
        println("4. Division")
        println("5. Exit")

        val choice = scanner.nextInt()

        if (choice == 5) {
            println("Exiting the calculator. Goodbye!")
            break
        }

        println("Enter the first number:")
        val num1 = scanner.nextDouble()

        println("Enter the second number:")
        val num2 = scanner.nextDouble()

        val result = when (choice) {
            1 -> calculator.add(num1, num2)
            2 -> calculator.subtract(num1, num2)
            3 -> calculator.multiply(num1, num2)
            4 -> calculator.divide(num1, num2)
            else -> {
                println("Invalid choice. Please try again.")
                continue
            }
        }

        println("The result is: $result")
    }
}