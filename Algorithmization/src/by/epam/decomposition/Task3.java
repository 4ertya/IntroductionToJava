package by.epam.decomposition;

/**
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
 * треугольника.
 */

public class Task1_3 {
    private double a;

    public static void main(String[] args) {
        Task1_3 task1_3 = new Task1_3(15);
        System.out.println("hexagon side = " + task1_3.getA());
        System.out.println("hexagon square = " + task1_3.hexagonSquare());
    }

    public double hexagonSquare() {
        return 6 * triangleSquare();
    }

    public double triangleSquare() {
        return a * a * Math.sqrt(3) / 4;
    }

    public Task1_3(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }
}

