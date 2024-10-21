package Sports.Football.ShinGuards;

import Listing.list;
import java.util.Scanner;
public class Shingurd {
    public static void shin(String UserName){
        list.sp(UserName, "Data\\Sports\\Football\\ShinGuards\\ShinGuards.txt", "========== Shop now! Elevate Cricate Bat with new gear! ==============");
        try (Scanner sc = new Scanner(System.in)) {
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Nike
                }
                case 2 -> {
                    //Data for the Addidas
                }
                case 3->{
                    //Data for the Puma
                }
                case 4->{
                    //Data for the Nivia
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
