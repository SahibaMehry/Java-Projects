import java.util.Locale;
import java.util.Scanner;

public class URI1238 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int N = Integer.parseInt(sc.nextLine());

        for (int i=0 ; i<N ; i++) {
            String[] prohabtid = sc.nextLine().split(" ");
            char[] fr1 = prohabtid[0].toCharArray();
            char[] fr2 = prohabtid[1].toCharArray();
            String sale = "";

            for (int z=0 ; z<(fr1.length+fr2.length) ; z++) {
                if (z<fr1.length)

                    sale+=fr1[z];
                if (z<fr2.length)
                    sale+=fr2[z];
            }
            System.out.println(sale);
        }
        sc.close();
    }
}