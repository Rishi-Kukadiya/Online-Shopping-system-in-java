package Gifts.Perfume.HugoBoss;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class HugoBoss {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "HugoBossPerfume:7500:" + quantity;
                case 2 -> productInfo = "HugoBossPerfume:6000:" + quantity;
                case 3 -> productInfo = "HugoBossPerfume:7000:" + quantity;
                case 4 -> productInfo = "HugoBossPerfume:5000:" + quantity;
                case 5 -> productInfo = "HugoBossPerfume:7200:" + quantity;
                case 6 -> productInfo = "HugoBossPerfume:8000:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
