package IndianSweets.KajuKatli.Bikaji;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class bikajik {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "bikajiKajuKatli:980:" + quantity;
                case 2 -> productInfo = "bikajiKajuKatli:730:" + quantity;
                case 3 -> productInfo = "bikajiKajuKatli:880:" + quantity;
                case 4 -> productInfo = "bikajiKajuKatli:580:" + quantity;
                case 5 -> productInfo = "bikajiKajuKatli:830:" + quantity;
                case 6 -> productInfo = "bikajiKajuKatli:930:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }












    
}
