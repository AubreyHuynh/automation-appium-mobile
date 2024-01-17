package Lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class Topic_14_Simple_Menu {
    public static void main(String[] args) {
        boolean isCounting = true;
        while (isCounting) {
            System.out.println("====GAME MENU====");
            System.out.println("1. Generate lucky member");
            System.out.println("0. Exit");

            System.out.print("Please enter your option: ");
            Scanner scanner = new Scanner(System.in);
            int userOption = scanner.nextInt();

            if (userOption == 0) {
                isCounting = false;
            } else if (userOption == 1) {
                final int LUCKY_NUMBER = new SecureRandom().nextInt(10) + 1;
                System.out.printf("Nguoi may man se co so: %d\n", LUCKY_NUMBER);
            } else {
                System.out.println("Nhap lui roi Teo oi");
            }

        }

        System.out.println("See you again!");
    }
}
