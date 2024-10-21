package Sports;
import Listing.list;
import Sports.Badminton.Badminton;
import Sports.Cricate.Cricate;
import Sports.Football.FootBall;
import Sports.Tennis.Tenish;
import java.util.Scanner;

public class  Sports{
    public static void sp(String UserName) {
        list.sp(UserName, "Data\\Sports\\Sports.txt", "========== Shop now! Elevate your game with new gear! ==============");
        try (Scanner sc = new Scanner(System.in)) {
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the cricate
                    Cricate.cr(UserName);
                }
                case 2 -> {
                    //Data for the Football
                    FootBall.fb(UserName);
                }
                case 3->{
                    //Data for the Badminton
                    Badminton.bm(UserName);
                }
                case 4->{
                    //Data for the Tenis
                    Tenish.tn(UserName);
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}