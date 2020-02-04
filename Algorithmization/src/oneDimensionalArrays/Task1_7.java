package oneDimensionalArrays;

public class Task1_7 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 2, 4, 5, 9, 1};
        int max = arr[0] + arr[arr.length - 1];
        int temp = 0;
        int indexOfFirst = 0;
        int indexOfSecond = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i] + arr[arr.length - 1 - i];
            if (temp > max) {
                max = temp;
                indexOfFirst = i;
                indexOfSecond = arr.length - 1 - i;
            }
        }
        System.out.println("arr[" + indexOfFirst + "] + arr[" + indexOfSecond + "] = " + max);

    }
}
