package Q2;

public class StringPerformanceTest {
    public static void main(String[] args) {
        int iterations = 10000;
        String appendText = "AIET";

        // Measure time for StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(appendText);
        }
        long endBuffer = System.nanoTime();
        long durationBuffer = endBuffer - startBuffer;
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");

        // Measure time for StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(appendText);
        }
        long endBuilder = System.nanoTime();
        long durationBuilder = endBuilder - startBuilder;
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");

        // Compare results
        System.out.println();
        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else if (durationBuffer < durationBuilder) {
            System.out.println("StringBuffer is faster than StringBuilder.");
        } else {
            System.out.println("Both StringBuffer and StringBuilder performed equally.");
        }
    }
}
