package lv.rvt;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
            int number = 90;
              
                if (number > 0 && number < 50) {
                System.out.println("failed");
              } else if (number > 49 && number < 60) {
                System.out.println("1");
              } else if (number > 59 && number < 70) {
                System.out.println("2");
              } else if (number > 69 && number < 80) {
                System.out.println("3");
              } else if (number > 79 && number < 90) {
                System.out.println("4");
              } else if (number > 89) {
                System.out.println("5");
              } else {
                System.out.println("Impossible");
              }
        }
        
}
