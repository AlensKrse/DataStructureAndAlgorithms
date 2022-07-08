package main.sort;

import java.util.Arrays;

public class ShellSort {

    /*In place algorithm
     * O(N^2) time complexity - quadratic
     * Unstable algorithm
     * Faster than Bubble sort and Selection sort and Insertion sort
     * ± 15200 nanoseconds*/

    public static void main(String[] args) {
        final int[] initialArray = {20, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22, 35, -15, 7, 55, 1, -22};

        final long before = System.nanoTime();
        for (int gap = initialArray.length / 2; gap > 0; gap /= 2) {
            for (int firstUnsortedIndex = gap; firstUnsortedIndex < initialArray.length; firstUnsortedIndex++) {
                int newElement = initialArray[firstUnsortedIndex];

                int count;
                for (count = firstUnsortedIndex; count >= gap && initialArray[count - gap] > newElement; count -= gap) {
                    initialArray[count] = initialArray[count - gap];
                }

                initialArray[count] = newElement;
            }
        }
        final long then = System.nanoTime();

        System.out.println(then - before);
        System.out.println(Arrays.toString(initialArray));
    }

}
