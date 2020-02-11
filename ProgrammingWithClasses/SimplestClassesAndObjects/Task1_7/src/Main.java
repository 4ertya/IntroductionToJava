public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,4,2,-3,8,6);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        triangle.meridianIntersection();
    }
}
