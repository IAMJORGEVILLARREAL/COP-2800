
//Jorge Villarreal Soules

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {
        // Read the list of popular girl names into an ArrayList
        ArrayList<String> girlNames = readFile("C:/Users/jvill/Downloads/GirlNames.txt");
        // Read the list of popular boy names into an ArrayList
        ArrayList<String> boyNames = readFile("C:/Users/jvill/Downloads/BoyNames.txt");

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a girl's name
        System.out.println("Enter a girl's name:");
        String girlName = scanner.nextLine();

        // Prompt the user to enter a boy's name
        System.out.println("Enter a boy's name:");
        String boyName = scanner.nextLine();

        // Check if the entered girl's name is among the most popular girl names
        if (girlNames.contains(girlName)) {
            System.out.println(girlName + " is among the most popular girl names.");
        } else {
            System.out.println(girlName + " is not among the most popular girl names.");
        }

        // Check if the entered boy's name is among the most popular boy names
        if (boyNames.contains(boyName)) {
            System.out.println(boyName + " is among the most popular boy names.");
        } else {
            System.out.println(boyName + " is not among the most popular boy names.");
        }

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }

    // Method to read a file and return its contents as an ArrayList of strings
    private static ArrayList<String> readFile(String fileName) {
        ArrayList<String> names = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read each line of the file and add it to the ArrayList
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            // Print an error message if there is an exception while reading the file
            System.err.println("Error reading file: " + e.getMessage());
        }
        return names;
    }
}
