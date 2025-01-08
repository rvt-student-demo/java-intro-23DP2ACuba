package lv.rvt;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        Box box1 = new Box(2.5, 5.0, 6.0);
        Box box2 = new Box(2, 4.0, 5.0);
        System.out.println(box1.nests(box2));
        System.out.println(box2.nests(box1));
    }
}