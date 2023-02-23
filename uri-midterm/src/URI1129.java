import java.util.Scanner;

public class URI1129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            for (int i = 0; i < n; i++) {
                int correctIndex = -1;
                for (int j = 0; j < 5; j++) {
                    int answer = scanner.nextInt();
                    if (answer <= 127) {
                        if (correctIndex == -1) {
                            correctIndex = j;
                        } else {
                            correctIndex = -2;
                        }
                    }
                }
                if (correctIndex >= 0) {
                    System.out.println((char) ('A' + correctIndex));
                } else {
                    System.out.println("*");
                }
            }
        } while (true);
        scanner.close();
    }
}