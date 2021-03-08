package labor4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

int

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("Labor4/lab4_1_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // kilepes a programbol
            System.exit(1);
        }
        System.out.println("itt vagyok");
        int lineCounter = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            ++lineCounter;
            System.out.println(lineCounter + ". " + line);
        }


        scanner = null;
        try {
            scanner = new Scanner(new File("Labor4/lab4_1_input.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // kilepes a programbol
            System.exit(1);
        }
        ArrayList<Person> persons = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            if (line.isEmpty()) {
                continue;
            }
            String[] items = line.split(",");

            String firstName = items[0].trim();
            String lastName = items[1].trim();
            int birthYear = Integer.parseInt(items[2].trim());

            persons.add(new Person(firstName, lastName, birthYear));
        }

        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println(persons.size());
    }
}
