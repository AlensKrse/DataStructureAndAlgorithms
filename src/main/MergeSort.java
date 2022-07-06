package main;

import java.util.Arrays;

public class MergeSort {

    /*Not in place algorithm
     * O(n log2 n) time complexity - log
     * Stable algorithm
     * Faster than Bubble sort
     * ± 34500 nanoseconds*/

    public static void main(String[] args) {
        final int[] initialArray = {20, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22};

        final long before = System.nanoTime();
        mergeSort(initialArray, 0, initialArray.length);
        final long then = System.nanoTime();

        System.out.println(then - before);
        System.out.println(Arrays.toString(initialArray));
    }

    public static void mergeSort(final int[] array, final int startIndex, final int endIndex) {
        if (endIndex - startIndex < 2) {
            return;
        }

        final int middleIndex = (startIndex + endIndex) / 2;
        mergeSort(array, startIndex, middleIndex);
        mergeSort(array, middleIndex, endIndex);
        merge(array, startIndex, middleIndex, endIndex);
    }

    public static void merge(final int[] array, final int startIndex, final int middleIndex, final int endIndex) {
        if (array[middleIndex - 1] <= array[middleIndex]) {
            return;
        }

        int leftIndex = startIndex;
        int rightIndex = middleIndex;
        int tempIndex = 0;

        final int[] tempArray = new int[endIndex - startIndex];
        while (leftIndex < middleIndex && rightIndex < endIndex) {
            tempArray[tempIndex++] = array[leftIndex] <= array[rightIndex] ? array[leftIndex++] : array[rightIndex++];
        }

        System.arraycopy(array, leftIndex, array, startIndex + tempIndex, middleIndex - leftIndex);
        System.arraycopy(tempArray, 0, array, startIndex, tempIndex);
    }
}
