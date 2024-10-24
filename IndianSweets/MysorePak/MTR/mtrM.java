package IndianSweets.MysorePak.MTR;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class mtrM {
      public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "AdyaanabhavMysorePak:500:" + quantity;
                case 2 -> productInfo = "AdyaanabhavMysorePak:350:" + quantity;
                case 3 -> productInfo = "AdyaanabhavMysorePak:450:" + quantity;
                case 4 -> productInfo = "AdyaanabhavMysorePak:300:" + quantity;
                case 5 -> productInfo = "AdyaanabhavMysorePak:400:" + quantity;
                case 6 -> productInfo = "AdyaanabhavMysorePak:480:" + quantity;
                default -> productInfo = "AdyaanabhavMysorePak:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
