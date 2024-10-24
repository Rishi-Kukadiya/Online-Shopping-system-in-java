package Sports.Cricate.Bat.CEAT;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class ceatb {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CricketBatCEAT:1800:" + quantity;
                case 2 -> productInfo = "CricketBatCEAT:620:" + quantity;
                case 3 -> productInfo = "CricketBatCEAT:880:" + quantity;
                case 4 -> productInfo = "CricketBatCEAT:500:" + quantity;
                case 5 -> productInfo = "CricketBatCEAT:1600:" + quantity;
                case 6 -> productInfo = "CricketBatCEAT:1000:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
