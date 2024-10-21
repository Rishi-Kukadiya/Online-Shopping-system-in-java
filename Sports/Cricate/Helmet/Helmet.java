package Sports.Cricate.Helmet;
import Listing.list;
import java.util.Scanner;

public class Helmet {
    public static void hem(String UserName){
        list.sp(UserName, "Data\\Sports\\cricket\\Helmet\\Helmet.txt", "========== Shop now! Elevate Cricate Bat with new gear! ==============");
        try (Scanner sc = new Scanner(System.in)) {
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the SS
                }
                case 2 -> {
                    //Data for the SG
                }
                case 3->{
                    //Data for the KOOKABOORA
                }
                case 4->{
                    //Data for the MRF
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }

    }
}
