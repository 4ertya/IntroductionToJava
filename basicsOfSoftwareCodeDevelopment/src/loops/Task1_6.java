package loops;

public class Task1_6 {
    public static void main(String[] args) {


        for (int i = 33; i < 127; i++) {
            char ch = (char) i;
            System.out.printf("%03d %3s\n", i, ch);
        }
    }
}
