package Labs.lab_2;

import java.util.Scanner;

public class Lab_02_01 {
    public static void main(String[] args) {
        // Lab 2.1
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in Meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in Kilograms: ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Lab 2.3
        if (bmi < 18.5) {
            double weightGainKg = (18.5 - bmi) * height * height / 2;
            System.out.printf("You are underweight. It is recommended to gain approximately %.2f kg.\n", weightGainKg);

        } else if (bmi < 25) {
            System.out.println("You are normal weight.");

        } else if (bmi < 30) {
            double weightLossKg = (bmi - 25) * height * height / 2;
            System.out.printf("You are overweight. It is recommended to lose approximately %.2f kg.\n", weightLossKg);

        } else {
            double weightLossKg = (bmi - 25) * height * height / 2;
            System.out.printf("You are obese. It is strongly recommended to lose at least %.2f kg for health reasons.\n", weightLossKg);
        }
    }
}
