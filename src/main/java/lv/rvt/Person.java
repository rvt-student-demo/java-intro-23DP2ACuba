package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Weight: %d, Height: %d", name, age, weight, height);
    }
}
