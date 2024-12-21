import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;

        // Logic to reverse the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reversedNumber = reversedNumber * 10 + digit;  // Append digit to reversedNumber
            number /= 10;  // Remove the last digit from the number
        }

        // Print the reversed number
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}
