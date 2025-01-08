package lv.rvt;

public class Box {
    private double w;
    private double h;
    private double l;
    private double side;

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
        return this.l * this.w;
    }
    private double topArea(){
        return this.l * this.h;
    }
    private double sideArea(){
        return this.w * this.h;
    }
    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }
    public double volume() {
        return this.l * this.w * this.h;
    }
    public double length(){
        return this.l;
    }
    public double width(){
        return this.w;
    }
    public double height(){
        return this.h;
    }

    public Box niggerBox( Box oldBox )
    {
        return new Box( 0.75 * oldBox.width(),  0.75 * oldBox.height(), 0.75 * oldBox.length());
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
