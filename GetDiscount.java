/* AUTHOR:JOYCE NJERI NJIHIA.
 * REG NO:CT101/G/19419/23.
 * DATE:30TH JAN 2025.
 */

import java.util.Scanner; // Import Scanner class for user input

public class GetDiscount {
    
    public static double getDiscount(int amount) {
        double discount; // Declare the variable
        
        if (amount > 5000) {
            discount = 0.1 * amount;
        } else if (amount >= 1000 && amount <= 5000) {
            discount = 0.05 * amount;
        } else {
            discount = 0; // No discount case
        }

        return discount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter the amount: ");
        
        int amount = scanner.nextInt(); // Read user input
        
        double discount = getDiscount(amount); // Calculate discount
        System.out.println("Discount: " + discount);
        
        scanner.close(); // Close the scanner
    }
}

    
