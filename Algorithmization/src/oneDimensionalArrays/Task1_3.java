package oneDimensionalArrays;

public class Task1_3 {
    public static void main(String[] args) {
        int[] arr = {-2, -6, 15, 2, -3, 0, 5, 0, -4, 0};
        int countOfZero = 0;
        int countOfNegative = 0;
        int countOfPositive = 0;
        for (int number : arr) {
            if (number < 0) {
                countOfNegative++;
            } else if (number > 0) {
                countOfPositive++;
            } else {
                countOfZero++;
            }
        }
        System.out.println("Zero: "+countOfZero);
        System.out.println("Positive: "+countOfPositive);
        System.out.println("Negative: "+countOfNegative);
    }
}
