package learn_scanner;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("enter the number");
        Scanner userInput = new Scanner(System.in);

        // int input = userInput.nextInt();
        // System.out.println("input: " + input);

        System.out.println("Enter the length: ");
        int length = userInput.nextInt();
        System.out.println("Enter the width: ");
        int width = userInput.nextInt();

        int area = length * width;
        System.out.print("area of rectangle: " + area);

        userInput.close();
    }
}