package IndianSweets.Rasgulla.kcdas;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class kcdas {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "kcdasRasgulla:350:" + quantity;
                case 2 -> productInfo = "kcdasRasgulla:250:" + quantity;
                case 3 -> productInfo = "kcdasRasgulla:300:" + quantity;
                case 4 -> productInfo = "kcdasRasgulla:200:" + quantity;
                case 5 -> productInfo = "kcdasRasgulla:280:" + quantity;
                case 6 -> productInfo = "kcdasRasgulla:320:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
