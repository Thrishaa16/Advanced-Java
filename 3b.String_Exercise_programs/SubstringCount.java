/* String Exercise programs
 Q2.Write a Java Program for Counting how many times a substring appears in a main string
 using user defined function countOccurrences()*/
package Q3;

import java.util.Scanner;

public class SubstringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input main string and substring
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String subString = scanner.nextLine();

        // Call user-defined function
        int count = countOccurrences(mainString, subString);
        System.out.println("The substring '" + subString + "' appears " + count + " times in the main string.");

        scanner.close();
    }

    // User-defined function to count occurrences of substring
    public static int countOccurrences(String main, String sub) {
        if (main == null || sub == null || sub.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // Move index forward to continue searching
        }

        return count;
    }
}
