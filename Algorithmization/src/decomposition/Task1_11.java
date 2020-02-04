package decomposition;

import java.util.ArrayList;
import java.util.List;

public class Task1_11 {
    public static void main(String[] args) {
        Task1_11 task1_11 = new Task1_11();
        task1_11.longer(158945, 44562);
    }

    public void longer(int a, int b) {
        String numberA = String.valueOf(a);
        String numberB = String.valueOf(b);
        if (numberA.length() == numberB.length()) {
            System.out.println("the same");
        } else {
            System.out.println(((numberA.length() > numberB.length()) ? a : b) + " - is longer");
        }
    }
}
