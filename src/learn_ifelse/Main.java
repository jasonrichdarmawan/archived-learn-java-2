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
    }
}