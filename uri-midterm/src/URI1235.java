import java.util.Scanner;

public class URI1235 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int num = scanner.nextInt();


        for (int i = 0; i < num; i++) {


            String word = readLine(scanner);


            StringBuilder parte1 = new StringBuilder(word.substring(0, word.length() / 2));


            StringBuilder parte2 = new StringBuilder(word.substring(word.length() / 2, word.length()));


            parte1.reverse();


            parte2.reverse();


            System.out.println(parte1.toString() + parte2.toString());


        }


    }

    public static String readLine(Scanner scanner) {


        String line = scanner.nextLine();


        while (line.isEmpty())


            line = scanner.nextLine();


        return line;


    }


}

