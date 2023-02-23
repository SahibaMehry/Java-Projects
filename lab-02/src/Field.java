public class Field {
    // Field's State
    char EMPTY_CELL  = '.';
    char MARKED_CELL = '*';
    char TURTLE_CELL = 'T';
    int FIELD_WIDTH  = 20;
    int FIELD_HEIGHT = 20;
    char[][] field;

    // Field's Services/Behaviour
    Field() {
        field = new char[FIELD_HEIGHT][FIELD_WIDTH];
        for (int y = 0; y < FIELD_HEIGHT; ++y) {
            for (int x = 0; x < FIELD_WIDTH; ++x) {
                field[y][x] = EMPTY_CELL;
            }
        }
    }

    void displayField(Turtle[] turtles) {
        for (int y = 0; y < FIELD_HEIGHT; ++y) {
            columnLoop:
            for (int x = 0; x < FIELD_WIDTH; ++x) {
                for (Turtle turtle : turtles) {
                    if (x == turtle.x && y == turtle.y) {
                        System.out.print(TURTLE_CELL);
                        continue columnLoop;
                    }
                }
                System.out.print(field[y][x]);
            }
            System.out.println();
        }
    }

    boolean areCoordsInsideField(int x, int y) {
        return x >= 0 && x < FIELD_WIDTH &&
                y >= 0 && y < FIELD_HEIGHT;
    }

    void markField(int x, int y) {
        if (areCoordsInsideField(x, y)) {
            field[y][x] = MARKED_CELL;
        }
    }
}