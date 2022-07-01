package main;

import java.util.Arrays;

public class SelectionSort {

    /*In place algorithm
     * O(N^2) time complexity - quadratic
     * Unstable algorithm
     * Faster than Bubble sort
     * ± 30800 nanoseconds*/

    public static void main(String[] args) {
        final int[] initialArray = {20, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22};

        final long before = System.nanoTime();
        for (int lastUnsortedIndex = initialArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int indexOfMax = 0;
            for (int count = 1; count <= lastUnsortedIndex; count++) {
                if (initialArray[count] > initialArray[indexOfMax]) {
                    indexOfMax = count;
                }
            }
            swap(initialArray, indexOfMax, lastUnsortedIndex);
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
