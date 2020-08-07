package learn_function;

public class Main {
    public static void main (String[] args) {
        int y;
        y = calculate(5);
        System.out.println("(5 + 2) * 10: " + y);
        print("whatever");
    }

    // method
    private static int calculate (int x) {
        int result;
        result = (x + 2) * 10;
        return result;
    }

    // void method
    private static void print (String input) {
        System.out.print(input + "\n");
    }
}