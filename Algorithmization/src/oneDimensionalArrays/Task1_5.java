package oneDimensionalArrays;

public class Task1_5 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 7, 4, 5, 9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }
    }
}
