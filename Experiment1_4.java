import java.util.Scanner;
public class Experiment1_4 {
    
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.println("Enter your marks (0-100): ");
        int marks = scanner.nextInt();

        // Conditional statements to determine grade
        if (marks >= 90) {
            System.out.println("Grade: O");
        } else if (marks >= 75) {
            System.out.println("Grade: E");
        } else if (marks >= 50) {
            System.out.println("Grade: A");
        } else if (marks >= 35) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        // Additional check using a switch-case statement
        System.out.println("\nAdditional Remark: ");
        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("Outstanding performance!");
                break;
            case 8:
            case 7:
                System.out.println("Good job! Keep it up.");
                break;
            case 6:
            case 5:
                System.out.println("You passed, but there's room for improvement.");
                break;
            default:
                System.out.println("Need to work hard to pass next time.");
        }

        // Close the scanner
        scanner.close();
    }

}
