package learn_ifelse;

public class Main {
    public static void main (String[] args) {
        System.out.println("start");

        int a = 10;

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

        // switch case

        System.out.println("Start: Switch Case");

        switch (a) {
            case 10:
            System.out.println("integer a value: " + a);
            case 1:
            System.out.println("case 1: should not System.out.print. Use break after each statement" + a);
            System.out.println("integer a value: " + a); // should not out.
            break;
            case 5:
            System.out.println("case 5: should not System.out.print." + a);
            default:
            System.out.println("default case, similar to else statement" + a);
        }

        System.out.println("End: Switch Case");
    }
}