package FreshVegetable.Carrot.FreshToHome;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class fth {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "FreshToHomeCarrot:110:" + quantity;
                case 2 -> productInfo = "FreshToHomeCarrot:70:" + quantity;
                case 3 -> productInfo = "FreshToHomeCarrot:90:" + quantity;
                case 4 -> productInfo = "FreshToHomeCarrot:60:" + quantity;
                case 5 -> productInfo = "FreshToHomeCarrot:100:" + quantity;
                case 6 -> productInfo = "FreshToHomeCarrot:80:" + quantity;
                default -> productInfo = "FreshToHomeCarrot:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
