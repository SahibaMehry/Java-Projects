import java.util.Scanner;

public class URI1514 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n, m;


        while ((n = scanner.nextInt()) != 0 && (m = scanner.nextInt()) != 0) {


            int[] rows = new int[n];


            int [] columns = new int[m];


            int c = 0;

            for (int i = 0; i < n; i++) {


                for (int j = 0; j < m;j++) {


                    int next = scanner.nextInt();


                    rows[i] += next;


                    columns[j] += next;


                }
            }

            for (int i = 0; i < n; i++) {


                if (rows[i] == m) {


                    break;


                }


            }







            for (int i = 0; i < n; i++) {


                if (rows[i] == 0) {


                    c++;


                }


            }







            for (int j = 0; j < m; j++) {


                if (columns[j] == 0) {


                    c++;


                    break;


                }


            }







            for (int j = 0; j < m; j++) {


                if (columns[j] == n) {


                    c++;


                    break;


                }


            }







            System.out.println(4 - c);


        }


    }


}

