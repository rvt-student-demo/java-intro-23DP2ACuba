package lv.rvt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class PersonManager {

    public static ArrayList<Person> getPersonList() {
        String csv = "/workspaces/java-intro-23DP2ACuba/src/data/persons.csv";
        ArrayList<Person> personList = new ArrayList<>();
        
        try(BufferedReader reader = new BufferedReader(new FileReader(csv))){
        String line;
        reader.readLine();
        while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0].trim();         
                int age = Integer.parseInt(parts[1].trim());
                int weight = Integer.parseInt(parts[2].trim());
                int height = Integer.parseInt(parts[3].trim());
                Person person = new Person(name, age, weight, height);
                personList.add(person);
        }
        return personList;
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + csv);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error reading the file: " + csv);
            e.printStackTrace();
        }
        return personList;
    }
    
}
