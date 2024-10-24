package DryFruits.Walnuts.Vedaka;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Vedakaw {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "VedakaWalnuts:1520:" + quantity;
                case 2 -> productInfo = "VedakaWalnuts:1020:" + quantity;
                case 3 -> productInfo = "VedakaWalnuts:1220:" + quantity;
                case 4 -> productInfo = "VedakaWalnuts:820:" + quantity;
                case 5 -> productInfo = "VedakaWalnuts:1320:" + quantity;
                case 6 -> productInfo = "VedakaWalnuts:1620:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
