/*String exercise programs
 * Q8. Write a Java Program for  Verifying if a string contains only numeric characters using user defined 
function  isNumeric()
 */

package Q3;

import java.util.Scanner;

public class NumericChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's numeric: ");
        String input = scanner.nextLine();

        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string does NOT contain only numeric characters.");
        }

        scanner.close();
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        return str.matches("\\d+");
    }
}
