package Java.Labs.lab_2;

import java.util.Scanner;

public class Lab_02_02 {
    public static void main(String[] args) {
        // Lab 2.2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
