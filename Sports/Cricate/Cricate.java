package Sports.Cricate;
import Listing.list;
import java.util.Scanner;
public class Cricate {
    public static void cr(String UserName){
        list.sp(UserName, "Data\\Sports\\Sports.txt", "========== Shop now! Elevate your Cricate with new gear! ==============");
        try (Scanner sc = new Scanner(System.in)) {
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Bat
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
