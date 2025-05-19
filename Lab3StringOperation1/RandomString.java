/*String exercise programs
 * Q9. Write a Java Program for  Creating  a random string of a specified length using user defined 
function generateRandomString()
 */

package Q3;

import java.util.Random;
import java.util.Scanner;

public class RandomString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired length of the random string: ");
        int length = scanner.nextInt();

        if (length <= 0) {
            System.out.println("Length must be a positive integer.");
            return;
        }

        // Call user-defined function
        String randomStr = generateRandomString(length);
        System.out.println("\nGenerated Random String:\n" + randomStr);

        scanner.close();
    }

    // User-defined function to generate a random string
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }
}
