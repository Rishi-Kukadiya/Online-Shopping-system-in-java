package DryFruits.Raisins.UrbanPlatter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class upr {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "UrbanPlattleRaisins:700:" + quantity;
                case 2 -> productInfo = "UrbanPlattleRaisins:450:" + quantity;
                case 3 -> productInfo = "UrbanPlattleRaisins:550:" + quantity;
                case 4 -> productInfo = "UrbanPlattleRaisins:350:" + quantity;
                case 5 -> productInfo = "UrbanPlattleRaisins:600:" + quantity;
                case 6 -> productInfo = "UrbanPlattleRaisins:720:" + quantity;
                default -> productInfo = "UrbanPlattleRaisins:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
