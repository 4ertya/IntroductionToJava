package branching;

public class Task1_4 {
    public static void main(String[] args) {
        int holeHeight = 3;
        int holeWidth = 4;
        int brickLength = 6;
        int brickWidth = 3;
        int brickHeight = 2;

        if ((holeHeight >= brickLength && holeWidth >= brickWidth) ||
                (holeHeight >= brickWidth && holeWidth >= brickLength) ||
                (holeHeight >= brickLength && holeWidth >= brickHeight) ||
                (holeHeight >= brickHeight && holeWidth >= brickLength) ||
                (holeHeight >= brickHeight && holeWidth >= brickWidth) ||
                (holeHeight >= brickWidth && holeWidth >= brickHeight)) {
            System.out.println("the brick passes through the hole");
        } else {
            System.out.println("the brick doesn`t pass through the hole");
        }
    }
}

