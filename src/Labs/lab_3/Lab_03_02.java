package Labs.lab_3;

public class Lab_03_02 {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int min = intArr[0], max = intArr[0];

        for (int num : intArr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
