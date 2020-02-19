package by.epam.linearPrograms;

/**
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае
 */

public class Task6 {
    public static void main(String[] args) {
        int x = -3;
        int y = 2;
        boolean set1;
        boolean set2;

        set1 = -2 <= x && x <= 2 && 0 <= y && y <= 4;
        set2 = -4 <= x && x <= 4 && -3 <= y && y <= 0;

        System.out.println(set1 | set2);
    }
}
