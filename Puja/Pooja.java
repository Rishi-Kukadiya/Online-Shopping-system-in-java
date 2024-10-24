package Puja;

import Listing.list;
import Puja.Agarbatti.Agar;
import Puja.Diya.Diya;
import Puja.Flowers.Flower;
import Puja.Kapoor.camphor;
import Puja.Kumkum.Kuumkuum;
import java.util.Scanner;

public class Pooja {
    public static void pu(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {
            list.sp(UserName, "Data\\Puja\\Puja.txt",
                    "============ Discover curated Pooja supplies today! ================");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the Agarbatti
                    Agar.ag(UserName, sc);
                }
                case 2 -> {
                    // Data for the Diya
                    Diya.di(UserName, sc);
                }
                case 3 -> {
                    // Data for the Kumkum
                    Kuumkuum.ku(UserName, sc);
                }
                case 4 -> {
                    // Data for the Flowers
                    Flower.fl(UserName, sc);
                }
                case 5 -> {
                    // Data for the Kapoor
                    camphor.kap(UserName, sc);
                }
                case 6->{
                    exits = true ;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}