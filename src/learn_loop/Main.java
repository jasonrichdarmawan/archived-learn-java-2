package learn_loop;

public class Main {
    public static void main (String[] args) {
        // loop: while, do while, for, recursive

        // while loop
        System.out.println("Start: while loop");

        int a = 0;

        while (a < 0) {
            ++a;
            System.out.println("value of variable a: " + a);
        }

        System.out.println("End: while loop");

        // do while loop
        // the do is outside the while body;
        System.out.println("Start: do while loop");

        a = 0;

        do {
            ++a;
            System.out.println("value of variable a: " + a);
        } while (a < 0);

        System.out.println("End: do while loop");
    }
}