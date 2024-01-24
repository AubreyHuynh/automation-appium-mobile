package Java.Lesson.Lesson_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class Topic_16_Do_While {
    public static void main(String[] args) {

        // Số lần thực thi ít nhất 1 lần
        int guessingTime = 0;
        int randomNum = new SecureRandom().nextInt(10) + 1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input a number: ");
            int userNum = scanner.nextInt();
            if (userNum == randomNum) {
                System.out.print("Hooray!");
                break;
            }
                guessingTime++;
        } while (guessingTime < 3);

        if (guessingTime == 3) {
            System.out.println("Chuc ban may man lan sau!");
        }

    }
}
