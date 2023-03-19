import java.util.Scanner;

public class URI1273 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        boolean first = true;

        while ((n = sc.nextInt()) != 0) {

            if (!first) {
                System.out.println();
            } else {
                first = false;
            }

            String[] words = new String[n];
            int maxLength = 0;

            for (int i = 0; i < n; i++) {
                words[i] = sc.next();
                maxLength = Math.max(maxLength, words[i].length());
            }

            for (int i = 0; i < n; i++) {
                String word = words[i];
                int spaces = maxLength - word.length();
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                System.out.println(word);
            }

        }

        sc.close();
    }

}
