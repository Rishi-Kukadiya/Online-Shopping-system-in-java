package DryFruits.Pistachios.Happilo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class happilop {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "HappiloPistachios:1500:" + quantity;
                case 2 -> productInfo = "HappiloPistachios:950:" + quantity;
                case 3 -> productInfo = "HappiloPistachios:1150:" + quantity;
                case 4 -> productInfo = "HappiloPistachios:750:" + quantity;
                case 5 -> productInfo = "HappiloPistachios:1250:" + quantity;
                case 6 -> productInfo = "HappiloPistachios:1450:" + quantity;
                default -> productInfo = "HappiloPistachios:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
