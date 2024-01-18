package Labs.lab_3;

public class Lab_03_01 {

    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5};
        int evenCount = 0, oddCount = 0;

        for (int num : intArr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
