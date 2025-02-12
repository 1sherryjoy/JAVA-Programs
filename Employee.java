
    /* AUTHOR:JOYCE NJERI NJIHIA
    REG NO.CT101/F/19419/23.
     DATE:4TH FEB 2025.
*/

// Employee Class
class Employee {
    private String name;
    private double salary;

    // Constructor to initialize name and salary
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// SalaryCalculator Class
class SalaryCalculator {
    // Method to calculate 10% of the salary as bonus
    public double calculateBonus(double salary) {
        return salary * 0.10;
    }
}

// MainApp Class
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept user input for name and salary
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        // Create an Employee object
        Employee employee = new Employee(name, salary);

        // Use SalaryCalculator to compute bonus
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        double bonus = salaryCalculator.calculateBonus(employee.getSalary());

        // Display employee details and calculated bonus
        employee.displayDetails();
        System.out.println("Calculated Bonus: " + bonus);

        scanner.close();
    }
}
}
