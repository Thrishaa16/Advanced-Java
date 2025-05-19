/* String Exercise Programs
 * Q3. Write a Java Program for  Reversing the characters in a string using user defined function 
reverseString().
 */


package Q3;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Call user-defined function
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    // User-defined function to reverse a string
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
