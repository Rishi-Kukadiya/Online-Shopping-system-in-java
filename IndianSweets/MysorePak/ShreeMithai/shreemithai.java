package IndianSweets.MysorePak.ShreeMithai;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class shreemithai {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "ShreemithaiMysorePak:540:" + quantity;
                case 2 -> productInfo = "ShreemithaiMysorePak:360:" + quantity;
                case 3 -> productInfo = "ShreemithaiMysorePak:490:" + quantity;
                case 4 -> productInfo = "ShreemithaiMysorePak:310:" + quantity;
                case 5 -> productInfo = "ShreemithaiMysorePak:440:" + quantity;
                case 6 -> productInfo = "ShreemithaiMysorePak:510:" + quantity;
                default -> productInfo = "ShreemithaiMysorePak:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
