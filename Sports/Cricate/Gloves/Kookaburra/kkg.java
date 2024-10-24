package Sports.Cricate.Gloves.Kookaburra;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class kkg {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CricketGlovesKookaburra:2500:" + quantity;
                case 2 -> productInfo = "CricketGlovesKookaburra:1700:" + quantity;
                case 3 -> productInfo = "CricketGlovesKookaburra:2300:" + quantity;
                case 4 -> productInfo = "CricketGlovesKookaburra:1400:" + quantity;
                case 5 -> productInfo = "CricketGlovesKookaburra:2400:" + quantity;
                case 6 -> productInfo = "CricketGlovesKookaburra:2600:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
