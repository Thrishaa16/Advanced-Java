/*String exercise programs 
  Q10. Write a Java Program for  Counting the number of words in a string using user defined function  
countWords()
 */

package Q3;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Call user-defined function
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }

    // User-defined function to count words
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split the string using one or more whitespace characters
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}

