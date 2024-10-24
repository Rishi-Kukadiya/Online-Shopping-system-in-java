package clear;
import java.io.IOException;

public class clear {
    public static void clc() {
        try {
            // Run the "cls" command to clear the console
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException e) {
            // Handle the IOException specifically for better clarity
            System.err.println("An IOException occurred while trying to clear the console: " + e.getMessage());
            e.printStackTrace();
        } catch (InterruptedException e) {
            // Handle the InterruptedException specifically
            System.err.println("The console clear process was interrupted: " + e.getMessage());
            Thread.currentThread().interrupt(); // Restore interrupted state
        }
    }
}
