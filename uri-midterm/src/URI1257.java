import java.util.*;
public class URI1257 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases = input.nextInt();

        while (testCases-- > 0) {
            int L = input.nextInt();

            int hash = 0;

            for (int i = 0; i < L; i++) {
                String str = input.next();
                for (int j = 0; j < str.length(); j++) {
                    int alphabetPosition = str.charAt(j) - 'A';
                    hash += alphabetPosition + i + j;
                }
            }

            System.out.println(hash);
        }

        input.close();
    }

}