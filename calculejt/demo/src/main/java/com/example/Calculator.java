package com.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float divide(float a, int b) {
        return a / b;
    }

    public static void calc(String expression) {
        Calculator calculator = new Calculator();
        String[] parts = expression.split(" ");
        int num1 = 0;
        try {
            num1 = Integer.parseInt(parts[0]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неправильный формат");
            System.exit(1);
        }
        int num2 = 0;
        try {
            num2 = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неправильный формат");
            System.exit(1);
        }
        float result = 0f;
        switch (parts[1]) {
            case "+":
                result = calculator.add(num1, num2);
                break;
            case "-":
                result = calculator.subtract(num1, num2);
                break;
            case "*":
                result = calculator.multiply(num1, num2);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Ошибка: Деление на ноль");
                    System.exit(1);
                }
                result = calculator.divide((float) num1, num2);
                break;
            default:
                System.out.println("Ошибка: Неизвестная операция");
                System.exit(1);
                break;
        }
        System.out.println("Результат: " + result);
    }
}