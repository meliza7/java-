import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Step 1: Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 2: Use StringBuilder to reverse the input string
        StringBuilder reversed = new StringBuilder(input).reverse();

        // Step 3: Check if the input string and reversed string are the same
        if (input.equals(reversed.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}
