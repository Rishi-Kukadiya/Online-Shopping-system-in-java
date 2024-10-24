package Snacks.Popcorn.ActII;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Actll {
     public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "ActllPopcorn:40:" + quantity;
                case 2 -> productInfo = "ActllPopcorn:30:" + quantity;
                case 3 -> productInfo = "ActllPopcorn:50:" + quantity;
                case 4 -> productInfo = "ActllPopcorn:45:" + quantity;
                case 5 -> productInfo = "ActllPopcorn:60:" + quantity;
                case 6 -> productInfo = "ActllPopcorn:55:" + quantity;
                default -> productInfo = "ActllPopcorn:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
