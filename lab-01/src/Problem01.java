import java.util.Scanner;

public class Problem01 {
    // Turtle's State
    static int turtleX, turtleY;
    static int turtleDX, turtleDY;
    static boolean turtlePenDown;

    // Turtle's Services/ Behaviors
    static void constructTurtle() {
        turtleX = turtleY = 0;
        turtleDX = 1;
        turtleDY = 0;
        turtlePenDown = false;
    }

    static void turtlePutPenUp() {
        turtlePenDown = false;
    }
    static void turtlePutPenDown() {
        turtlePenDown = true;
    }
    static void turtleTurnRight() {
        int temp = turtleDX;
        turtleDX = -turtleDY;
        turtleDY = temp;
    }
    static void turtleTurnLeft() {
        int temp = turtleDX;
        turtleDX = turtleDY;
        turtleDY = -temp;
    }
    static void turtleMove(int steps) {
        for (int i = 0;  i< steps; i++) {
            int nextX = turtleX + turtleDX;
            int nextY = turtleY + turtleDY;
            if (!areCoordsInsideField(nextX, nextY)) {
                break;
            }
            if (turtlePenDown) {
                markField(turtleX, turtleY);
            }
            turtleX = nextX;
            turtleY = nextY;
        }
    }
    static final char EMPTY_CELL  = '.';
    static final char MARKED_CELL = '*';
    static final char TURTLE_CELL = 'T';
    static final int FIELD_WIDTH  = 20;
    static final int FIELD_HEIGHT = 20;
    static char[][] field;

    // Field's Services/Behaviors

    static void constructField() {
        field = new char[FIELD_HEIGHT][FIELD_WIDTH];
        for (int y = 0; y < FIELD_HEIGHT;  y++) {
            for (int x= 0; x < FIELD_WIDTH; x++) {
                field [y] [x] = EMPTY_CELL;
            }
        }
    }
    static void displayField() {
        for (int y = 0; y < FIELD_HEIGHT;  y++) {
            for (int x= 0; x < FIELD_WIDTH; x++) {
//                if (x == turtleX && y == turtleY) {
//                    System.out.print(TURTLE_CELL);
//                } else {
//                    System.out.print(field[y][x]);
//                }
                boolean isTurtle = (x == turtleX && y == turtleY);
                System.out.print(x == turtleX && y == turtleY ? TURTLE_CELL : field[y][x] );
            }
            System.out.println();
        }
    }
    static boolean areCoordsInsideField(int x, int y) {
        return x >= 0 && x < FIELD_WIDTH &&
                y >= 0 && y < FIELD_HEIGHT;
    }
    static void markField(int x, int y) {
        if (areCoordsInsideField(x, y)) {
            field[y][x] = MARKED_CELL;
        }
    }


    public static void main(String[] args) {
        constructField();
        constructTurtle();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine(); // turn left, move 12
            String[] parts = input.split(" "); // turn left, move 12
            if (!(parts.length > 0 && parts[0].trim().length() > 0)) {
                System.err.println("Error: Incorrect format!");
                continue;
            }
            String command = parts[0].trim();
            switch (command) {
                case "pen-up":
                    turtlePutPenUp();
                    break;
                case "pen-down":
                    turtlePutPenDown();
                    break;
                case "turn-right":
                    turtleTurnRight();
                    break;
                case "turn-left":
                    turtleTurnLeft();
                    break;
                case "move":
                    if (!(parts.length == 2 && parts[1].trim().length() > 0)) {
                        System.err.println("Error: invalid input format. Correct format: e.g. move 5");
                        continue;
                    }
                    int steps = Integer.parseInt(parts[1]); //TODO: handle errors
                    if (steps < 0) {
                        System.err.println("Error: Steps cannot be negative.");
                        continue;
                    }
                    turtleMove(steps);
                    break;
                case "display":
                    displayField();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.err.println("Error: Invalid input");
                    break;
            }

        }

    }
}