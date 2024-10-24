package Snacks;

import Listing.list;
import Snacks.Biscuits.Biscuits;
import Snacks.Namkeen.Namkeen;
import Snacks.Popcorn.Popcorn;
import Snacks.PotatoChips.PotatoChips;
import java.util.Scanner;

public class Snacks {
    public static void sn(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {

            list.sp(UserName, "Data\\Snacks\\Snacks.txt",
                    "============= Satisfy cravings with delicious snacks! ==============");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data potato chips
                    PotatoChips.pot(UserName, sc);
                }
                case 2 -> {
                    // Data Namkeen
                    Namkeen.nam(UserName, sc);
                }
                case 3 -> {
                    Biscuits.bis(UserName, sc);
                }
                case 4 -> {
                    // Data Popcorn
                    Popcorn.pop(UserName, sc);
                }
                case 5->{
                    exits = true ;
                }
            }
        }
    }
}
