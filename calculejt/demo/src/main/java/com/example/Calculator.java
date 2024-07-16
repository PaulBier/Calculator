package com.example;

public class Calculator { 
 
    private int a; 
    private int b; 
    private String operation; 
 
    public Calculator(int a, int b, String operation) { 
        this.a = a; 
        this.b = b; 
        this.operation = operation; 
    } 
 
    public int add() { 
        return a + b; 
    } 
 
    public int subtract() { 
        return a - b; 
    } 
 
    public int multiply() { 
        return a * b; 
    } 
 
    public float divide() { 
        return (float) a / b; 
    } 
 
    public float calculate() { 
        float result = 0f; 
        switch (operation) { 
            case "+": 
                result = add(); 
                break; 
            case "-": 
                result = subtract(); 
                break; 
            case "*": 
                result = multiply(); 
                break; 
            case "/": 
                result = divide();
                break;
            default: 
                System.out.println("Ошибка: Неизвестная операция"); 
                System.exit(1); 
                break; 
        } 
        return result; 
    } 
 
    public static void calc(String expression) { 
        String[] parts = expression.split(" "); 
 
        if (parts.length != 3) { 
            System.out.println("Ошибка: Неверный формат ввода"); 
            System.exit(1); 
        } 
 
        int num1 = parseNumber(parts[0]); 
        int num2 = parseNumber(parts[2]); 
        String operator = parts[1]; 
 
        Calculator calculator = new Calculator(num1, num2, operator); 
        float result = calculator.calculate(); 
 
        System.out.println("Результат: " + result); 
    } 
 
    private static int parseNumber(String number) { 
        try { 
            return Integer.parseInt(number); 
        } catch (NumberFormatException e) { 
            System.out.println("Ошибка: Неверный формат ввода"); 
            System.exit(1); 
            return 0; 
        } 
    } 
}