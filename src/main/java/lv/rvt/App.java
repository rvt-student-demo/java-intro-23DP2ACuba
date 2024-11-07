package lv.rvt;
import java.util.*;
public class App 
{
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in)

        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        Statistics sum = new Statistics();
        while (true){
            int input =Integer.valueOf(scanner.nextLine());
            if (input == 1){
                break;
            } 
            if (input % 2 == 0) {
                even.addNumber(input);
            }
            if (input % 2 != 0) {
                odd.addNumber(input);
            }
            sum.addNumber(input)
        }
        System.out.println(sum);
        System.out.println(even.sum());
        System.out.println(odd.sum());
    }

}
