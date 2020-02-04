package multidimensionalArrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Task1_7 {
    public static void main(String[] args) {
        int n = 4;
        double[][] arr = new double[n][n];
        int countOfNegative=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - i; j++) {
                arr[i][j] = Math.sin((i*i-j*j)/(double)n);
                if (arr[i][j]<0){
                    countOfNegative++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("% 2.3f  ",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Count of negative elements: "+countOfNegative);
    }
}
