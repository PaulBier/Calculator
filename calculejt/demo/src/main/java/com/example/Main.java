package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("первое число, операция(+, -, *, /), второе число.между числами и знаком пробел");      
        String expression = in.nextLine();
        Calculator.calc(expression);
     }   
    }
}