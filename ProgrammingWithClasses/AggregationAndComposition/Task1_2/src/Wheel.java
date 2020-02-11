public class Wheel {
    private boolean isGood;
    private int size;

    public Wheel(int size) {
        this.size = size;
        this.isGood = true;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean isGood) {
        this.isGood = isGood;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return
                "isGood= " + isGood +
                        ", size= " + size;
    }
}
