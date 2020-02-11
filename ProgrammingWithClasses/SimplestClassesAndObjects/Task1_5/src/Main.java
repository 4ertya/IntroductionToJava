public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("from: " + counter.getFrom());
        System.out.println("to: " + counter.getTo());
        counter.increase();
        counter.increase();
        counter.increase();
        counter.reduce();
        System.out.println("counter: " + counter.getCounter());

    }
}
