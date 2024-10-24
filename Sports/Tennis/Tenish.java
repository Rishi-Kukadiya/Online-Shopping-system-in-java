package Sports.Tennis;

import Listing.list;
import Sports.Tennis.TennisBag.TennisBag;
import Sports.Tennis.TennisBalls.tennisbal;
import Sports.Tennis.TennisRacket.TenishRcaket;
import Sports.Tennis.TennisShoes.tenishShooes;
import java.util.Scanner;

public class Tenish {
    public static void tn(String UserName, Scanner sc) {
        boolean exists = false;
        while (!exists) {
            list.sp(UserName, "Data\\Sports\\Tennis\\Tennis.txt",
                    "================ Shop top-tier tennis gear now! ====================");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the tenishrocket
                    TenishRcaket.racket(UserName, sc);
                }
                case 2 -> {
                    // Data For Tenissball
                    tennisbal.ball(UserName, sc);
                }
                case 3 -> {
                    // Data for the tenishshooes
                    tenishShooes.shoo(UserName, sc);
                }
                case 4 -> {
                    // Data for the TennisBAG
                    TennisBag.bag(UserName, sc);
                }
                case 5 -> {
                    exists = true;
                }
                
            }
        }
    }
}
