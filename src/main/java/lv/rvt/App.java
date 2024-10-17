package lv.rvt;
import java.util.*;
import java.util.Random;
public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(10);
        int score = 5;
        System.out.println("I am thinking of a number from 1 to 10. \n You must guess what it is in three tries. ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a guess:");
            int guess = scanner.nextInt();
            if (guess == num){
                System.out.println("RIGHT!\n You have won the game.");
                break;
            } else {
                if (i == 2){
                    System.out.printf("wrong!\nThe correct number was %d.\nYou have lost the game.\n", num);
                    break;
                }
                score--;
                cwh(guess, num);
            }

        }
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