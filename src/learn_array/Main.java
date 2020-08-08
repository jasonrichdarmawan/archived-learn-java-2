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

        // .copyOf()
        int[] copyOfArray = Arrays.copyOf(newarray, 5);
        System.out.println(Arrays.toString(copyOfArray));

        // .copyOfRange()
        int[] copyOfRangeArray = Arrays.copyOfRange(newarray, 2, 5);
        System.out.println(Arrays.toString(copyOfRangeArray));

        // fill array: useful for 1 and 0 boolean
        int[] fillArray = new int[10];
        Arrays.fill(fillArray, 1);
        System.out.println(Arrays.toString(fillArray));

        // array comparison
        int[] compareArray1 = {1,2,3,4,5};
        int[] compareArray2 = {1,2,3,4,5};

        // unique behavior: array comparison.
        if (compareArray1 == compareArray2) {
            System.out.println("identical array");
        } else {
            System.out.println("not identical array");
        }

        // solution to this unique behavior is to use Arrays.equals();
        if (Arrays.equals(compareArray1, compareArray2)) {
            System.out.println("identical array");
        } else {
            System.out.println("not identical array");
        }

        // search array is not indexOf equivalent of JavaScript.
        int[] searchArray = {1,6,4,5,3,5,2,6};
        Arrays.sort(searchArray);
        System.out.println(Arrays.toString(searchArray));
        System.out.println(Arrays.binarySearch(searchArray, 5));

        // for each nested loop
        int[][] numb = {
            {1,2,5},
            {1,2,4}
        };

        for (int[] num : numb) {
            System.out.println(Arrays.toString(num));
        };
    }
}