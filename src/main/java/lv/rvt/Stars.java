package lv.rvt;

public class Stars {
    public static void printStars(int h){
        for (int i = 0; i < h; i++) {
            System.out.print("*");
        }             
        System.out.println();


    }
    public static void printSquare(int h){
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++){
                System.out.print("*");
            }
            System.out.println();
        } 

    }
    public static void printRectangle(int h, int w){
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++){
                System.out.print("*");
            }
            System.out.println();
        } 

    }
    public static void printTriangle(int h){
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        } 

    }
}
