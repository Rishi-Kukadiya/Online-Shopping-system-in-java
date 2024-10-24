package Snacks.Popcorn.PopcornTime;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class popcorn {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "Popcorn:60:" + quantity;
                case 2 -> productInfo = "Popcorn:50:" + quantity;
                case 3 -> productInfo = "Popcorn:70:" + quantity;
                case 4 -> productInfo = "Popcorn:65:" + quantity;
                case 5 -> productInfo = "Popcorn:80:" + quantity;
                case 6 -> productInfo = "Popcorn:90:" + quantity;
                default -> productInfo = "Popcorn:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
