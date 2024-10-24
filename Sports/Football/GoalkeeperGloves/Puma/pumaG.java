package Sports.Football.GoalkeeperGloves.Puma;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class pumaG {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "PumaGloves:3700:" + quantity;
                case 2 -> productInfo = "PumaGloves:2600:" + quantity;
                case 3 -> productInfo = "PumaGloves:3300:" + quantity;
                case 4 -> productInfo = "PumaGloves:2100:" + quantity;
                case 5 -> productInfo = "PumaGloves:3500:" + quantity;
                case 6 -> productInfo = "PumaGloves:4000:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
