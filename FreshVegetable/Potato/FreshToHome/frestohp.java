package FreshVegetable.Potato.FreshToHome;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class frestohp {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "FreshToHomePotato:75:" + quantity;
                case 2 -> productInfo = "FreshToHomePotato:45:" + quantity;
                case 3 -> productInfo = "FreshToHomePotato:60:" + quantity;
                case 4 -> productInfo = "FreshToHomePotato:35:" + quantity;
                case 5 -> productInfo = "FreshToHomePotato:70:" + quantity;
                case 6 -> productInfo = "FreshToHomePotato:55:" + quantity;
                default -> productInfo = "FreshToHomePotato:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
