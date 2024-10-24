package Sports.Football.GoalkeeperGloves.Adidas;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class glovekeepreglove {
     public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "AdidasGloves:4000:" + quantity;
                case 2 -> productInfo = "AdidasGloves:2800:" + quantity;
                case 3 -> productInfo = "AdidasGloves:3500:" + quantity;
                case 4 -> productInfo = "AdidasGloves:2300:" + quantity;
                case 5 -> productInfo = "AdidasGloves:3700:" + quantity;
                case 6 -> productInfo = "AdidasGloves:4200:" + quantity;
                default -> productInfo = "AdidasGloves:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
