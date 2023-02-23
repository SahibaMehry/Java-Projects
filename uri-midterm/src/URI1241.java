import java.util.Scanner;

public class URI1241 {


    public static void main(String[] args)  {


        Scanner scanner = new Scanner(System.in);


        int number = scanner.nextInt();


        for (int i = 0; i < number; i++) {


            String A = scanner.next();


            String B = scanner.next();


            if (A.endsWith(B)) {


                System.out.println("encaixa");


            } else {


                System.out.println("nao encaixa");


            }


        }


    }


}

