public class Test1 {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int max() {
        return Math.max(a, b);
    }

    public void print() {
        System.out.println("int a = " + a);
        System.out.println("int b = " + b);
    }
}
