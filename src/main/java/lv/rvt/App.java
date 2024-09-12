package lv.rvt;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        // Scanner scanner = new Scanner(System.in);
        // String input = scanner.nextLine();
        // int InputAsInt = Integer.valueOf(scanner.nextLine());
        // int InputAsDouble = Double.valueOf(scanner.nextLine());
        // System.out.println(InputAsInt * 10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the first number:");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println(first + "+" + second + "=" + (first + second));

    }

}