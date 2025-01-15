package lv.rvt;

public class Box {
    private double w;
    private double h;
    private double l;


    public Box ( double width, double height, double length ) {
        this.w = width;
        this.h = height;
        this.l = length;
    }
    public Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }
    public Box (Box oldBox ) {
        this.w = oldBox.w;
        this.h = oldBox.h;
        this.l = oldBox.l;
    }
    private double faceArea(){
        return l * w;
    }
    private double topArea(){
        return l * h;
    }
    private double sideArea(){
        return w * h;
    }
    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }
    public double volume() {
        return l * w * h;
    }
    public double length(){
        return l;
    }
    public double width(){
        return w;
    }
    public double height(){
        return h;
    }

    public Box biggerBox( Box oldBox )
    {
        return new Box( 1.25 * oldBox.width(),  1.25 * oldBox.height(), 1.25 * oldBox.length());
    }
    public boolean nests(Box insideBox){
        return h > insideBox.height() &&
                w > insideBox.width() &&
                l > insideBox.length();
    }

}
