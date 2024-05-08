package Test;
import java.io.Console;

public class TestInput {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.err.println("No console available.");
            System.exit(1);
        }

        char[] passwordChars = console.readPassword("Enter your password: ");
        String password = new String(passwordChars);

        // Clear password from memory
        clearArray(passwordChars);

        System.out.println("Password entered: " + password);
    }

    // Method to clear the character array
    private static void clearArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = '\0';
        }
    }
}
