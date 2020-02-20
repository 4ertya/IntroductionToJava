package by.epam.decomposition;

public class Task1_9 {
    private int x;
    private int y;
    private int z;
    private int t;

    public static void main(String[] args) {
        Task1_9 task1_9 = new Task1_9(12, 9, 5, 14);
        System.out.println(task1_9.getSquare());
    }

    public Task1_9(int x, int y, int z, int t) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = t;
    }

    public double getSquare() {
        if (isExist()) {
            double diagonal = Math.sqrt(x * x + y * y);
            double s1 = x * y / 2;
            double p = (diagonal + z + t) / 2;
            double s2 = Math.sqrt(p * (p - diagonal) * (p - z) * (p - t));
            return s1 + s2;
        }
        System.out.println("is not exist");
        return 0;
    }

    public boolean isExist() {
        if (x >= y + z + t) {
            return false;
        }
        if (y >= x + z + t) {
            return false;
        }
        if (z >= y + x + t) {
            return false;
        }
        if (t >= y + z + x) {
            return false;
        }
        return true;
    }
}
