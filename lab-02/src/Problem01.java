import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Field field = new Field();
        Turtle turtle1 = new Turtle(0,0,1,0,false);
        Turtle turtle2 = new Turtle(0,0,1,0,false);
        Turtle[] turtles = new Turtle[] { turtle1, turtle2 };
        Turtle turtle = turtle1;

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine(); // "turn-left", "move 12"
            String[] parts = input.split(" "); // { "turn-left" }, { "move", "12" }
            if (!(parts.length > 0 && parts[0].trim().length() > 0)) {
                System.err.println("Wrong command!");
                continue;
            }
            String command = parts[0].trim();
            switch (command) {
                case "select":
                    if (!(parts.length == 2 && parts[1].trim().length() > 0)) {
                        System.err.println("Turtle not created!");
                        continue;
                    }
                    int turtleNum = Integer.parseInt(parts[1]); // TODO: handle errors
                    if (turtleNum <= 0 || turtleNum > turtles.length) {
                        System.err.println("Turtle not created!");
                        continue;
                    }
                    turtle = turtles[turtleNum - 1];
                    break;
                case "pen-up":
                    turtle.putPenUp();
                    break;
                case "pen-down":
                    turtle.putPenDown();
                    break;
                case "turn-right":
                    turtle.turnRight();
                    break;
                case "turn-left":
                    turtle.turnLeft();
                    break;
                case "move":
                    if (!(parts.length == 2 && parts[1].trim().length() > 0)) {

                        System.err.println("Can't move out bound!");
                        continue;
                    }
                    int steps = Integer.parseInt(parts[1]);
                    if (steps < 0) {
                        System.err.println("Can't accept Negative Value!");
                        continue;
                    }
                    turtle.move(steps, field);
                    break;
                case "display":
                    field.displayField(turtles);
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.err.println("Please Use a Functionality!");
                    break;
            }
        }
    }
}