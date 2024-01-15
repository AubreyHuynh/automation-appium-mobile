package Lesson_02;

import java.util.Scanner;

public class Topic_05_If_Else {

    public static void main(String[] args) {

        // Comparison Operators: ==, !=, >, <, <=, >=

        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter arrival time: ");
        int arrivalTime = scanner.nextInt();

        final int EXPECTED_TIME = 7;
        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;

        System.out.println("1. Dat xe ra");
        System.out.println("2. Chay ra quan");

        if (isHeOnTime) {
            System.out.println("Let's talk");
        } else {
            System.out.println("Write a letter!");
        }

        System.out.println("3. Dat xe ra");
        System.out.println("4. Chay ra quan");

    }
}
