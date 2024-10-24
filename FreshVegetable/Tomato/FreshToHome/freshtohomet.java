package FreshVegetable.Tomato.FreshToHome;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class freshtohomet {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "FreshToHomeTomato:110:" + quantity;
                case 2 -> productInfo = "FreshToHomeTomato:75:" + quantity;
                case 3 -> productInfo = "FreshToHomeTomato:95:" + quantity;
                case 4 -> productInfo = "FreshToHomeTomato:55:" + quantity;
                case 5 -> productInfo = "FreshToHomeTomato:85:" + quantity;
                case 6 -> productInfo = "FreshToHomeTomato:105:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
