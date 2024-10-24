package IndianSweets.MysorePak.SriKrishnaSweets;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class shrikishna {
     public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "ShrikishnaMysorePak:550:" + quantity;
                case 2 -> productInfo = "ShrikishnaMysorePak:380:" + quantity;
                case 3 -> productInfo = "ShrikishnaMysorePak:500:" + quantity;
                case 4 -> productInfo = "ShrikishnaMysorePak:330:" + quantity;
                case 5 -> productInfo = "ShrikishnaMysorePak:450:" + quantity;
                case 6 -> productInfo = "ShrikishnaMysorePak:520:" + quantity;
                default -> throw new IllegalArgumentException("Invalid choice");
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
