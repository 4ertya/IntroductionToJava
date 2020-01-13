package branching;

public class Task1_1 {
    public static void main(String[] args) {
        int angle1 = 60;
        int angle2 = 30;

        if ((angle1 + angle2) < 180) {
            System.out.println("the triangle exists");
            if (angle1 == 90 || angle2 == 90 || (angle1 + angle2) == 90) {
                System.out.println("triangle is rectangular");
            } else {
                System.out.println("triangle isn`t rectangular");
            }
        } else {
            System.out.println("the triangle doesn`t exists");
        }
    }
}
