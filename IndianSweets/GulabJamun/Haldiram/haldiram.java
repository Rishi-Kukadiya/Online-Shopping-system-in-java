package IndianSweets.GulabJamun.Haldiram;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class haldiram {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "bikanervalaGulabJamun:350:" + quantity;
                case 2 -> productInfo = "bikanervalaGulabJamun:250:" + quantity;
                case 3 -> productInfo = "bikanervalaGulabJamun:300:" + quantity;
                case 4 -> productInfo = "bikanervalaGulabJamun:200:" + quantity;
                case 5 -> productInfo = "bikanervalaGulabJamun:280:" + quantity;
                case 6 -> productInfo = "bikanervalaGulabJamun:320:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
