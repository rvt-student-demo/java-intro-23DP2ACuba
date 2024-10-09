package lv.rvt;

public class Stars {
    public static void printSpace(int n){
        System.out.print(" ");
    }
    public static void printStars(){
        System.out.print("*");
    }
    public static void printTriangle(int h){
        for (int i = 0; i < h+1; i++){
            for (int j = 0; j < h-i+1; j++){
                printSpace(1);
            }
            for (int a = 0; a < i; a++){
                printStars();
            }
            System.out.println();
        }

    }
}
