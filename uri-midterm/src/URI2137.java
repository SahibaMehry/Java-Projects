import java.util.*;

public class URI2137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] books = new String[n];
            for (int i = 0; i < n; i++) {
                books[i] = sc.next();
            }
            Arrays.sort(books);
            for (String book : books) {
                System.out.println(book);
            }
        }
        sc.close();
    }
}
