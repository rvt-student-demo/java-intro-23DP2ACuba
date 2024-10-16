package lv.rvt;
import java.util.*;
public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> L = new ArrayList<>();
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            L.add(input);
            if (input == 0){
                break;
            }
        }
        System.out.println(L.get(1) + L.get(2));
    }
}