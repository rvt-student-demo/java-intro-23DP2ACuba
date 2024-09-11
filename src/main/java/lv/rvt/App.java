package lv.rvt;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {

    // String userinput = scanner.nextLine();
    // System.out.println(userinput);
    // String start = "My name is ";
    // String end = ", James Bond";
    // int digit = 99;
    // System.out.println("mani euro" + digit + 100);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ievadi savu vārdu:");
    String name = scanner.nextLine();
    System.out.println("Ievadi savu uzvārdu:");
    String lastname = scanner.nextLine();
    System.out.println("Ievadi savu gruppu:");
    String group = scanner.nextLine();
    System.out.println(name + " " + lastname + " " + group);
    }

}