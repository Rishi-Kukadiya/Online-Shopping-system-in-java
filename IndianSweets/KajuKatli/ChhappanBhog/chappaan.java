package IndianSweets.KajuKatli.ChhappanBhog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class chappaan {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "chappanBhogKajuKatli:1200:" + quantity;
                case 2 -> productInfo = "chappanBhogKajuKatli:850:" + quantity;
                case 3 -> productInfo = "chappanBhogKajuKatli:1000:" + quantity;
                case 4 -> productInfo = "chappanBhogKajuKatli:700:" + quantity;
                case 5 -> productInfo = "chappanBhogKajuKatli:900:" + quantity;
                case 6 -> productInfo = "chappanBhogKajuKatli:1100:" + quantity;
                default -> productInfo = "chappanBhogKajuKatli:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
