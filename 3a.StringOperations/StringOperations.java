/* 3a. Develop a java program for performing various string operations with different  string 
handling functions directed  as follows
 String Creation and Basic Operations, Length and Character Access, String Comparison,  String 
Searching, Substring Operations ,  String Modification, Whitespace Handling, String 
Concatenation, String Splitting,  StringBuilder Demo, String Formatting , Validate Email with 
contains( )  and startsWith() and endsWith()*/

public class StringOperations {
    public static void main(String[] args) {
        String inputName = "Thrisha";

        // 1. String Creation and Basic Operations
        String str1 = inputName;
        String str2 = new String("Programming");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("\nLength of String 1: " + str1.length());
        System.out.println("Character at index 2 of String 1: " + str1.charAt(2));

        // 3. String Comparison
        String str3 = "Thrisha";
        System.out.println("\nString1 equals str3: " + str1.equals(str3));
        System.out.println("String1 == str3: " + (str1 == str3)); // Reference comparison
        System.out.println("String1 compareTo str2: " + str1.compareTo(str2));

        // 4. String Searching
        String searchText = "Welcome to the world of Java programming!";
        System.out.println("\nSearch string: " + searchText);
        System.out.println("Contains 'Java': " + searchText.contains("Java"));
        System.out.println("Index of 'world': " + searchText.indexOf("world"));
        System.out.println("Last index of 'g': " + searchText.lastIndexOf('g'));

        // 5. Substring Operations
        System.out.println("\nSubstring from index 11: " + searchText.substring(11));
        System.out.println("Substring from index 0 to 7: " + searchText.substring(0, 7));

        // 6. String Modification
        String modified = searchText.replace("Java", "Python");
        System.out.println("\nModified String: " + modified);
        System.out.println("To Upper Case: " + searchText.toUpperCase());
        System.out.println("To Lower Case: " + searchText.toLowerCase());

        // 7. Whitespace Handling
        String spaced = "   Hello Thrisha   ";
        System.out.println("\nOriginal with spaces: '" + spaced + "'");
        System.out.println("Trimmed: '" + spaced.trim() + "'");

        // 8. String Concatenation
        String concatStr = str1 + " " + str2;
        System.out.println("\nConcatenated String: " + concatStr);
        System.out.println("Using concat(): " + str1.concat(" Learns Java"));

        // 9. String Splitting
        String sentence = "Thrisha is learning Java programming";
        String[] words = sentence.split(" ");
        System.out.println("\nSplit words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Thrisha");
        sb.insert(5, ",");
        sb.replace(0, 5, "Hi");
        sb.deleteCharAt(2);
        System.out.println("\nStringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Thrisha";
        int age = 21;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("\nFormatted String: " + formatted);

        // 12. Email Validation
        String email = "thrisha@example.edu";
        System.out.println("\nEmail: " + email);
        if (email.contains("@") && email.startsWith("thrisha") && email.endsWith(".edu")) {
            System.out.println("Valid email format based on contains(), startsWith(), and endsWith()");
        } else {
            System.out.println("Invalid email format");
        }
    }
}
