package  Sports.Tennis.TennisBag.Yonex;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class yonexbag {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TennisBagYonex:4200:" + quantity;
                case 2 -> productInfo = "TennisBagYonex:3000:" + quantity;
                case 3 -> productInfo = "TennisBagYonex:3700:" + quantity;
                case 4 -> productInfo = "TennisBagYonex:2000:" + quantity;
                case 5 -> productInfo = "TennisBagYonex:4000:" + quantity;
                case 6 -> productInfo = "TennisBagYonex:4600:" + quantity;
                default -> productInfo = "TennisBagYonex:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
