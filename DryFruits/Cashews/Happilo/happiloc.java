package DryFruits.Cashews.Happilo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class happiloc {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "HeppiloCashews:1050:" + quantity;
                case 2 -> productInfo = "HeppiloCashews:750:" + quantity;
                case 3 -> productInfo = "HeppiloCashews:900:" + quantity;
                case 4 -> productInfo = "HeppiloCashews:600:" + quantity;
                case 5 -> productInfo = "HeppiloCashews:950:" + quantity;
                case 6 -> productInfo = "HeppiloCashews:1150:" + quantity;
                default -> productInfo = "HeppiloCashews:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
