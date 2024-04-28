package ExceptionHandlingInJava.CheckedAndUncheckedExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedAndUncheckedExceptionHandling {
    // Method that throws a checked exception (FileNotFoundException)
    public static void readFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }

    // Method that throws an unchecked exception (NullPointerException)
    public static void performNullOperation(String str) {
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        try {
            // Handling a checked exception
            readFromFile("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        try {
            // Handling an unchecked exception
            performNullOperation(null);
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        }
    }
}
