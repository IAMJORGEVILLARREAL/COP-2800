import java.util.Scanner;
import java.io.*;

public class UppercaseFileConverter {
    public static void main(String[] args) throws IOException {
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the name of the input file
        System.out.println("Enter Input File: ");
        String inputFilename = scanner.nextLine();

        // Create a File object representing the input file and a Scanner object to read from it
        File inputFile = new File(inputFilename);
        Scanner fileReader = new Scanner(inputFile);

        // Prompt the user to enter the name of the output file
        System.out.println("Enter Output File: ");
        String outputFilename = scanner.nextLine();

        // Create a PrintWriter object to write to the output file
        PrintWriter outputFile = new PrintWriter(outputFilename);

        // Read each line from the input file, convert it to uppercase, and write it to the output file
        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            String uppercaseLine = line.toUpperCase();
            outputFile.println(uppercaseLine);
        }

        // Close the input file, output file, and scanner
        fileReader.close();
        outputFile.close();
        scanner.close();
    }
}
