package learn_calculator;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // a -> operator -> b -> result

        float a, b, result = 0;
        char operator;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the value for variable a: ");
        a = userInput.nextFloat();

        System.out.print("Enter the value for variable operator: ");
        operator = userInput.next().charAt(0);

        System.out.print("Enter the value for variable b: ");
        b = userInput.nextFloat();

        userInput.close();

        System.out.println("user input: " + a + " " + operator + " " + b);

        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else if (operator == '/') {
            if (b == 0) {
                System.out.println("math error");
                return;
            } else {
                result = a / b;
            }
        } else {
            System.out.println("operator is not found");
            return;
        }

        System.out.println(a + " " + operator + " " + b + " = " + result);
    }
}