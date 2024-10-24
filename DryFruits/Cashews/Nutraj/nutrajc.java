package DryFruits.Cashews.Nutraj;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class nutrajc {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "NutrajCashews:1000:" + quantity;
                case 2 -> productInfo = "NutrajCashews:700:" + quantity;
                case 3 -> productInfo = "NutrajCashews:850:" + quantity;
                case 4 -> productInfo = "NutrajCashews:550:" + quantity;
                case 5 -> productInfo = "NutrajCashews:900:" + quantity;
                case 6 -> productInfo = "NutrajCashews:1100:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
