package DryFruits.Pistachios.Nutraj;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Nutrajp {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "NutrajPistachios:1400:" + quantity;
                case 2 -> productInfo = "NutrajPistachios:900:" + quantity;
                case 3 -> productInfo = "NutrajPistachios:1100:" + quantity;
                case 4 -> productInfo = "NutrajPistachios:700:" + quantity;
                case 5 -> productInfo = "NutrajPistachios:1200:" + quantity;
                case 6 -> productInfo = "NutrajPistachios:1350:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
