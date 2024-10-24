package DryFruits.Walnuts.Happilo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class happilow {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "happiloWalnuts:1550:" + quantity;
                case 2 -> productInfo = "happiloWalnuts:1050:" + quantity;
                case 3 -> productInfo = "happiloWalnuts:1250:" + quantity;
                case 4 -> productInfo = "happiloWalnuts:850:" + quantity;
                case 5 -> productInfo = "happiloWalnuts:1350:" + quantity;
                case 6 -> productInfo = "happiloWalnuts:1650:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
