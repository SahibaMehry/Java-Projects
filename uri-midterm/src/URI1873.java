import java.util.Scanner;

public class URI1873 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            String[] weapons = sc.nextLine().split(" ");
            String result = getWinner(weapons[0], weapons[1]);
            System.out.println(result);
        }
    }

    public static String getWinner(String r, String s) {
        if (r.equals(s)) {
            return "empate";
        } else if (r.equals("pedra") && (s.equals("tesoura") || s.equals("lagarto"))) {
            return "rajesh";
        } else if (r.equals("papel") && (s.equals("pedra") || s.equals("spock"))) {
            return "rajesh";
        } else if (r.equals("tesoura") && (s.equals("papel") || s.equals("lagarto"))) {
            return "rajesh";
        } else if (r.equals("lagarto") && (s.equals("papel") || s.equals("spock"))) {
            return "rajesh";
        } else if (r.equals("spock") && (s.equals("tesoura") || s.equals("pedra"))) {
            return "rajesh";
        } else {
            return "sheldon";
        }
    }
}
