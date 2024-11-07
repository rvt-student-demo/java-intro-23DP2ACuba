package lv.rvt;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = count;
        this.sum = sum;
    }

    public void addNumber(int number) {
        this.count++;
        sum += number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return this.sum / this.count;
    }
}
