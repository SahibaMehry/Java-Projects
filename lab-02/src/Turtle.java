class Turtle {
    // Turtle's State
    int x, y;
    int dx, dy;
    boolean penDown;

    // Turtle's Services/Behaviour
    Turtle(int x, int y, int dx, int dy, boolean pen) {
        this.x  = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        penDown = pen;
    }

    void putPenUp() {
        penDown = false;
    }

    void putPenDown() {
        penDown = true;
    }

    void turnRight() {
        int temp = dx;
        dx = -dy;
        dy = temp;
    }

    void turnLeft() {
        int temp = dx;
        dx = dy;
        dy = -temp;
    }

    void move(int steps, Field field) {
        for (int i = 0; i < steps; ++i) {
            int nextX = x + dx;
            int nextY = y + dy;
            // TODO: fix the code below
            if (!field.areCoordsInsideField(nextX, nextY)) {
                break;
            }

            if (penDown) {
                // TODO: fix the code below
                field.markField(x, y);
            }

            x = nextX;
            y = nextY;
        }
    }
}