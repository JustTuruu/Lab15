package labxx.sict.must.edu.mn;

import java.util.Scanner;

public class Calculator {

    // Нэмэх
    public double add(double a, double b) {
        return a + b;
    }

    // Хасах
    public double subtract(double a, double b) {
        return a - b;
    }

    // Үржих
    public double multiply(double a, double b) {
        return a * b;
    }

    // Хуваах
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Тэгээр хуваах боломжгүй");
        }
        return a / b;
    }

    // Console‑ийн интерактив интерфейс
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Калькулятор аппликэйшн");
        System.out.print("Эхний тоо оруулна уу: ");
        double num1 = scanner.nextDouble();

        System.out.print("Үйлдэл (+, -, *, /) сонгоно уу: ");
        String op = scanner.next();

        System.out.print("Хоёр дахь тоо оруулна уу: ");
        double num2 = scanner.nextDouble();

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
                System.out.println("Тодорхойгүй үйлдэл: " + op);
                scanner.close();
                return;
        }

        System.out.println("Үр дүн: " + result);
        scanner.close();
    }
}
