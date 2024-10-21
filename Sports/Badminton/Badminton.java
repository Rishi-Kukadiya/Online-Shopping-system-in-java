package Sports.Badminton;
import Listing.list;
import Sports.Badminton.BadmintonRacket.Badmintonrackt;
import Sports.Badminton.BadmintonShoes.Badmintonshooes;
import Sports.Badminton.Grip.Grips;
import Sports.Badminton.Shuttlecock.Shutloack;
import java.util.Scanner;
public class Badminton {
    public static void bm(String UserName){
        list.sp(UserName, "Data\\Sports\\Badminton\\Badminton.txt", "========== Shop now! Elevate your Badminton with new gear! ==============");
        try (Scanner sc = new Scanner(System.in)) {
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the BadmintonRacket
                    Badmintonrackt.badrackt(UserName);
                }
                case 2 -> {
                    //Data For Shuttlecock
                    Shutloack.shutlock(UserName);
                }
                case 3->{
                    //Data for the Grips 
                    Grips.grip(UserName);
                }
                case 4->{
                    //Data for the BadmintonShoes
                    Badmintonshooes.shoes(UserName);
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
