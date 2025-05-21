/*2.b. Develop a Java program to make a  Performance Test on  StringBuffer and StringBuilder for
 appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify 
your answer which one is better.*/
package Q2;

public class StringOperations {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "AIET";
        String str2 = new String("College");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("\nLength of String 1: " + str1.length());
        System.out.println("Character at index 2 of String 1: " + str1.charAt(2));

        // 3. String Comparison
        String str3 = "AIET";
        System.out.println("\nString1 equals str3: " + str1.equals(str3));
        System.out.println("String1 == str3: " + (str1 == str3)); // Reference comparison
        System.out.println("String1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        String searchText = "Welcome to AIET College";
        System.out.println("\nSearch string: " + searchText);
        System.out.println("Contains 'AIET': " + searchText.contains("AIET"));
        System.out.println("Index of 'College': " + searchText.indexOf("College"));
        System.out.println("Last index of 'e': " + searchText.lastIndexOf('e'));

        // 5. Substring Operations
        System.out.println("\nSubstring from index 11: " + searchText.substring(11));
        System.out.println("Substring from index 0 to 7: " + searchText.substring(0, 7));

        // 6. String Modification
        String modified = searchText.replace("AIET", "SIT");
        System.out.println("\nModified String: " + modified);
        System.out.println("To Upper Case: " + searchText.toUpperCase());
        System.out.println("To Lower Case: " + searchText.toLowerCase());

        // 7. Whitespace Handling
        String spaced = "   Hello AIET   ";
        System.out.println("\nOriginal with spaces: '" + spaced + "'");
        System.out.println("Trimmed: '" + spaced.trim() + "'");

        // 8. String Concatenation
        String concatStr = str1 + " " + str2;
        System.out.println("\nConcatenated String: " + concatStr);
        System.out.println("Using concat(): " + str1.concat(" Rocks"));

        // 9. String Splitting
        String sentence = "AIET is a great college";
        String[] words = sentence.split(" ");
        System.out.println("\nSplit words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" AIET");
        sb.insert(5, ",");
        sb.replace(0, 5, "Hi");
        sb.deleteCharAt(2);
        System.out.println("\nStringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "John";
        int age = 21;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("\nFormatted String: " + formatted);

        // 12. Email Validation
        String email = "student@aiet.edu";
        System.out.println("\nEmail: " + email);
        if (email.contains("@") && email.startsWith("student") && email.endsWith(".edu")) {
            System.out.println("Valid email format based on contains(), startsWith(), and endsWith()");
        } else {
            System.out.println("Invalid email format");
        }
    }
}
