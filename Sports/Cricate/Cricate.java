package Sports.Cricate;
import Listing.list;
import Sports.Cricate.Bat.Bat;
import java.util.Scanner;
public class Cricate {
    public static void cr(String UserName){
        list.sp(UserName, "Data\\Sports\\cricket\\cricket.txt", "========== Shop now! Elevate your Cricate with new gear! ==============");
        try (Scanner sc = new Scanner(System.in)) {
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Bat
                    Bat.bt(UserName);
                }
                case 2 -> {

                }
                case 3->{

                }
                case 4->{

                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
