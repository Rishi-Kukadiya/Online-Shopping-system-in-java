package DryFruits.Walnuts.UrbanPlatter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class urbanpaltw {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "UrbanPlattleWalnuts:1650:" + quantity;
                case 2 -> productInfo = "UrbanPlattleWalnuts:1100:" + quantity;
                case 3 -> productInfo = "UrbanPlattleWalnuts:1300:" + quantity;
                case 4 -> productInfo = "UrbanPlattleWalnuts:900:" + quantity;
                case 5 -> productInfo = "UrbanPlattleWalnuts:1400:" + quantity;
                case 6 -> productInfo = "UrbanPlattleWalnuts:1700:" + quantity;
                default -> productInfo = "UrbanPlattleWalnuts:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
