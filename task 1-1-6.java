import java.util.Scanner;

public class LargestNumberFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double largestNumber = findLargestNumber(num1, num2, num3);

        if (largestNumber == Double.MIN_VALUE) {
            System.out.println("All numbers are equal.");
        } else {
            System.out.println("The largest number is: " + largestNumber);
        }

        scanner.close();
    }

    public static double findLargestNumber(double num1, double num2, double num3) {
        // Check if all numbers are equal
        if (num1 == num2 && num2 == num3) {
            return Double.MIN_VALUE; // Indicate that all numbers are equal
        }

        // Find the largest number
        double largest = Math.max(num1, Math.max(num2, num3));
        return largest;
    }
}


    
