package lv.rvt;

public class Teacher extends Person{
    private int salary = 0;
    public Teacher(String name, String adress, int salary){
        super(name, adress);
        this.salary = salary;
    }
    public String toString(){
        return String.format("%s \n    %s \n    Student credits: %d", getName(), getAdress(), salary);
    }

}

