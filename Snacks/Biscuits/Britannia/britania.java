package Snacks.Biscuits.Britannia;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class britania {
     public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "BritaniaBiscuits:30:" + quantity;
                case 2 -> productInfo = "BritaniaBiscuits:20:" + quantity;
                case 3 -> productInfo = "BritaniaBiscuits:40:" + quantity;
                case 4 -> productInfo = "BritaniaBiscuits:35:" + quantity;
                case 5 -> productInfo = "BritaniaBiscuits:50:" + quantity;
                case 6 -> productInfo = "BritaniaBiscuits:45:" + quantity;
                default -> productInfo = "BritaniaBiscuits:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
