package Gifts.Perfume;

import Gifts.Perfume.CalvinKlein.Calvinkain;
import Gifts.Perfume.Davidoff.Davidoff;
import Gifts.Perfume.Gucci.Guuccci;
import Gifts.Perfume.HugoBoss.HugoBoss;
import Listing.list;
import MRP.Price;
import java.util.Scanner;

public class perfume {
    public static void perfum(String UserName, Scanner sc) {
        boolean exits = false ;
        while(!exits){
        list.sp(UserName, "Data\\Gifts\\Perfume\\Perfume.txt",
                "========== Embrace individuality with unique perfumes! =============");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    // Data for the Calvinklein
                    String path = "Data\\Gifts\\Perfume\\CalvinKlein\\CalvinKlein.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Calvinkain.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the Davidoff
                    String path = "Data\\Gifts\\Perfume\\CalvinKlein\\CalvinKlein.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Davidoff.Product(product, quantity);

                }
                case 3 -> {
                    // Data for the Gucci
                    String path = "Data\\Gifts\\Perfume\\Gucci\\Gucci.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Guuccci.Product(product, quantity);
                }
                case 4 -> {
                    // Data for the HugoBoss
                    String path = "Data\\Gifts\\Perfume\\HugoBoss\\Hugo";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    HugoBoss.Product(product, quantity);
                }
                case 5->{
                    exits = true ;
                }
                
            }
        }
    }
}
