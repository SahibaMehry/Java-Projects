import java.util.Scanner;

public class URI1437 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int cases;


        while ((cases = scanner.nextInt()) != 0) {


            int index = 1;


            String line = scanner.next();


            char[] chars = line.toCharArray();
          for (char c : chars) {


                switch (c) {


                    case 'E':


                        if (index - 1 == 0) {


                            index = 4;


                        } else {


                            index--;


                            break;


                        }


                        break;


                    case 'D':


                        if (index + 1 == 5) {


                            index = 1;


                        } else {


                            index++;


                            break;


                        }


                        break;


                }


            }







            switch (index) {


                case 1:


                    System.out.println("N");


                    break;


                case 2:


                    System.out.println("L");


                    break;


                case 3:


                    System.out.println("S");


                    break;


                case 4:


                    System.out.println("O");


                    break;


            }


        }


    }


}

