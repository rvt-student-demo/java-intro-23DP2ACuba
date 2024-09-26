package lv.rvt;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int i = 0, odd = 0, sum = 0, even = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            sum += input;
            i++;
            if (input % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Thx, bye");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers:" + i);
        System.out.println("Average; " + (sum / i));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
