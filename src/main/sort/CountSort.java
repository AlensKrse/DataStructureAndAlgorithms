package main.sort;

import java.util.Arrays;


public class CountSort {

    /*Not In place algorithm
     * O(n) time complexity - linear
     * Un Stable algorithm */

    public static void main(String[] args) {
        final int[] initialArray = {4, 4, 2, 1, 4, 2, 1, 1, 4, 2};
        final long before = System.nanoTime();
        countSort(initialArray, 1, initialArray.length);
        final long then = System.nanoTime();

        System.out.println(then - before);
        System.out.println(Arrays.toString(initialArray));
    }

    public static void countSort(final int[] array, final int startIndex, final int endIndex) {
        final int[] countArray = new int[(endIndex - startIndex) + 1];

        for (final int count : array) {
            countArray[count - startIndex]++;
        }

        int j = 0;

        for (int i = startIndex; i <= endIndex; i++) {
            while (countArray[i - startIndex] > 0) {
                array[j++] = i;
                countArray[i - startIndex]--;
            }
        }
    }


}
