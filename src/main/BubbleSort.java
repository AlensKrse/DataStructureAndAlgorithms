package main;

import java.time.LocalDate;
import java.util.Arrays;

public class BubbleSort {

    /*In place algorithm
     * O(N^2) time complexity - quadratic
     * Stable algorithm
     * ± 90155 nanoseconds*/

    public static void main(String[] args) {
        final int[] initialArray = {20, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22};

        System.nanoTime();
        final long before = System.nanoTime();
        for (int lastUnsortedIndex = initialArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int count = 0; count < lastUnsortedIndex; count++) {
                if (initialArray[count] > initialArray[count + 1]) {
                    swap(initialArray, count, count + 1);
                }
            }
        }
        final long then = System.nanoTime();

        System.out.println(then - before);
        System.out.println(Arrays.toString(initialArray));
    }

    public static void swap(final int[] array, final int indexA, final int indexB) {
        if (indexA != indexB) {
            final int temp = array[indexA];
            array[indexA] = array[indexB];
            array[indexB] = temp;
        }
    }
}
