package lv.rvt;

public class Stars {
    public static void printStars(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        } 

    }
}
