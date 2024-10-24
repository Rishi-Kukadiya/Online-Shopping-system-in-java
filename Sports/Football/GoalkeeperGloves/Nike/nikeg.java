package Sports.Football.GoalkeeperGloves.Nike;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class nikeg {
     public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "NikeGloves:1500:" + quantity;
                case 2 -> productInfo = "NikeGloves:1000:" + quantity;
                case 3 -> productInfo = "NikeGloves:1200:" + quantity;
                case 4 -> productInfo = "NikeGloves:2000:" + quantity;
                case 5 -> productInfo = "NikeGloves:3200:" + quantity;
                case 6 -> productInfo = "NikeGloves:3700:" + quantity;
                default ->  productInfo = "NikeGloves:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
