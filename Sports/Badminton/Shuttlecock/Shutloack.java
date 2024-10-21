package Sports.Badminton.Shuttlecock;

import Listing.list;
import java.util.Scanner;
public class Shutloack {
    public static void shutlock(String UserName){
        list.sp(UserName, "Data\\Sports\\Badminton\\Shuttlecock\\Shuttlecock.txt", "========== Shop now! Elevate Cricate Bat with new gear! ==============");
        try (Scanner sc = new Scanner(System.in)) {
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Yonex
                }
                case 2 -> {
                    //Data for the Li-Ning
                }
                case 3->{
                    //Data for the Victor
                }
                case 4->{
                    //Data for the Ashaway
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }

    }
}
