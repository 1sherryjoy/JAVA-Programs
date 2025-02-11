/* Program code to calculate the net bonus amount 
 * Author: Joyce Njeri
 * Reg No: CT101/G/19419/23
 * Date: 22nd Jan 2025
 */

import java.util.Scanner; // Import Scanner for user input

// Main class
public class Bonus {
    // Main method
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input salary and years of service
        System.out.print("Enter your salary: ");
        int salary = scanner.nextInt();

        System.out.print("Enter your years of service: ");
        int years = scanner.nextInt();

        // Initialize variables
        double bonusPercentage = 0.0; // To store the bonus percentage
        double netBonusAmount;

        // If statement loop to Determine the bonus percentage based on years of service
        if (years > 10) {
            bonusPercentage = 0.12; // 12% bonus
        } else if (years >= 6) {
            bonusPercentage = 0.10; // 10% bonus
        } else {
            bonusPercentage = 0.08; // 8% bonus
        }

        // Calculate the net bonus amount
        netBonusAmount = salary * bonusPercentage;

        // Output the calculated bonus
        System.out.println("Bonus awarded: " + (int)(bonusPercentage * 100) + "%");
        System.out.println("Net bonus amount: " + netBonusAmount);

        // Close the scanner
        scanner.close();
    }
}