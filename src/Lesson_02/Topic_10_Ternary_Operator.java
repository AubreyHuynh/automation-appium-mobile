package Lesson_02;

import java.util.Scanner;

public class Topic_10_Ternary_Operator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter arrival time: ");
        int arrivalTime = scanner.nextInt();
        final int EXPECTED_TIME = 7;
        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;
        String myContent = isHeOnTime ? "Let's talk" : "Write a letter!";
        System.out.println(myContent);


    }
}
