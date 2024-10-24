package DryFruits.Raisins.Vedaka;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class vedakar {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "vedakaRaisins:620:" + quantity;
                case 2 -> productInfo = "vedakaRaisins:410:" + quantity;
                case 3 -> productInfo = "vedakaRaisins:510:" + quantity;
                case 4 -> productInfo = "vedakaRaisins:320:" + quantity;
                case 5 -> productInfo = "vedakaRaisins:560:" + quantity;
                case 6 -> productInfo = "vedakaRaisins:660:" + quantity;
                default -> productInfo = "vedakaRaisins:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
