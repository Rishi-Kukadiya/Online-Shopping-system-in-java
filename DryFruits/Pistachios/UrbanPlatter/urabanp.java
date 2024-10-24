package DryFruits.Pistachios.UrbanPlatter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class urabanp {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "UrbanplattlePistachios:1600:" + quantity;
                case 2 -> productInfo = "UrbanplattlePistachios:1000:" + quantity;
                case 3 -> productInfo = "UrbanplattlePistachios:1200:" + quantity;
                case 4 -> productInfo = "UrbanplattlePistachios:800:" + quantity;
                case 5 -> productInfo = "UrbanplattlePistachios:1300:" + quantity;
                case 6 -> productInfo = "UrbanplattlePistachios:1500:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
