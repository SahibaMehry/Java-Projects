//import java.util.ArrayList;
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayListInt numbers = new ArrayListInt();//ArrayList<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        //TODO: insertZeroBeforeEven(numbers);

        insertZeroBeforeEven(numbers);

        System.out.println("After insertions: ");
        System.out.println(numbers);

        removeOdd(numbers);

        System.out.println("After deletion: ");
        System.out.println(numbers);
    }
    private static void insertZeroBeforeEven(ArrayListInt numbers)//ArrayList<Integer> numbers)
    {
        for (int i = 0; i < numbers.size(); ++i) {
            if (numbers.get(i) % 2==0) {
                numbers.add(i++, 0);
            }
        }
    }
    private static void removeOdd(ArrayListInt numbers )// ArrayList<Integer> numbers)
    {
        for (int i = 0; i < numbers.size(); ++i) {
            if (numbers.get(i) % 2 !=0) {
                numbers.remove(i);
                i--;
            }
        }
    }
}