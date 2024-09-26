package lv.rvt;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int start = Integer.valueOf(scanner.nextLine());
        for (int i = start; i < 101; i++) {
            System.out.println(i);
        }

            
    }
}
