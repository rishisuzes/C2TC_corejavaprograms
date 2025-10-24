package notes;

import java.io.*;
import java.util.Scanner;
public class Notesapp {
	
	private static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("=== Notes Manager ===");

        do {
            System.out.println("\n1. Write Note");
            System.out.println("2. Read Notes");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> writeNote(scanner);
                case 2 -> readNotes();
                case 3 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        scanner.close();
    }

    // Function to write notes to file
    private static void writeNote(Scanner scanner) {
        System.out.println("\nEnter your note (type 'end' in a new line to finish):");
        StringBuilder noteBuilder = new StringBuilder();
        String line;

        while (true) {
            line = scanner.nextLine();
            if (line.equalsIgnoreCase("end")) {
                break;
            }
            noteBuilder.append(line).append(System.lineSeparator());
        }

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) { // true = append mode
            writer.write(noteBuilder.toString());
            writer.write(System.lineSeparator());
            System.out.println("✅ Note saved successfully!");
        } catch (IOException e) {
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }
    }

    // Function to read notes from file
    private static void readNotes() {
        System.out.println("\n=== Your Saved Notes ===");

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean isEmpty = true;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                isEmpty = false;
            }

            if (isEmpty) {
                System.out.println("(No notes found)");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No notes found yet. Start writing one!");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
