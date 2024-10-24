package Sports.Football.ShinGuards.Puma;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class pumashin {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "PumaShinGuards:1200:" + quantity;
                case 2 -> productInfo = "PumaShinGuards:800:" + quantity;
                case 3 -> productInfo = "PumaShinGuards:1000:" + quantity;
                case 4 -> productInfo = "PumaShinGuards:600:" + quantity;
                case 5 -> productInfo = "PumaShinGuards:1100:" + quantity;
                case 6 -> productInfo = "PumaShinGuards:1300:" + quantity;
                default -> productInfo = "PumaShinGuards:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
