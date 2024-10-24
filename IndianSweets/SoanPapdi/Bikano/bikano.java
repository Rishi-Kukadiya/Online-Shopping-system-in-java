package IndianSweets.SoanPapdi.Bikano;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class bikano {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "bikanoSoanPapdi:260:" + quantity;
                case 2 -> productInfo = "bikanoSoanPapdi:170:" + quantity;
                case 3 -> productInfo = "bikanoSoanPapdi:220:" + quantity;
                case 4 -> productInfo = "bikanoSoanPapdi:130:" + quantity;
                case 5 -> productInfo = "bikanoSoanPapdi:200:" + quantity;
                case 6 -> productInfo = "bikanoSoanPapdi:240:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
