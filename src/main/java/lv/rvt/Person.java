package lv.rvt;

public class Person {
    private String name;
    private int age;

    public Person(String initialName) {

        this.age = 0;
        this.name = initialName;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public boolean isOfLegalAge(){
        if (this.age < 18){
            return false;

        }
        return true;
    }

    
    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
}