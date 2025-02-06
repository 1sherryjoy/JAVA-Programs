
/*AUTHOR:JOYCE NJERI NJIHIA.
    REG NO:CT101/G/19419/23.
    DATE:4TH FEB 2025
*/

Student class
class Student {
    // Fields
    private String name;
    private double marks;

    // Constructor
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

// GradeCalculator class
class GradeCalculator {
    // Method to calculate grade
    public String calculateGrade(double marks) {
        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 75) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}

// MainApp class
import java.util.scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept user input
        System.out.println("Enter Student Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Marks:");
        double marks = scanner.nextDouble();

        // Create Student object
        Student student = new Student(name, marks);

  // Use GradeCalculator to calculate grade
        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade = gradeCalculator.calculateGrade(student.getMarks());

        // Display student details and calculated grade
        student.displayDetails();
        System.out.println("Calculated Grade: " + grade);

        scanner.close();
    }
}