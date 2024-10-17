package lv.rvt;
import java.util.*;
public class App 
{
    public static void main(String[] args) {
        int vic = 0;
        String rating = "";
        for (int i = 0; i < 10; i++){
            System.out.printf("round %d:\n", i+1);
            vic += game();
            System.out.printf("\nYou have won %d out of %d rounds.\n", vic, i+1);
            System.out.println();
        }

        if (vic < 8){
            rating = "amature";
        } else if (vic < 8){
            rating = "advanced";
        }else if (vic < 10){
            rating = "professionals";
        } else {
            rating = "hacker";
        }
        System.out.printf("Your rating: %s \n", rating);
    }
    static int game(){
        int res = 0;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(10);
        System.out.println("I am thinking of a number from 1 to 10. \n You must guess what it is in three tries. ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a guess:");
            int guess = scanner.nextInt();
            if (guess == num){
                System.out.println("RIGHT!\n You have won the game.");
                res = 1;
                break;
            } else {
                if (i == 2){
                    System.out.printf("wrong!\nThe correct number was %d.\nYou have lost the game.\n", num);
                    break;
                }
                cwh(guess, num);
            }

        }
        return res;
    }
    public static void cwh( int guess, int num){
        if (guess - 1 == num || guess + 1 == num){
            System.out.println("hot");
        } else if (guess - 2 == num || guess + 2 == num) {
            System.out.println("warm");
        } else {
            System.out.println("cold");
        }
    }

}