package Java.Lesson.Lesson_02;

import java.util.Scanner;

public class Topic_06_Multiple_IfElse {

    public static void main(String[] args) {
        // <18 | 18 -55 | > 55
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int clientAge = scanner.nextInt();

        if (clientAge < 18) {
            System.out.println("Bạn không sử dụng được đồ uống có cồn!");

            // Nested conditional statement
            if (clientAge <=12) {
                System.out.println("Call Police!");
            }

        } else if (clientAge <= 55) {
            System.out.println("Bạn có thể sử dụng được đồ uống có cồn!");
        } else {
            System.out.println("Bạn có thể sử dụng được đồ uống có cồn trong giới hạn!");
        }

        System.out.println("End Program!");


    }
}
