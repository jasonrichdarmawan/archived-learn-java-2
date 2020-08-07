package learn_calculator;

import java.util.Scanner;

public class switchcase {
    public static void main (String[] args) {
        Scanner userInput;
        float a,b, result = 0;
        String operator; // switch case

        userInput = new Scanner(System.in);

        System.out.print("Enter the value for variable a: ");
        a = userInput.nextInt();

        System.out.print("Enter the operator: ");
        operator = userInput.next();

        System.out.print("Enter the value for variable b: ");
        b = userInput.nextInt();

        userInput.close();

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Math error");
                    return;
                } else {
                    result = a / b;
                    break;
                }
            default:
                System.out.println("operator is not found");
        }

        System.out.println(a + " " + operator + " " + b + " = " + result);
    }
}