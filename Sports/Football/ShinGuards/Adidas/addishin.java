package Sports.Football.ShinGuards.Adidas;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class addishin {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "AdidasShinGuards:1500:" + quantity;
                case 2 -> productInfo = "AdidasShinGuards:1000:" + quantity;
                case 3 -> productInfo = "AdidasShinGuards:1300:" + quantity;
                case 4 -> productInfo = "AdidasShinGuards:800:" + quantity;
                case 5 -> productInfo = "AdidasShinGuards:1400:" + quantity;
                case 6 -> productInfo = "AdidasShinGuards:1600:" + quantity;
                default -> productInfo = "AdidasShinGuards:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
