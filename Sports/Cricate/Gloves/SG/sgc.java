package Sports.Cricate.Gloves.SG;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class sgc {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CricketGlovesSG:2200:" + quantity;
                case 2 -> productInfo = "CricketGlovesSG:1600:" + quantity;
                case 3 -> productInfo = "CricketGlovesSG:2000:" + quantity;
                case 4 -> productInfo = "CricketGlovesSG:1300:" + quantity;
                case 5 -> productInfo = "CricketGlovesSG:2100:" + quantity;
                case 6 -> productInfo = "CricketGlovesSG:2300:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
