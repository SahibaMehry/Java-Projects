import java.util.ArrayList;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);


        reverseNumbers(numbers);

        System.out.println("after reversing");
        System.out.println(numbers);

    }

    private static void reverseNumbers(ArrayList<Integer> numbers) {
        for (int i = 0, j = numbers.size() - 1; i < j ;i++,j-- ){
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(j));
            numbers.set(j, temp);


        }
    }
}
