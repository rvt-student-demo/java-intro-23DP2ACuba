package lv.rvt;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            sum = sum + number;
            if (number == 0) {
                break;
            }else {
                i = i + 1;

            }

            
        }
        System.out.println("Number of numbers: " + i);
        System.out.println("Sum of the numbers: " + sum);
    }
}
