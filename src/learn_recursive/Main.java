package learn_recursive;

public class Main {
    public static void main (String[] args) {
        int total = totalSum(2);
        System.out.print("total: " + total);
    }

    private static int totalSum(int input) {
        System.out.println("input: " + input);
        if (input == 0) return input;
        else return input + totalSum(input - 1);
        // output:
        // 2 + totalSum(2 - 1)
        // 2 + 1 + totalSum(1 - 1)
        // 2 + 1 + 0
    }
}