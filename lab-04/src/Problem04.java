import java.util.Random;
import java.util.ArrayList;


public class Problem04 {
    public static void main(String[] args) {
        final int ELEMENTS = 200_000;
        Random randomGen = new Random();
        {
            long startTime = System.nanoTime();
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i =0; i < ELEMENTS * 2; ++i) {
                numbers.add(randomGen.nextInt(ELEMENTS));
            }
            for (int i =0; i < ELEMENTS; ++i) {
                numbers.add(0, randomGen.nextInt(ELEMENTS));
            }
            for (int i =0; i < ELEMENTS; ++i) {
                numbers.remove(0);
            }
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;
            System.out.printf("%.5f%n", elapsedTime / 1_000_000_000.0);
        }
        {
            long startTime = System.nanoTime();
            ArrayListInt numbers = new ArrayListInt();
            for (int i =0; i < ELEMENTS * 2; ++i) {
                numbers.add(randomGen.nextInt(ELEMENTS));
            }
            for (int i =0; i < ELEMENTS; ++i) {
                numbers.add(0, randomGen.nextInt(ELEMENTS));
            }
            for (int i =0; i < ELEMENTS; ++i) {
                numbers.remove(0);
            }
            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;

            System.out.printf("%.5f%n", elapsedTime / 1_000_000_000.0);
        }
    }
}
