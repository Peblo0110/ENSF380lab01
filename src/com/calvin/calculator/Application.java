package com.calvin.calculator;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    while (true) {
	        System.out.println("\nEnter operation (add, subtract, multiply, divide, pow, sqrt, log, log10, sin, cos, tan, factorial) or 'exit' to quit:");
	        String operation = scanner.next();
	        
	        if (operation.equalsIgnoreCase("exit")) {
	            System.out.println("Exiting calculator...");
	            break;
	        }

	        // For operations requiring two inputs
	        if (!operation.equalsIgnoreCase("sqrt") && !operation.equalsIgnoreCase("log") && !operation.equalsIgnoreCase("log10") && !operation.equalsIgnoreCase("sin") && !operation.equalsIgnoreCase("cos") && !operation.equalsIgnoreCase("tan") && !operation.equalsIgnoreCase("factorial")) {
	            System.out.print("Enter first number: ");
	            double num1 = scanner.nextDouble();
	            System.out.print("Enter second number: ");
	            double num2 = scanner.nextDouble();

	            switch (operation.toLowerCase()) {
	                case "add":
	                    System.out.println("Result: " + add(num1, num2));
	                    break;
	                case "subtract":
	                    System.out.println("Result: " + subtract(num1, num2));
	                    break;
	                case "multiply":
	                    System.out.println("Result: " + multiply(num1, num2));
	                    break;
	                case "divide":
	                    System.out.println("Result: " + divide(num1, num2));
	                    break;
	                case "pow":
	                    System.out.println("Result: " + power(num1, num2));
	                    break;
	                default:
	                    System.out.println("Invalid operation.");
	                    break;
	            }
	        } else {
	            // For operations requiring one input
	            System.out.print("Enter number: ");
	            double num = scanner.nextDouble();

	            switch (operation.toLowerCase()) {
	                case "sqrt":
	                    System.out.println("Result: " + sqrt(num));
	                    break;
	                case "log":
	                    System.out.println("Result: " + log(num));
	                    break;
	                case "log10":
	                    System.out.println("Result: " + log10(num));
	                    break;
	                case "sin":
	                    System.out.println("Result: " + sin(Math.toRadians(num)));
	                    break;
	                case "cos":
	                    System.out.println("Result: " + cos(Math.toRadians(num)));
	                    break;
	                case "tan":
	                    System.out.println("Result: " + tan(Math.toRadians(num)));
	                    break;
	                case "factorial":
	                    // Factorial is a special case requiring an integer
	                    System.out.println("Result: " + factorial((int)num));
	                    break;
	                default:
	                    System.out.println("Invalid operation.");
	                    break;
	            }
	        }
	    }
	    
	    scanner.close();
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
    public static long factorial(int num) {
        if (num < 0) {
            System.out.println("Factorial of negative number is undefined.");
            return 0;
        }
        return factorialHelper(num, num);
    }

    private static long factorialHelper(int originalNum, int num) {
    	// Calculate progress and update progress bar
        int progress = (int) (((originalNum - num) / (double) originalNum) * 100);
        System.out.print("\rCalculating factorial: " + progress + "%");
        if (num <= 1) {
            return 1;
        }
        return num * factorialHelper(originalNum, num - 1);
    }
 // Exponentiation
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Square root
    public static double sqrt(double number) {
        return Math.sqrt(number);
    }

    // Natural logarithm
    public static double log(double number) {
        return Math.log(number);
    }

    // Base-10 logarithm
    public static double log10(double number) {
        return Math.log10(number);
    }

    // Sine function
    public static double sin(double angleRadians) {
        return Math.sin(angleRadians);
    }

    // Cosine function
    public static double cos(double angleRadians) {
        return Math.cos(angleRadians);
    }

    // Tangent function
    public static double tan(double angleRadians) {
        return Math.tan(angleRadians);
    }
}