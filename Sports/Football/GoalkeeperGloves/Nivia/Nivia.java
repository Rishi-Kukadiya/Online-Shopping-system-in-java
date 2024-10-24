package Sports.Football.GoalkeeperGloves.Nivia;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Nivia {
     public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "NiviaGloves:3500:" + quantity;
                case 2 -> productInfo = "NiviaGloves:2500:" + quantity;
                case 3 -> productInfo = "NiviaGloves:3000:" + quantity;
                case 4 -> productInfo = "NiviaGloves:800:" + quantity;
                case 5 -> productInfo = "NiviaGloves:1300:" + quantity;
                case 6 -> productInfo = "NiviaGloves:1600:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
