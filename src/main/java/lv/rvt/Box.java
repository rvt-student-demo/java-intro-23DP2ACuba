package lv.rvt;

public class Box {
    public double w;
    public double h;
    public double l;
    public double side;

    public Box ( double width, double height, double length ) {
        this.w = width;
        this.h = height;
        this.l = length;
    }
    public Box(double side){
        this.side = side;
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
        return this.h > insideBox.height() &&
                this.w > insideBox.width() &&
                this.l > insideBox.length();
    }

}
