package lv.rvt;

public class Student extends Person{
    private int credits;
    public Student(String name, String adress){
        super(name, adress);
    }
    public void study(){
        credits++;
    }
    public int credits(){
        return credits;
    }
    @Override
    public String toString(){
        return String.format("%s \n    %s \n    Student credits: %d", getName(), getAdress(), credits);
    }

}
