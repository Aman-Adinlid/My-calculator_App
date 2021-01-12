package org.example;

import java.util.Scanner;

public class MyCalculator {

    public static void main(String[] args) {
        boolean isActive = true;
        while (isActive) {

            System.out.println("welcome to my calculator");
            System.out.println("Enter an operation type:");
            Scanner sc = new Scanner(System.in);
            String OperationType = sc.next();
            System.out.println("Enter number1 :");
            int number1 = sc.nextInt();
            System.out.println("enter number2 :");
            int number2 = sc.nextInt();
            int result = 0;
            switch (OperationType) {
                case "+":
                    result = addition(number1, number2);
                    result = number1 + number2;
                     System.out.println(number1 + number2);
                    break;

                case "-":
                    result = subtraction(number1, number2);
                    result = number1 - number2;
                     System.out.println(number1 - number2);
                    break;
                case "*":
                    result = multiplication(number1, number2);
                    result = number1 * number2;
                    System.out.println(number1 * number2);
                    break;
                case "/":
                    result = division(number1, number2);
                    result = number1 / number2;
                    System.out.println(number1 / number2);
                    break;
                default:
                    System.out.println("operationType is not valid");

            }
            System.out.println("Result: " + result);
            System.out.println("Would you like to continue");
            String massage = sc.next();
            if (massage.equals("n"))
                break;
        }
    }

    public static int addition(int number1, int number2) {
        return number1 + number2;
    }


    public static int subtraction(int number1, int number2) {
        int result = number1 - number2;
        return result;
    }


    public static int multiplication(int number1, int number2) {
        int result = number1 * number2;
        return result;


    }

    public static int division(int number1, int number2) {
        int result = number1 / number2;
        return result;


    }


}




