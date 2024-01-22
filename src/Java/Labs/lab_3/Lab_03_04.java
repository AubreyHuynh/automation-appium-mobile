package Java.Labs.lab_3;

import java.util.Arrays;

public class Lab_03_04 {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // Create a new array to hold the merged elements.
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            // Compare the current elements of each array.
            if (arr1[i] <= arr2[j]) {
                // If the element in arr1 is smaller, add it to the merged array and advance its index.
                merged[k++] = arr1[i++];
            } else {
                // If the element in arr2 is smaller, add it to the merged array and advance its index.
                merged[k++] = arr2[j++];
            }
        }

        // Copy any remaining elements from the first array
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 12, 16, 28, 34};
        int[] arr2 = {1, 13, 16, 27, 99};
        int[] merged = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(merged));
    }
}
