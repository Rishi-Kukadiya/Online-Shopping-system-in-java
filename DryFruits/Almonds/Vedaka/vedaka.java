package DryFruits.Almonds.Vedaka;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class vedaka {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "VedakaAlmonds:1250:" + quantity;
                case 2 -> productInfo = "VedakaAlmonds:830:" + quantity;
                case 3 -> productInfo = "VedakaAlmonds:1030:" + quantity;
                case 4 -> productInfo = "VedakaAlmonds:620:" + quantity;
                case 5 -> productInfo = "VedakaAlmonds:1130:" + quantity;
                case 6 -> productInfo = "VedakaAlmonds:1320:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
