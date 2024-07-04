package com.calvin.calculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        if (args.length > 0) {
            // Process CLI arguments
        } else {
            // No CLI arguments, ask for user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter operation (e.g., add, subtract, multiply, divide):");
            String operation = scanner.next();
            double num1, num2;
            // Further processing based on operation
            switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Enter the first operand:");
                num1 = scanner.nextDouble();
                System.out.println("Enter the second operand:");
                num2 = scanner.nextDouble();
                System.out.println("Result: " + add(num1, num2));
                break;
            case "subtract":
            	System.out.println("Enter the first operand:");
                num1 = scanner.nextDouble();
                System.out.println("Enter the second operand:");
                num2 = scanner.nextDouble();
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case "multiply":
            	System.out.println("Enter the first operand:");
                num1 = scanner.nextDouble();
                System.out.println("Enter the second operand:");
                num2 = scanner.nextDouble();
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case "divide":
            	System.out.println("Enter the first operand:");
                num1 = scanner.nextDouble();
                System.out.println("Enter the second operand:");
                num2 = scanner.nextDouble();
                System.out.println("Result: " + divide(num1, num2));
                break;
            case "factorial":
                System.out.println("Enter a number:");
                double number = scanner.nextDouble();
                System.out.println("Result: " + factorial(number));
                break;
            // Handle other operations
        }
        }
    }
    
    public static double multiply(double a, double b) {
    	return a * b;
    }
    public static double subtract(double a, double b) {
    	return a - b;
    }
    public static double divide(double a, double b) {
    	return a/b;
    }
    public static double add(double a, double b) {
        return a + b;
    }

    public static double factorial(double n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}