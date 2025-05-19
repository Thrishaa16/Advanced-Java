/*String Exercise programs

 Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user 
defined function isNullOrEmpty().*/
package Q3;

import java.util.Scanner;

public class StringNullCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check using user-defined function
        if (isNullOrEmpty(input)) {
            System.out.println("The string is either null or contains only whitespace.");
        } else {
            System.out.println("The string has non-whitespace characters.");
        }

        scanner.close();
    }

    // User-defined function to check for null or empty (whitespace only)
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
