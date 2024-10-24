package Sports.Tennis.TennisShoes.Yonex;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class yonexshoes {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "TennisShoesYonex:7200:" + quantity;
                case 2 -> productInfo = "TennisShoesYonex:5100:" + quantity;
                case 3 -> productInfo = "TennisShoesYonex:6300:" + quantity;
                case 4 -> productInfo = "TennisShoesYonex:4100:" + quantity;
                case 5 -> productInfo = "TennisShoesYonex:6800:" + quantity;
                case 6 -> productInfo = "TennisShoesYonex:7800:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}
}
