package lv.rvt;
import java.util.*;
public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(10);
        int score = 5;
        System.out.println("I am thinking of a number from 1 to 10. \n You must guess what it is in three tries. ");
        System.out.println("Your beginning score is 5 points.");
        while (true) {
            System.out.println("Enter a guess:");
            int guess = scanner.nextInt();
            if (guess == num){
                System.out.println("RIGHT!\n You have won the game.");
                break;
            } else {
                score--;
                dif(guess, num, score);
                if (score == 0){
                    System.out.printf("The correct number was %d.\nYou have lost the game.\n", num);
                    break;
                }
            }

        }
        System.out.printf("Your score is %d \n", score);
    }
    public static void dif( int guess, int num, int score){
        if (guess > num){
            System.out.print("Too high");
        } else {
            System.out.print("To low");
        }
        System.out.printf(" Your score is now: %d \n", score);
    }

}