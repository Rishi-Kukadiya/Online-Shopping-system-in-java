package DryFruits.Raisins.Happilo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class happilor {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "happiloRaisins:650:" + quantity;
                case 2 -> productInfo = "happiloRaisins:430:" + quantity;
                case 3 -> productInfo = "happiloRaisins:530:" + quantity;
                case 4 -> productInfo = "happiloRaisins:330:" + quantity;
                case 5 -> productInfo = "happiloRaisins:580:" + quantity;
                case 6 -> productInfo = "happiloRaisins:680:" + quantity;
                default -> productInfo = "happiloRaisins:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
