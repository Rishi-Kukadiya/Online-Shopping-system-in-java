package Sports.Tennis;
import Listing.list;
import Sports.Tennis.TennisBag.TennisBag;
import Sports.Tennis.TennisBalls.tennisbal;
import Sports.Tennis.TennisRacket.TenishRcaket;
import Sports.Tennis.TennisShoes.tenishShooes;
import java.util.Scanner;
public class Tenish {
    public static void tn(String UserName){
        list.sp(UserName, "Data\\Sports\\Tennis\\Tennis.txt", "========== Shop now! Elevate your Tennis with new gear! ==============");
        try (Scanner sc = new Scanner(System.in)) {
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the tenishrocket 
                    TenishRcaket.racket(UserName);
                }
                case 2 -> {
                    //Data For Tenissball
                    tennisbal.ball(UserName);
                }
                case 3->{
                    //Data for the tenishshooes
                    tenishShooes.shoo(UserName);
                }
                case 4->{
                    //Data for the TennisBAG
                    TennisBag.bag(UserName);
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
