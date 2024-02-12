package Java.Labs.lab_6;

import java.util.Scanner;

public class Lab_06_02 {
    public static void main(String[] args) {
        // Define the correct password
        String correctPassword = "password123";

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Initialize a variable to count the number of attempts
        int attempts = 0;

        // Loop to allow maximum 3 attempts
        while (attempts < 3) {
            // Prompt the user to enter the password
            System.out.print("Enter your password: ");
            String userInput = scanner.nextLine();

            // Check if the entered password is correct
            if (userInput.equals(correctPassword)) {
                System.out.println("Login successful!");
                break; // Exit the loop if the password is correct
            } else {
                // Increment the attempts counter
                attempts++;
                System.out.println("Incorrect password. You have " + (3 - attempts) + " attempt(s) remaining.");
            }
        }

        // If all attempts are used and the correct password is not entered
        if (attempts == 3) {
            System.out.println("Maximum attempts reached. Account locked.");
        }

        // Close the scanner
        scanner.close();
    }
}
