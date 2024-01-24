package Java.Lesson.Lesson_04;

import java.util.Scanner;

public class Topic_18_Switch_Case_Calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int userNum = scanner.nextInt();

        switch (userNum) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekdays");
                break;
            case 7:
            case 8:
                System.out.println("Weekends");
                break;
            default:
                System.out.println("Nhap sai roi");
        }
    }
}
