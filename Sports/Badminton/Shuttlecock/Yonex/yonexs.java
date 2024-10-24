package Sports.Badminton.Shuttlecock.Yonex;
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
                case 1 -> productInfo = "badmintonShutterCockYonex:500:" + quantity;
                case 2 -> productInfo = "badmintonShutterCockYonex:400:" + quantity;
                case 3 -> productInfo = "badmintonShutterCockYonex:450:" + quantity;
                case 4 -> productInfo = "badmintonShutterCockYonex:300:" + quantity;
                case 5 -> productInfo = "badmintonShutterCockYonex:470:" + quantity;
                case 6 -> productInfo = "badmintonShutterCockYonex:550:" + quantity;
                default ->  productInfo = "badmintonShutterCockYonex:0:" + 0;
            }

            writer.write(productInfo);
            writer.newLine(); // Add a newline after each entry

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
} 
}
