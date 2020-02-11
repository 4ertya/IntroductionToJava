public class Main {
    public static void main(String[] args) {
        Test1 test1=new Test1();
        test1.setA(5);
        test1.setB(10);
        int max = test1.max();
        int sum = test1.sum();
        test1.print();
    }
}
