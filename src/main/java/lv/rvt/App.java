package lv.rvt;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int input = Integer.valueOf(scanner.nextLine());
        printUntilNumber(input);

    }
    public static void printUntilNumber(int input) {
        while (input >= 0) {
            System.out.println("In a hole in the ground there lived a method");
            input--;
    }
    }
}