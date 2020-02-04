package oneDimensionalArrays;

public class Task1_2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 12, 15, 19, 14, 1, 5, 9};
        int z = 8;
        int changes = 0;
        for (int number : arr) {
            if (number > z) {
                number = z;
                changes++;
            }
        }
        System.out.println("count of changes: " + changes);
    }
}
