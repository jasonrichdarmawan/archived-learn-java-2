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
    }
}