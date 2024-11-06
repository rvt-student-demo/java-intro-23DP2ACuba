package lv.rvt;

public class Agent 
{
    private String fn;
    private String ln;
    public Agent(String fn, String ln)
    {
        this.fn = fn;
        this.ln = ln;
        
    }
    public void print()
    {
        System.out.println("my name is " + this.ln + " , " + this.fn + " " + this.ln);
    }
    public String toString()
    {
        String output = "";
        output = "my name is " + this.ln + " , " + this.fn + " " + this.ln;
        return output;
    }

}
