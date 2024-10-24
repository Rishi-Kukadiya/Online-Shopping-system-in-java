package DryFruits.Pistachios.Vedaka;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class vedakap {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "VedakaPistachios:1450:" + quantity;
                case 2 -> productInfo = "VedakaPistachios:930:" + quantity;
                case 3 -> productInfo = "VedakaPistachios:1130:" + quantity;
                case 4 -> productInfo = "VedakaPistachios:720:" + quantity;
                case 5 -> productInfo = "VedakaPistachios:1230:" + quantity;
                case 6 -> productInfo = "VedakaPistachios:1400:" + quantity;
                default -> productInfo = "VedakaPistachios:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
