/*String exercise programs
 * Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined 
function removeWhitespace()
 */

package Q3;

import java.util.Scanner;

public class WhitespaceRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with whitespace: ");
        String input = scanner.nextLine();

        // Call user-defined function
        String result = removeWhitespace(input);
        System.out.println("String after removing whitespace: " + result);

        scanner.close();
    }

    // User-defined function to remove all whitespace characters
    public static String removeWhitespace(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\s+", "");
    }
}
