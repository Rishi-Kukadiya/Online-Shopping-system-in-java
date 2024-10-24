package Sports.Badminton;
import Listing.list;
import Sports.Badminton.BadmintonRacket.Badmintonrackt;
import Sports.Badminton.BadmintonShoes.Badmintonshooes;
import Sports.Badminton.Grip.Grips;
import Sports.Badminton.Shuttlecock.Shutloack;
import java.util.Scanner;
public class Badminton {
    public static void bm(String UserName,Scanner sc){
        boolean exits = false;
        while (!exits) {
        list.sp(UserName, "Data\\Sports\\Badminton\\Badminton.txt", "========== Shop now! Elevate your Badminton with new gear! =========");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the BadmintonRacket
                    Badmintonrackt.badrackt(UserName,sc);
                }
                case 2 -> {
                    //Data For Shuttlecock
                    Shutloack.shutlock(UserName,sc);
                }
                case 3->{
                    //Data for the Grips 
                    Grips.grip(UserName,sc);
                }
                case 4->{
                    //Data for the BadmintonShoes
                    Badmintonshooes.shoes(UserName,sc);
                }
                case 5->{
                   exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
