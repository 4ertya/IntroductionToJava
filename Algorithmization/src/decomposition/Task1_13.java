package decomposition;

import java.util.Arrays;

public class Task1_13 {
    private int n;

    public static void main(String[] args) {
        Task1_13 task1_13 = new Task1_13();
        System.out.println(Arrays.toString(task1_13.dataForTask(100)));
        task1_13.printResult(task1_13.resultMass());
    }

    public int[] dataForTask(int n) {
        this.n = n;
        int[] dataMass = new int[n + 1];
        int value = n;
        for (int i = 0; i < dataMass.length; i++) {
            dataMass[i] = value;
            value++;
        }
        return dataMass;
    }


    public int[][] resultMass() {
        int index = 0;
        int[][] resultMass = new int[7][2];
        int[] temp = dataForTask(n);
        for (int i = 0; i < temp.length - 2; i++) {
            boolean isSimple = true;
            for (int j = 2; j <= Math.ceil(Math.sqrt(temp[i + 2])); j++) {
                if ((temp[i + 2] % j == 0) || temp[i] % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                resultMass[index][0] = temp[i];
                resultMass[index][1] = temp[i + 2];
                index++;
            }
        }
        return resultMass;
    }

    public void printResult(int[][] mass) {
        for (int[] result : mass) {
            for (Integer number : result) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}

