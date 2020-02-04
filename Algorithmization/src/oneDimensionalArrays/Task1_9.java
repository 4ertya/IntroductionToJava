package oneDimensionalArrays;

public class Task1_9 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 2, 4, 5, 9, 7, 3, 5, 2, 4, 7};
        int countResult = 0;
        int number = arr[0];
        for (int item : arr) {
            int count = 0;
            for (int value : arr) {
                if (value == item) {
                    count++;
                }
            }
            if (count >= countResult) {
                countResult = count;
                number = (Math.max(number, item));
            }
        }
        System.out.println("Number: "+number+ " was found "+countResult+" times");


    }
}
