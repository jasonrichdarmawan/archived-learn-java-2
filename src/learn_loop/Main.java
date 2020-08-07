package learn_loop;

public class Main {
    public static void main (String[] args) {
        // loop: while, do while, for, recursive

        // while loop
        // Start -> condition -> if true statement
        System.out.println("Start: while loop");

        int a = 0;

        while (a < 0) {
            ++a;
            System.out.println("value of variable a: " + a);
        }

        System.out.println("End: while loop");

        // do while loop
        // the do is outside the while body;
        // Start -> do -> condition -> if true loop
        System.out.println("Start: do while loop");

        a = 0;

        do {
            ++a;
            System.out.println("value of variable a: " + a);
        } while (a < 0);

        System.out.println("End: do while loop");

        // for loop
        // the statement is inside the for loop body.
        // Start -> condition -> if true statement
        System.out.println("Start: for loop");

        for (int b = 0; b < 0; b++) {
            System.out.println("value of variable b: " + b);
        }

        System.out.println("End: for loop");

        // nested for loop
        System.out.println("Start: nested for loop");

        for (int b = 0; b < 3; b++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("variable b: " + b + " variable c: " + c);
            }
        }

        System.out.println("End: nested for loop");
    }
}