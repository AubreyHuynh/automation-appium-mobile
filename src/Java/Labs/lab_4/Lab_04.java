package Java.Labs.lab_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lab_04 {
    public static void main(String[] args) {
        List<Integer> numbers = generateRandomNumbers();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    printAllNumbers(numbers);
                    break;
                case 2:
                    System.out.println("Maximum value: " + findMaxValue(numbers));
                    break;
                case 3:
                    System.out.println("Minimum value: " + findMinValue(numbers));
                    break;
                case 4:
                    System.out.print("Enter a number to search: ");
                    int numberToSearch = scanner.nextInt();
                    int index = searchNumber(numbers, numberToSearch);
                    if (index != -1) {
                        System.out.println("Number found at index: " + index);
                    } else {
                        System.out.println("Number not found in the list.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static List<Integer> generateRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        int listSize = random.nextInt(50) + 1; // Generate a random list size between 1 and 50
        for (int i = 0; i < listSize; i++) {
            numbers.add(random.nextInt(1000)); // Add random numbers less than 1000
        }
        return numbers;
    }

    private static void printMenu() {
        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void printAllNumbers(List<Integer> numbers) {
        System.out.println("All numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static int findMaxValue(List<Integer> numbers) {
        return numbers.stream().max(Integer::compareTo).orElse(null);
    }

    private static int findMinValue(List<Integer> numbers) {
        return numbers.stream().min(Integer::compareTo).orElse(null);
    }

    private static int searchNumber(List<Integer> numbers, int numberToSearch) {
        return numbers.indexOf(numberToSearch);
    }
}
