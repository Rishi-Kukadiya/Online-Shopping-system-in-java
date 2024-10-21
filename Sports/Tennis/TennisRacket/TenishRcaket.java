package Sports.Tennis.TennisRacket;

import Listing.list;
import java.util.Scanner;
public class TenishRcaket {
    public static void racket(String UserName){
        list.sp(UserName, "Data\\Sports\\Tennis\\TennisRacket\\TennisRacket.txt", "========== Shop now! Elevate Cricate Bat with new gear! ==============");
        try (Scanner sc = new Scanner(System.in)) {
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Wilson
                }
                case 2 -> {
                    //Data for the Head
                }
                case 3->{
                    //Data for the Babplot
                }
                case 4->{
                    //Data for the Yonex
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }

    }
}
