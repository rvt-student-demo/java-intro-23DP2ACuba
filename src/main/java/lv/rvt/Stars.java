package lv.rvt;

public class Stars {
    public static void printSpace(int n){
        for (int i = 0; i < n; i++){
            System.out.print(" ");
        }
    }
    public static void printStars(int n){
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
    }
    public static void printTriangle(int h){
        for (int i = 1; i < h+1; i++){
            printSpace(h-i);
            printStars(i);
            System.out.println();
        }

    }
    
    public static void printChristmasTree(int h){
        int j=0;
        for (int i = 1; i < h+1; i++){
            printSpace(h-i);
            printStars(i+j);
            j += 1;
            System.out.println();
        }
        for (int i = 0; i < 2; i++ ){
            printSpace(h-2);
            printStars(3);
            System.out.println();
        }
    }
}
