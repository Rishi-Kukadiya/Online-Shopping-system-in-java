package Sports.Cricate.Helmet.Kookaburra;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class kkbh {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "CricketHelmetKookaburra:4000:" + quantity;
                case 2 -> productInfo = "CricketHelmetKookaburra:2500:" + quantity;
                case 3 -> productInfo = "CricketHelmetKookaburra:3500:" + quantity;
                case 4 -> productInfo = "CricketHelmetKookaburra:1800:" + quantity;
                case 5 -> productInfo = "CricketHelmetKookaburra:3700:" + quantity;
                case 6 -> productInfo = "CricketHelmetKookaburra:4200:" + quantity;
                default -> productInfo = "CricketHelmetKookaburra:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
