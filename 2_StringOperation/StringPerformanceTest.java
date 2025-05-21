/*2.b. Develop a Java program to make a  Performance Test on  StringBuffer and StringBuilder for
 appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify 
your answer which one is better*/


package Q2;

public class StringPerformanceTest {
    public static void main(String[] args) {
        // Performance Test using StringBuffer
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 10000; i++) {
            sb.append("AIET");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ms");

        // Performance Test using StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            sb2.append("AIET");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ms");
    }
}
