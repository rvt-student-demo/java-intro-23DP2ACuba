package lv.rvt;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ievadisavu vardu>>");
        String name = scanner.nextLine();
        System.out.print("ievadisavu uzvardu>>");
        String lastname = scanner.nextLine();
        System.out.print("ievadisavu gruppu>>");
        String group = scanner.nextLine();-

        System.out.println(name + " " + lastname + " " + group);

    }

}