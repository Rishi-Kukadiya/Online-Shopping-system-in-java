package Sports.Tennis.TennisBag.Head;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class headbag {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TennisBagHead:4500:" + quantity;
                case 2 -> productInfo = "TennisBagHead:3200:" + quantity;
                case 3 -> productInfo = "TennisBagHead:4000:" + quantity;
                case 4 -> productInfo = "TennisBagHead:2200:" + quantity;
                case 5 -> productInfo = "TennisBagHead:4300:" + quantity;
                case 6 -> productInfo = "TennisBagHead:4800:" + quantity;
                default -> productInfo = "TennisBagHead:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
