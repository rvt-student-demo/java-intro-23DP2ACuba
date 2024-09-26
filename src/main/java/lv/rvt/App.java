package lv.rvt;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int end = Integer.valueOf(scanner.nextLine());
        int f = 1;
        for (int i = 1; i <= end; i++) {
            f *= i;
        }
        System.out.println(f);
            
    }
}
