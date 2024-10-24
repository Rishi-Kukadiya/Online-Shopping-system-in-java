package Sports.Badminton.Grip.Yonex;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class yonexg {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "badmintonGripYonex:100:" + quantity;
                case 2 -> productInfo = "badmintonGripYonex:80:" + quantity;
                case 3 -> productInfo = "badmintonGripYonex:90:" + quantity;
                case 4 -> productInfo = "badmintonGripYonex:70:" + quantity;
                case 5 -> productInfo = "badmintonGripYonex:95:" + quantity;
                case 6 -> productInfo = "badmintonGripYonex:110:" + quantity;
                default -> productInfo = "badmintonGripYonex:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
