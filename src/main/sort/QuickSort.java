package main.sort;

import java.util.Arrays;


public class QuickSort {

    /*In place algorithm
     * O(n log n) time complexity - log
     * Un Stable algorithm
     * Slower than Shell Sort
     * ± 16000 nanoseconds*/

    public static void main(String[] args) {
        final int[] initialArray = {20, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22};

        final long before = System.nanoTime();
        quickSort(initialArray, 0, initialArray.length);
        final long then = System.nanoTime();

        System.out.println(then - before);
        System.out.println(Arrays.toString(initialArray));
    }

    public static void quickSort(final int[] array, final int startIndex, final int endIndex) {
        if (endIndex - startIndex < 2) {
            return;
        }

        final int pivotIndex = partition(array, startIndex, endIndex);
        quickSort(array, startIndex, pivotIndex);
        quickSort(array, pivotIndex + 1, endIndex);
    }

    private static int partition(final int[] array, final int startIndex, final int endIndex) {
        final int pivot = array[startIndex];

        int leftCount = startIndex;
        int rightCount = endIndex;

        while (leftCount < rightCount) {

            while (leftCount < rightCount && array[--rightCount] >= pivot) ;
            if (leftCount < rightCount) {
                array[leftCount] = array[rightCount];
            }

            while (leftCount < rightCount && array[++leftCount] <= pivot) ;
            if (leftCount < rightCount) {
                array[rightCount] = array[leftCount];
            }

        }

        array[rightCount] = pivot;

        return rightCount;
    }


}
