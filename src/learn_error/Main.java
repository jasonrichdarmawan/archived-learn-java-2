package learn_error;

// import java.io.FileInputStream;
// import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int[] array = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);

        int index = userInput.nextInt();
        userInput.close();

        // exception handling: try, catch, finally
        // try {
        //     System.out.println("value of index no. " + index + " is " + array[index]);
        // } catch (Exception e) {
        //     System.err.println(e);
        // }

        // FileInputStream fileInput = null;

        // runtime error
        // try { 
        //     fileInput = new FileInputStream("test.txt");
        // } catch (IOException e) {
        //     System.err.println(e);
        // }

        // try {
        //     System.out.println("value of index no. " + index + " is " + array[index]);
        //     fileInput = new FileInputStream("test.txt");
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.err.println(e);
        // } catch (IOException e) {
        //     System.err.println(e);
        // }

        // finally

        try {
            System.out.println("value of index no. " + index + " is " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        } finally {
            System.out.println("finally");
        }

        System.out.println("End of program");
    }
}