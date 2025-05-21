/* String exercise programs
  Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case 
and punctuation) using user defined function isPalindrome(): */

package Q3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();

        // Call user-defined function
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    // User-defined function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        // Remove punctuation, whitespace, and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
