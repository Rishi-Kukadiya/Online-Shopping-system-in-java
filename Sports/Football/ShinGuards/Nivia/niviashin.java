package Sports.Football.ShinGuards.Nivia;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class niviashin {
     public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "NiviaShinGuards:500:" + quantity;
                case 2 -> productInfo = "NiviaShinGuards:400:" + quantity;
                case 3 -> productInfo = "NiviaShinGuards:450:" + quantity;
                case 4 -> productInfo = "NiviaShinGuards:300:" + quantity;
                case 5 -> productInfo = "NiviaShinGuards:470:" + quantity;
                case 6 -> productInfo = "NiviaShinGuards:550:" + quantity;
                default -> productInfo = "NiviaShinGuards:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
