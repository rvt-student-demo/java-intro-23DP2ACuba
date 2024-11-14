package lv.rvt;

public class Gauge {
    private int value;
    public void __init__()
    {
        this.value = value;
    }
    
    public void increase()
    {
        value += 1;
    }

    public void decrease()
    {
        value -= 1;
    }

    public int value()
    {
        return this.value;
    }
    
}
