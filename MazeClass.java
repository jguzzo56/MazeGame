package MazeClass;

public class MazeClass {

    private int x, y;
    private int dir;
    private int lives;
    public static final int NORTH = 1, EAST = 2, SOUTH = 3, WEST = 4;

    public MazeClass(int x, int y, int dir, int lives) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.lives = lives;

    }

    public void move(int distance) {
        if (dir == NORTH) {
            y = y + distance;
        }
        if (dir == EAST) {
            x = x + distance;
        }
        if (dir == SOUTH) {
            y = y - distance;
        }
        if (dir == WEST) {
            x = x - distance;
        }
        System.out.println(x + ", " + y);

        if (x == 0 && y == 1) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 x 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            return;
        }

        if (x == 1 && y == 1) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 x 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            return;
        }

        if (x == 2 && y == 1) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 x 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0");
            return;
        }

        if (x == 2 && y == 2) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 x 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6
            return;
        }
        if (x == 2 && y == 3) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 x 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6
            return;
        }

        if (x == 1 && y == 3) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 x 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6
            return;
        }

        if (x == 0 && y == 3) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 x 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6
            return;
        }

        if (x == -1 && y == 3) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 x 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6
            return;
        }

        if (x == -1 && y == 4) {
            System.out.println("0 0 0 0 0 x 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6
            return;
        }

        if (x == -2 && y == 4) {
            System.out.println("0 0 0 0 x 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == -3 && y == 4) {
            System.out.println("0 0 0 x 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == -3 && y == 3) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 x 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == -4 && y == 3) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 x 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == -5 && y == 3) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 x 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == -6 && y == 3) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("x 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == -6 && y == 2) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("x 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == -6 && y == 1) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("x 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == -5 && y == 1) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 x 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == -5 && y == 0) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 x 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == -5 && y == -1) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 x 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == -4 && y == -1) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 x 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == -3 && y == -1) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 x 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == -2 && y == -1) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 x 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == -2 && y == -2) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 x 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == -1 && y == -2) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 x 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 0 && y == -2) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 x 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 1 && y == -2) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 x 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 2 && y == -2) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 x 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 2 && y == -1) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 x 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 3 && y == -1) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 x 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 3 && y == 0) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 x 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 4 && y == 0) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 x 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 4 && y == 1) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 x 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 4 && y == 2) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 x 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 4 && y == 3) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 x 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 5 && y == 3) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 x 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 6 && y == 3) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 x"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 6 && y == 2) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 x"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 6 && y == 1) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 x"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 6 && y == 0) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 x"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 6 && y == -1) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 x"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 5 && y == -1) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 x 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 5 && y == -2) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 x 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 5 && y == -3) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 x 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 4 && y == -3) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 x 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 3 && y == -3) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 x 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 3 && y == -4) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 0 x 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 2 && y == -4) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 0 x 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            return;
        }

        if (x == 1 && y == -4) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 0 x 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6
            return;
        }

        if (x == 0 && y == -4) {
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //4
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //3
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //0
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-1
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-2
            System.out.println("0 0 0 0 0 0 0 0 0 0 0 0 0"); //-3
            System.out.println("0 0 0 0 0 0 X 0 0 0 0 0 0"); //-3
            //-6-5-4-3-2-1 0 1 2 3 4 5 6

            System.out.println("WINNER!");
            quit();
        }

        if (x > 6 || x < -6) {
            System.out.println("OUT OF BOUNDS!");
            quit();
        }

        if (y > 4 || y < -4) {
            System.out.println("OUT OF BOUNDS!");
            quit();
        } else {
            lives();
            System.out.println("WRONG MOVE. RETURNING TO BEGINNING. " + lives + " LIVES REMAINING.");
            x = 0;
            y = 0;
            dir = NORTH;
            if (lives == 0) {
                System.out.println("GAME OVER!");
                quit();
            }
        }

    }

    public void turnRight() {
        dir++;
        if (dir > 4) {
            dir = 1;
        }
    }

    public void turnLeft() {
        dir--;
        if (dir < 1) {
            dir = 4;
        }
    }

    public void lives() {
        lives--;
    }

    public void quit() {
        System.exit(0);
    }

}
