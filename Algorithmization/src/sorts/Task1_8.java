package sorts;

public class Task1_8 {
    public static void main(String[] args) {
        int[] p = {1, 2, 3, 2, 1};
        int[] q = {2, 3, 2, 6, 7};
        int max = 0;

        for (int i = 0; i < q.length; i++) {
            if (q[i] > max) {
                max = q[i];
            }
        }
        int noz = 0;
        boolean isNOZ = false;

        while (!isNOZ) {
            noz = noz + max;
            for (int i = 0; i < q.length; i++) {
                if (noz % q[i] == 0) {
                    isNOZ = true;
                } else {
                    isNOZ = false;
                    break;
                }
            }

        }
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - 1; j++) {
                if (p[j] * noz / q[j] > p[j + 1] * noz / q[j + 1]) {
                    int temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                    temp = q[j];
                    q[j] = q[j + 1];
                    q[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i] * noz / q[i] + " / " + noz);

        }


    }
}
