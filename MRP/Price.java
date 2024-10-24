package MRP;
import clear.clear;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Price {

    // Method to print a welcome banner with the user's name
    public static void printName(String name) {
        System.out.println("====================================================================");
        System.out.println("                   " + "Welcome " + name + " to SwiftShop           ");
        System.out.println("====================================================================");
        System.out.println("=============   Check prices to find your favorites!   =============");
        System.out.println("====================================================================");
    }
    

    // Method to process MRP data and display it nicely
    public static void mrp(String PathName, String UserName) {
        try {
            // Check if the file exists
            File file = new File(PathName);
            if (!file.exists()) {
                throw new FileNotFoundException("File not found: " + PathName);
            }

            // Read data from the file
            try (Scanner sc = new Scanner(file)) {
                String data = sc.nextLine(); // Store file content in 'data'
                // Create two ArrayLists to store the first and second parts
                ArrayList<String> firstPart = new ArrayList<>();
                ArrayList<String> secondPart = new ArrayList<>();

                // Regular expression to match {number:number} format
                Pattern pattern = Pattern.compile("\\{(\\d+):(\\d+)\\}");
                Matcher matcher = pattern.matcher(data);

                // Loop through all matches and separate the data
                while (matcher.find()) {
                    // Add the first part (before the colon) to firstPart list
                    firstPart.add(matcher.group(1));
                    // Add the second part (after the colon) to secondPart list
                    secondPart.add(matcher.group(2));
                }

                clear.clc(); // Clear the console

                printName(UserName);
                System.out.println("--------------------------------------------------------------------");
                System.out.printf("%-5s%-15s%-5s%-10s%n", "No.", "Prices", "", "Ratings"); // Header with index
                System.out.println("--------------------------------------------------------------------");

                int size = firstPart.size();
                for (int i = 0; i < size; i++) {
                    // Print index (i+1), prices, and ratings
                    System.out.printf("%-5d%-15s%-5s%-10s%n", i + 1, firstPart.get(i), ":", secondPart.get(i));
                }

                System.out.println("--------------------------------------------------------------------");
                System.out.print("\nPlease Choose a Category to Add to Cart: ");
                
                // You can add logic to handle user's choice for adding to the cart here.
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the path: " + PathName);
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
