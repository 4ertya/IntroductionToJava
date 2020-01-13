package loops;

public class Task1_2 {
    public static void main(String[] args) {
        int a = -2;
        int b = 10;
        int y;

        for (int i = a; i <= b; i++) {
            y = (i > 2) ? i : -i;
            System.out.printf("x = %2d, y = %2d\n", i, y);
        }
    }
}
