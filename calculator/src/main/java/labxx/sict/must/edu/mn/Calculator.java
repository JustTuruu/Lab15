package labxx.sict.must.edu.mn;

import java.util.Scanner;

/**
 * A simple calculator that provides basic arithmetic operations on double values.
 */
public final class Calculator {

    /**
     * Constructs a new Calculator instance.
     */
    public Calculator() {
        // no-op
    }

    /**
     * Returns the sum of two numbers.
     *
     * @param a the first addend
     * @param b the second addend
     * @return the result of a + b
     */
    public double add(final double a, final double b) {
        return a + b;
    }

    /**
     * Returns the difference between two numbers.
     *
     * @param a the minuend
     * @param b the subtrahend
     * @return the result of a - b
     */
    public double subtract(final double a, final double b) {
        return a - b;
    }

    /**
     * Returns the product of two numbers.
     *
     * @param a the first factor
     * @param b the second factor
     * @return the result of a * b
     */
    public double multiply(final double a, final double b) {
        return a * b;
    }

    /**
     * Returns the quotient of dividing the first number by the second.
     *
     * @param a the dividend
     * @param b the divisor (must not be zero)
     * @return the result of a / b
     * @throws IllegalArgumentException if {@code b} is zero
     */
    public double divide(final double a, final double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor must not be zero");
        }
        return a / b;
    }

    /**
     * Runs the calculator in interactive console mode.
     *
     * @param args command-line arguments (ignored)
     */
    public static void main(final String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.print("Enter the first number: ");
        final double num1 = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        final String op = scanner.next();

        System.out.print("Enter the second number: ");
        final double num2 = scanner.nextDouble();

        double result;
        switch (op) {
            case "+":
                result = calc.add(num1, num2);
                break;
            case "-":
                result = calc.subtract(num1, num2);
                break;
            case "*":
                result = calc.multiply(num1, num2);
                break;
            case "/":
                result = calc.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation: " + op);
                scanner.close();
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}