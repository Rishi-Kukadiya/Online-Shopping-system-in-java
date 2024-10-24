package IndianSweets;

import IndianSweets.GulabJamun.GulabJamun;
import IndianSweets.KajuKatli.JKajukatri;
import IndianSweets.MysorePak.Mysourpak;
import IndianSweets.Rasgulla.Rasgulla;
import IndianSweets.SoanPapdi.sonpapdi;
import Listing.list;
import java.util.Scanner;

public class IndianSweets {
    public static void Ins(String UserName, Scanner sc) {
        boolean exits = false;
        while (!exits) {
            list.sp(UserName, "Data\\IndianSweets\\IndianSweets.txt",
                    "============ Savor handcrafted Indian sweets today! ================");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the GulabJamnun
                    GulabJamun.gulab(UserName, sc);
                }
                case 2 -> {
                    // Data for the Rasgulla
                    Rasgulla.ras(UserName, sc);
                }
                case 3 -> {
                    // Data for the Kajukatri
                    JKajukatri.kaju(UserName, sc);
                }
                case 4 -> {
                    // Data for the Mysorepak
                    Mysourpak.pack(UserName, sc);
                }
                case 5 -> {
                    // Data for the sonpapdi
                    sonpapdi.soan(UserName, sc);
                }
                case 6 -> {
                    exits = true;
                }
                
            }
        }
    }
}
