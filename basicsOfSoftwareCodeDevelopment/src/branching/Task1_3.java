package branching;

public class Task1_3 {
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 3;
        int x2 = 4;
        int y2 = 5;
        int x3 = 6;
        int y3 = 7;

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("points on one line");
        } else System.out.println("points are not on one line");
    }
}
