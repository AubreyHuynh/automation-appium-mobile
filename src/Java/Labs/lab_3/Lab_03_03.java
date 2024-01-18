package Java.Labs.lab_3;

import java.util.Arrays;

public class Lab_03_03 {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};
        arraySort(intArr);
        System.out.println(Arrays.toString(intArr));
    }

    public static void arraySort(int[] arr) {
        boolean changeLocation;
        for (int i = 0; i < arr.length - 1; i++) {
            changeLocation = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    changeLocation = true;
                }
            }

            if (!changeLocation) {
                break;
            }
        }
    }
}
