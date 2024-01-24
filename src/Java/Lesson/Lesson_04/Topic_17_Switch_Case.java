package Java.Lesson.Lesson_04;

import java.util.Scanner;

public class Topic_17_Switch_Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int userNum = scanner.nextInt();

        switch (userNum) {
            case 1:
                System.out.println("Giai nhat!");
                break;
            case 2:
                System.out.println("Giai nhi!");
                break;
            case 3:
                System.out.println("Giai ba!");
                break;
            default:
                System.out.println("Giai phong trao!");
        }
    }
}
