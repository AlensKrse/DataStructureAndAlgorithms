package main.sort;

import java.util.Arrays;

public class InsertionSort {

    /*In place algorithm
     * O(N^2) time complexity - quadratic
     * Stable algorithm
     * Faster than Bubble sort and Selection sort
     * ± 19200 nanoseconds*/

    public static void main(String[] args) {
        final int[] initialArray = {20, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22};

        final long before = System.nanoTime();
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < initialArray.length - 1; firstUnsortedIndex++) {
            int newElement = initialArray[firstUnsortedIndex];

            int count;
            for (count = firstUnsortedIndex; count > 0 && initialArray[count - 1] > newElement; count--) {
                initialArray[count] = initialArray[count - 1];
            }

            initialArray[count] = newElement;
        }
        final long then = System.nanoTime();

        System.out.println(then - before);
        System.out.println(Arrays.toString(initialArray));
    }

}
