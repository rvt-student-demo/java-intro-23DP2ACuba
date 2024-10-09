package lv.rvt;

public class Stars {
    public static void printStars(int h, int w){
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++){
                System.out.print("*");
            }
            System.out.println();
        } 

    }
}
