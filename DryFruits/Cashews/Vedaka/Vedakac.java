package DryFruits.Cashews.Vedaka;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Vedakac {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "VedakaCashews:1020:" + quantity;
                case 2 -> productInfo = "VedakaCashews:720:" + quantity;
                case 3 -> productInfo = "VedakaCashews:880:" + quantity;
                case 4 -> productInfo = "VedakaCashews:580:" + quantity;
                case 5 -> productInfo = "VedakaCashews:930:" + quantity;
                case 6 -> productInfo = "VedakaCashews:1120:" + quantity;
                default ->  productInfo = "VedakaCashews:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
