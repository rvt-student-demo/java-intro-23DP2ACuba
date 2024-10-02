package lv.rvt;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int input = Integer.valueOf(scanner.nextLine());
        while (input >= 0) {
            printText();
            input--;
    }

    }
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}