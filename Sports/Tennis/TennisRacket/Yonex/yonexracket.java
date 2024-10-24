package Sports.Tennis.TennisRacket.Yonex;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class yonexracket {
        public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TennisRacketYonex:8200:" + quantity;
                case 2 -> productInfo = "TennisRacketYonex:6100:" + quantity;
                case 3 -> productInfo = "TennisRacketYonex:7300:" + quantity;
                case 4 -> productInfo = "TennisRacketYonex:5100:" + quantity;
                case 5 -> productInfo = "TennisRacketYonex:7800:" + quantity;
                case 6 -> productInfo = "TennisRacketYonex:8800:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
