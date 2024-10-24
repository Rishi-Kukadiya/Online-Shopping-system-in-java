package Sports.Badminton.BadmintonShoes.Yonex;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class yonexs {
    public static void Product(byte product, int quantity) {
        String pathName = "Billing/addtocart.txt";
        File file = new File(pathName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String productInfo;

            switch (product) {
                case 1 -> productInfo = "badmintonShoesYonex:5000:" + quantity;
                case 2 -> productInfo = "badmintonShoesYonex:3500:" + quantity;
                case 3 -> productInfo = "badmintonShoesYonex:4000:" + quantity;
                case 4 -> productInfo = "badmintonShoesYonex:3000:" + quantity;
                case 5 -> productInfo = "badmintonShoesYonex:4200:" + quantity;
                case 6 -> productInfo = "badmintonShoesYonex:5200:" + quantity;
                default -> productInfo = "badmintonShoesYonex:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
}    
}
