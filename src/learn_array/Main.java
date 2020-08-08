package learn_array;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        // assignment
        int[] assignArray = {1,2,3};
        System.out.println(assignArray[0]);

        // declaration
        int[] declareArray = new int[5];
        System.out.println(Arrays.toString(declareArray));

        // nested array
        int[][] nestedArray = new int[5][5];
        System.out.println(Arrays.deepToString(nestedArray));

        // for-each loop
        int[] numbers = {1,2,3};
        for (int number : numbers) {
            System.out.println(number);
        }

        // note: int[] targetarray = sourcearray; only copy the memory address of the array. Hence, changing targetarray[1] equals to change sourcearray[1].
        int[] newnumbers = numbers;
        newnumbers[0] = 20;
        System.out.println(numbers[0]);
        System.out.println(newnumbers[0]);

        System.out.println(".clone()");
        
        // one of the solution is to use the .clone() method.
        int[] newarray = numbers.clone();
        newarray[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(newarray[0]);
    }
}