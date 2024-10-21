package Sports.Cricate.Bat;
import Listing.list;
import java.util.Scanner;

public class Bat {
    public static void bt(String UserName){
        list.sp(UserName, "Data\\Sports\\cricket\\Bat\\Bat.txt", "========== Shop now! Elevate Cricate Bat with new gear! ==============");
        try (Scanner sc = new Scanner(System.in)) {
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the ADDIDAS
                    System.out.println("Hii , this ADDIDAS");
                }
                case 2 -> {
                    //Data for the CEAT
                }
                case 3->{
                    //Data for the GM
                }
                case 4->{
                    //Data for the Kookaburra
                }
                case 5->{
                    //Data for the MRF

                }
                case 6->{
                    //Data for the SG
                }
                case 7->{
                    //Data for the SS
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }

    }
}
