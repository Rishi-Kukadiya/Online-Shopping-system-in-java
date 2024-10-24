package Sports.Football;

import Listing.list;
import Sports.Football.Football.football;
import Sports.Football.FootballBoots.FootballBoots;
import Sports.Football.GoalkeeperGloves.Golves;
import Sports.Football.ShinGuards.Shingurd;
import java.util.Scanner;

public class FootBall {
    public static void fb(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {
            list.sp(UserName, "Data\\Sports\\Football\\Football.txt",
                    "========== Shop now! Elevate your FootBall with new gear! ==========");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the FootBalls
                    football.ftb(UserName, sc);
                }
                case 2 -> {
                    // Data For footballsboots
                    FootballBoots.ftbs(UserName, sc);
                }
                case 3 -> {
                    // Data for the GoalkeeperGloves
                    Golves.golve(UserName, sc);
                }
                case 4 -> {
                    // Data for the ShinGuards
                    Shingurd.shin(UserName, sc);
                }
                case 5 -> {
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
