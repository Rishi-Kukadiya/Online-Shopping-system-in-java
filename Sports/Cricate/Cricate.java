package Sports.Cricate;
import Listing.list;
import Sports.Cricate.Ball.Ball;
import Sports.Cricate.Bat.Bat;
import Sports.Cricate.Gloves.Gv;
import Sports.Cricate.Helmet.Helmet;
import java.util.Scanner;
public class Cricate {
    public static void cr(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits) {
        list.sp(UserName, "Data\\Sports\\cricket\\cricket.txt", "========== Shop now! Elevate your Cricket with new gear! ===========");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Bat
                    Bat.bt(UserName,sc);
                }
                case 2 -> {
                    //Data for the Ball
                    Ball.ball(UserName,sc);
                }
                case 3->{
                    //Data for the Gloves
                    Gv.golf(UserName,sc);
                }
                case 4->{
                    //Data for the Helmet
                    Helmet.hem(UserName,sc);
                }
                case 5->{
                    exits = true;
                }
            }
        }
    }
}
