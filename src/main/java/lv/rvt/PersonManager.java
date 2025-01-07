package lv.rvt;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

    private static void showPeople(String csvFile) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(csvFile));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    private static void addPerson(String csvFile, Scanner scanner) {
        System.out.println("Enter the person's name:");
        String name = scanner.nextLine();
        System.out.println("Enter the person's age:");
        String age = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile, true))) {
            writer.write(name + "," + age);
            writer.newLine();
            System.out.println("Person added successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
    
}
