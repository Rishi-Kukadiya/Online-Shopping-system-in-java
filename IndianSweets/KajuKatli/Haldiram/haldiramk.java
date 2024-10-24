package IndianSweets.KajuKatli.Haldiram;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class haldiramk {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "haldiramKajuKatli:1000:" + quantity;
                case 2 -> productInfo = "haldiramKajuKatli:750:" + quantity;
                case 3 -> productInfo = "haldiramKajuKatli:900:" + quantity;
                case 4 -> productInfo = "haldiramKajuKatli:600:" + quantity;
                case 5 -> productInfo = "haldiramKajuKatli:850:" + quantity;
                case 6 -> productInfo = "haldiramKajuKatli:950:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
