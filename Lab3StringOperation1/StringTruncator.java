/*String exercise programs
 * Q7. Write a Java Program for  Shortening a string to a specified length and adds an ellipsis using user 
defined function truncate()
 */

package Q3;

import java.util.Scanner;

public class StringTruncator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter maximum length to truncate: ");
        int maxLength = scanner.nextInt();

        String result = truncate(input, maxLength);
        System.out.println("Truncated string: " + result);

        scanner.close();
    }

    public static String truncate(String str, int length) {
        if (str == null || length < 0) {
            return "";
        }

        if (str.length() <= length) {
            return str;
        }

        if (length <= 3) {
            return "...".substring(0, length);
        }

        return str.substring(0, length - 3) + "...";
    }
}
