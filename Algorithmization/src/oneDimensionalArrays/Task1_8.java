package oneDimensionalArrays;

public class Task1_8 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 2, 4, 5, 9, 1};
        int min = arr[0];
        int countOfMin=0;
        for (int number:arr){
            if (number<min){
                min=number;
            }
        }
        for (int number:arr){
            if (number==min){
                countOfMin++;
            }
        }
        int[]newArr =new int[arr.length-countOfMin];
        int indexOfNewArrElement=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=min){
                newArr[indexOfNewArrElement]=arr[i];
                indexOfNewArrElement++;
            }
        }
        for (int x:newArr){
            System.out.print(x+" ");
        }
    }
}
