package Sports.Tennis.TennisBalls.Yonex;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class yonexball {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TennisBallYonex:820:" + quantity;
                case 2 -> productInfo = "TennisBallYonex:610:" + quantity;
                case 3 -> productInfo = "TennisBallYonex:730:" + quantity;
                case 4 -> productInfo = "TennisBallYonex:510:" + quantity;
                case 5 -> productInfo = "TennisBallYonex:780:" + quantity;
                case 6 -> productInfo = "TennisBallYonex:870:" + quantity;
                default -> productInfo = "TennisBallYonex:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
