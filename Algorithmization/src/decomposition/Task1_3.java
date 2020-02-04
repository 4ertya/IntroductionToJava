package decomposition;

public class Task1_3 {
    private double a;

    public static void main(String[] args) {
        Task1_3 task1_3 = new Task1_3(15);
        System.out.println("hexagon side = " + task1_3.getA());
        System.out.println("hexagon square = " + task1_3.hexagonSquare());
    }

    public double hexagonSquare() {
        return 3*Math.sqrt(3) * Math.pow(a, 2) / 2;
    }

    public Task1_3(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }
}

