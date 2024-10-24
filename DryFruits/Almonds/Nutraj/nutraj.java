package DryFruits.Almonds.Nutraj;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class nutraj {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "NutrajAlmonds:1200:" + quantity;
                case 2 -> productInfo = "NutrajAlmonds:800:" + quantity;
                case 3 -> productInfo = "NutrajAlmonds:1000:" + quantity;
                case 4 -> productInfo = "NutrajAlmonds:600:" + quantity;
                case 5 -> productInfo = "NutrajAlmonds:1100:" + quantity;
                case 6 -> productInfo = "NutrajAlmonds:1300:" + quantity;
                default -> productInfo = "NutrajAlmonds:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
