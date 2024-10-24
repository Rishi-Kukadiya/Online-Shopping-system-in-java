package FreshVegetable.Cabbage.FreshToHome;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FreshToHome {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "FreshToHomeCabbage:65:" + quantity;
                case 2 -> productInfo = "FreshToHomeCabbage:40:" + quantity;
                case 3 -> productInfo = "FreshToHomeCabbage:55:" + quantity;
                case 4 -> productInfo = "FreshToHomeCabbage:35:" + quantity;
                case 5 -> productInfo = "FreshToHomeCabbage:60:" + quantity;
                case 6 -> productInfo = "FreshToHomeCabbage:50:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
