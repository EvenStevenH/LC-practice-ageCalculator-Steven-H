package YearsUntilHundred;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());
        try {
            if (age < 0 || age > 100) {
                System.out.println("Age must be between 0 and 100.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value for age.");
            return;
        }

        int yearsUntilHundred = 100 - age;
        System.out.printf("You have %d years until you are 100 years old.%n", yearsUntilHundred);
        scanner.close();
    }
}