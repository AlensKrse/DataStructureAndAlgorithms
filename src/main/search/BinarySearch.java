package main.search;

import java.util.Arrays;


public class BinarySearch {

    public static void main(String[] args) {
        final int[] array = {42, 5, 235, 436, 457, 52434, 24, 324, 3, 2, 41, 4, 325, 46, 5352, 523, 5234, 34, 67, 4, 4, 2, 42, 43, 1};
        Arrays.sort(array);
        final int index = binarySearchRecursive(array, 325, 0, array.length);
        System.out.println("Key 325 is on " + index);
        System.out.println("Value at index " + index + " = " + array[index]);

        final int indexIteratively = binarySearchIteratively(array, 24, 0, array.length);
        System.out.println("Key 24 is on " + indexIteratively);
        System.out.println("Value at index " + indexIteratively + " = " + array[indexIteratively]);
    }

    public static int binarySearchRecursive(final int[] sortedArray, final int key, final int low, final int high) {
        int middle = low + ((high - low) / 2);

        if (high < low) {
            return -1;
        }

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return binarySearchRecursive(
                    sortedArray, key, low, middle - 1);
        } else {
            return binarySearchRecursive(
                    sortedArray, key, middle + 1, high);
        }
    }

    public static int binarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

}
