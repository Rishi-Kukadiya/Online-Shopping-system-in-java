package DryFruits.Almonds.UrbanPlatter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class urbanpatlat {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "UrbanPaltterAlmonds:1400:" + quantity;
                case 2 -> productInfo = "UrbanPaltterAlmonds:900:" + quantity;
                case 3 -> productInfo = "UrbanPaltterAlmonds:1100:" + quantity;
                case 4 -> productInfo = "UrbanPaltterAlmonds:700:" + quantity;
                case 5 -> productInfo = "UrbanPaltterAlmonds:1200:" + quantity;
                case 6 -> productInfo = "UrbanPaltterAlmonds:1450:" + quantity;
                default -> productInfo = "UrbanPaltterAlmonds:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
