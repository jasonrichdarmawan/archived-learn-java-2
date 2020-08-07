package learn_ifelse;

public class Main {
    public static void main (String[] args) {
        System.out.println("start");

        int a = 1;

        if (a == 1) {
            System.out.println("integer a value: " + a);
            return;
        } else {
            System.out.println("integer a value is not equal to 1");
        }

        System.out.println("finished");

        // nested if

        System.out.println("Start: Nested If Else statement");

        if (a == 1) {
            System.out.println("integer a value: " + a);
            if (a <= 1) {
                System.out.println("integer value is less than or equal to: 1");
            }
        } else {
            System.out.println("integer a value is not equal to 1");
        }

        System.out.println("End: Nested If Else Statement");
    }
}