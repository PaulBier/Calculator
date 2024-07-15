package com.example;

import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float divide(int a, int b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль");
            System.exit(1);
        }
        return (float) a / b;
    }

    public static void calc(String expression) {
        String[] tokens = expression.split(" ");
        if (tokens.length != 3) {
            System.out.println("Ошибка: некорректный формат ввода");
            return;
        }
        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[2]);
        char operator = tokens[1].charAt(0);
        switch (operator) {
            case '+':
                System.out.println(add(a, b));
                break;
            case '-':
                System.out.println(subtract(a, b));
                break;
            case '*':
                System.out.println(multiply(a, b));
                break;
            case '/':
                System.out.println(divide(a, b));
                break;
            default:
                System.out.println("Ошибка: некорректный оператор");
        }
    }

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("первое число, операция(+, -, *, /), второе число.между числами и знаком пробел");      
        String expression = in.nextLine();
        Calculator.calc(expression);
     }   
    }
}
}