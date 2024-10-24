package Sports.Tennis.TennisBag.Wilson;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class wilsonbag {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TennisBagWilson:4000:" + quantity;
                case 2 -> productInfo = "TennisBagWilson:3000:" + quantity;
                case 3 -> productInfo = "TennisBagWilson:3500:" + quantity;
                case 4 -> productInfo = "TennisBagWilson:2000:" + quantity;
                case 5 -> productInfo = "TennisBagWilson:3700:" + quantity;
                case 6 -> productInfo = "TennisBagWilson:4200:" + quantity;
                default -> productInfo = "TennisBagWilson:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
