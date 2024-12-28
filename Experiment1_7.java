import java.util.Scanner;
public class Experiment1_7 {
   public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.println("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Declare and initialize the array
        int[] numbers = new int[size];

        // Input elements into the array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Display elements of the array
        System.out.println("\nElements of the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Calculate and display the sum of the elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\n\nSum of the array elements: " + sum);

        // Find and display the largest element in the array
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest element in the array: " + max);

        // Close the scanner
        scanner.close();
    }

}
