package Snacks.Popcorn.Pipo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class pipopop {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "PipoPopcorn:30:" + quantity;
                case 2 -> productInfo = "PipoPopcorn:25:" + quantity;
                case 3 -> productInfo = "PipoPopcorn:40:" + quantity;
                case 4 -> productInfo = "PipoPopcorn:35:" + quantity;
                case 5 -> productInfo = "PipoPopcorn:50:" + quantity;
                case 6 -> productInfo = "PipoPopcorn:45:" + quantity;
                default -> productInfo = "PipoPopcorn:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
