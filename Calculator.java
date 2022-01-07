package com.company;
import java.util.Scanner;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("please in put the first data");
        double a = scanner.nextDouble();

        System.out.println("please in put calculate type");
        String operator = scanner.next();

        System.out.println("please input the second data");
        double b = scanner.nextDouble();

        double result = 0;

        scanner.close();

        if ("+".equals(operator)) {
            result = calculator.add(a, b);
        } else if ("-".equals(operator)) {
            result = calculator.div(a, b);
        } else if ("*".equals(operator)) {
            result = calculator.multiply(a, b);
        } else if ("/".equals(operator)) {
            result = calculator.div(a, b);
        }
        System.out.println("the result is:" + result);
    }
}

