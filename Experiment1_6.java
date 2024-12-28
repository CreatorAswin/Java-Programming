import java.util.Scanner;
public class Experiment1_6 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input two strings from the user
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Perform string operations
        // 1. Length of the strings
        System.out.println("\nLength of the first string: " + str1.length());
        System.out.println("Length of the second string: " + str2.length());

        // 2. Concatenation of strings
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated string: " + concatenated);

        // 3. Uppercase and lowercase conversion
        System.out.println("First string in uppercase: " + str1.toUpperCase());
        System.out.println("Second string in lowercase: " + str2.toLowerCase());

        // 4. Checking if strings are equal
        System.out.println("Are the two strings equal? " + str1.equals(str2));

        // 5. Substring of the first string
        if (str1.length() >= 3) {
            System.out.println("Substring of the first string (first 3 characters): " + str1.substring(0, 3));
        } else {
            System.out.println("First string is too short for a substring.");
        }

        // 6. Character at a specific index
        System.out.println("Character at index 2 of the first string: " + (str1.length() > 2 ? str1.charAt(2) : "N/A"));

        // Close the scanner
        scanner.close();
    }

    
}
