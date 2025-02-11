/* AUTHOR:JOYCE NJERI.
 * REG NO:CT101/G/19419/23.
 * DATE:30TH JAN 2025.
 */

public class CalculateDiscount {
    
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
        double discount = getDiscount(7000); // Correct variable name and method call
        System.out.println("Discount: " + discount);
    }
}