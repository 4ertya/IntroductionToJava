package by.epam;

public class Counter {
    private int from;
    private int to;
    private int counter = from;

    public Counter() {
        from = 0;
        to = 100;
    }

    public Counter(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public void increase() {
        if (counter < to) {
            counter++;
        }
    }

    public void reduce() {
        if (counter > from) {
            counter--;
        }
    }

    public int getCounter() {
        return counter;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }
}
