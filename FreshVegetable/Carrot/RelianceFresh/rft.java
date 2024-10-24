package FreshVegetable.Carrot.RelianceFresh;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class rft {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "RelianceCarrot:90:" + quantity;
                case 2 -> productInfo = "RelianceCarrot:55:" + quantity;
                case 3 -> productInfo = "RelianceCarrot:80:" + quantity;
                case 4 -> productInfo = "RelianceCarrot:50:" + quantity;
                case 5 -> productInfo = "RelianceCarrot:85:" + quantity;
                case 6 -> productInfo = "RelianceCarrot:70:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
