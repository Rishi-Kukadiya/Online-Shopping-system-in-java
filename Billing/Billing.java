package Billing;

import java.io.File;
import java.util.Scanner;

public class Billing {

    // Print welcome message with the user's name
    public static void printName(String name) {
        System.out.println("====================================================================");
        System.out.println("                   " + "Welcome " + name + " to SwiftShop          ");
        System.out.println("====================================================================");
        System.out.println("====================================================================");
        System.out.println("                    SwiftShop Bill                            ");
        System.out.println("====================================================================");
    }

    // Calculate the final bill including taxes and display the bill
    @SuppressWarnings({"UseSpecificCatch", "UnnecessaryContinue"})
    public static void printBill(String userName) {
        printName(userName);
        String path = "Billing\\addtocart.txt";
        double total = 0;
        final double GST_PERCENTAGE = 18.0;  // Assuming 18% GST
        final double OTHER_TAXES = 5.0;      // Assuming 5% other taxes

        try (Scanner sc = new Scanner(new File(path))) {
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("Your cart is empty");
                return;
            }

            // Print bill headers
            System.out.printf("%-25s %-10s %-10s %-10s%n", "Product Name", "Price", "Quantity", "Total");
            System.out.println("--------------------------------------------------------------------");

            while (sc.hasNextLine()) {
                // Read each line from the file
                String line = sc.nextLine().trim();
                
                // Check if the line contains data in the expected format
                if (line.isEmpty()) {
                    continue;  // Skip empty lines
                }

                String[] data = line.split(":");

                // Ensure that the line has exactly three parts (product name, price, and quantity)
                if (data.length != 3) {
                    System.out.println("Invalid data format for line: " + line);
                    continue;  // Skip the line if it doesn't match the expected format
                }

                try {
                    String productName = data[0];
                    double price = Double.parseDouble(data[1]);
                    int quantity = Integer.parseInt(data[2]);
                    double totalForItem = price * quantity;

                    // Print each product's details in the bill
                    System.out.printf("%-25s %-10.2f %-10d %-10.2f%n", productName, price, quantity, totalForItem);

                    // Add the item's total to the overall total
                    total += totalForItem;
                } catch (NumberFormatException e) {
                    System.out.println("Error parsing price or quantity for line: " + line);
                    continue;  // Skip the line if there is a number format issue
                }
            }

            // Calculate GST and other taxes
            double gstAmount = (total * GST_PERCENTAGE) / 100;
            double otherTaxesAmount = (total * OTHER_TAXES) / 100;
            double finalAmount = total + gstAmount + otherTaxesAmount;

            // Print tax details
            System.out.println("--------------------------------------------------------------------");
            System.out.printf("%-46s %-10.2f%n", "Subtotal", total);
            System.out.printf("%-46s %-10.2f%n", "GST (18%)", gstAmount);
            System.out.printf("%-46s %-10.2f%n", "Other Taxes (5%)", otherTaxesAmount);
            System.out.println("--------------------------------------------------------------------");

            // Print the final amount to be paid
            System.out.printf("%-46s %-10.2f%n", "Total Amount", finalAmount);
            System.out.println("====================================================================");

        } catch (Exception e) {
            System.out.println("Error occurred while handling the billing: " + e.getMessage());
        }
    }
}
