 import java.util.Scanner;

    public class Problem01 {
        public static void main(String[] args) {
            System.out.println(
                    "Calculator of Rational Numbers\n" +
                            "==============================\n" +
                            "Press Ctrl/Command-Z/D to exit\n"
            );

            var Scanner = new Scanner(System.in);
            mainLoop: while (true) {
                String line;

                Rational num1 = null;
                do {
                    System.out.print("First rational: ");
                    if (!Scanner.hasNextLine()) {
                        break mainLoop;
                    }
                    line = Scanner.nextLine();
                    try {
                        num1 = Rational.parseRational(line);
                    } catch (ArithmeticException | NumberFormatException | AbstractMethodError e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                } while (num1 == null);

                String operator = null;
                for (;;) {
                    System.out.print("operator: ");
                    if (!Scanner.hasNextLine()) {
                        break mainLoop;
                    }
                    operator = Scanner.nextLine().trim();
                    switch (operator) {
                        case "+", "-", "*", "/", "<", ">", "=", "!=", "<=", ">=" -> {}
                        default -> {
                            System.out.printf("Error: '%s' is not a valid operator.%n", operator);
                            continue;
                        }
                    }
                    break;
                }

                Rational num2 = null;
                do {
                    System.out.print("Second rational: ");
                    if (!Scanner.hasNextLine()) {
                        break mainLoop;
                    }
                    line = Scanner.nextLine();
                    try {
                        num2 = Rational.parseRational(line);
                    } catch (NumberFormatException | ArithmeticException | AbstractMethodError e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                } while (num2 == null);

                try {
                    var result = switch (operator) {
                        case "+" -> num1.add(num2);
                        case "-" -> num1.subtract(num2);
                        case "*" -> num1.multiply(num2);
                        case "/" -> num1.divide(num2);
                        case "<" -> num1.compareTo(num2) < 0;
                        case ">" -> num1.compareTo(num2) > 0;
                        case "=" -> num1.compareTo(num2) == 0;
                        case "!=" -> num1.compareTo(num1) != 0;
                        case "<=" -> num1.compareTo(num2) <= 0;
                        case ">=" -> num1.compareTo(num2) >= 0;
                        default -> throw new RuntimeException("Should never happen");
                    };
                    System.out.printf("Result: %s %s %s: %s%n", num1, operator, num2, result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                    continue;
                }
                System.out.println();
            }
        }
    }


