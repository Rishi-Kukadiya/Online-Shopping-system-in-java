package Sports.Football.Football;

import Listing.list;
import MRP.Price;
import Sports.Football.Football.Adidas.addidasfoot;
import Sports.Football.Football.Nike.nikefoot;
import Sports.Football.Football.Nivia.Niviafoot;
import Sports.Football.Football.Puma.pumafoot;
import java.util.Scanner;
public class football {
    public static void ftb(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits) {
        list.sp(UserName, "Data\\Sports\\Football\\Football\\Football.txt", "========== Play like the legends—discover exclusive football products today! ==============");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Nike
                    String path = "Data\\Sports\\Football\\Football\\Nike\\Nike.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    nikefoot.Product(product, quantity);
                }
                case 2 -> {
                    //Data for the Addidas
                    String path = "Data\\Sports\\Football\\Football\\Adidas\\Adidas.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    addidasfoot.Product(product, quantity);
                }
                case 3->{
                    //Data for the Puma
                    String path = "Data\\Sports\\Football\\Football\\Puma\\Puma.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    pumafoot.Product(product, quantity);
                }
                case 4->{
                    //Data for the Nivia
                    String path = "Data\\Sports\\Football\\Football\\Nivia\\Nivia.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Niviafoot.Product(product, quantity);
                }
                case 5->{
                   exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
