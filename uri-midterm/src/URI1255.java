import java.util.*;

public class URI1255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String line = sc.nextLine().toLowerCase();
            int[] freq = new int[26];
            int maxFreq = 0;
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    freq[c - 'a']++;
                    maxFreq = Math.max(maxFreq, freq[c - 'a']);
                }
            }
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] == maxFreq) {
                    System.out.print((char) ('a' + i));
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
