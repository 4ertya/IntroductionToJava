package by.epam.decomposition;

public class Task1_4 {
    private int[] x = new int[5];
    private int[] y = new int[5];
    private int countOfDots = 0;

    public static void main(String[] args) {
        Task1_4 task1_4 = new Task1_4();
        task1_4.addDot(2, 5);
        task1_4.addDot(7, 12);
        task1_4.addDot(1, 6);
        task1_4.addDot(4, 10);
        task1_4.addDot(11, 1);
        task1_4.theLongestDistance();
    }

    public void addDot(int x, int y) {
        this.x[countOfDots] = x;
        this.y[countOfDots] = y;
        countOfDots++;
    }

    public double distanceBetween(int a, int b) {
        return Math.sqrt(Math.pow((x[a] - x[b]), 2) + Math.pow((y[a] - y[b]), 2));
    }

    public void theLongestDistance() {
        double max = 0;
        int dot1x = 0;
        int dot1y = 0;
        int dot2x = 0;
        int dot2y = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (distanceBetween(i, j) > max) {
                    max = distanceBetween(i, j);
                    dot1x = x[i];
                    dot1y = y[i];
                    dot2x = x[j];
                    dot2y = y[j];
                }
            }
        }
        System.out.println("Between dots (" + dot1x + "," + dot1y + ") & (" + dot2x + "," + dot2y + ") - " + max);
    }
}
