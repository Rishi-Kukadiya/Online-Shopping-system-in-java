package IndianSweets.GulabJamun;

import IndianSweets.GulabJamun.Bikaji.bikaji;
import IndianSweets.GulabJamun.Bikanervala.bikanervala;
import IndianSweets.GulabJamun.Haldiram.haldiram;
import IndianSweets.GulabJamun.MTR.mtr;
import Listing.list;
import MRP.Price;
import java.util.Scanner;
public class GulabJamun {
    public static void gulab(String UserName,Scanner sc) {
        boolean exits = false;
        while (!exits) {
        list.sp(UserName, "Data\\IndianSweets\\GulabJamun\\GulabJamun.txt", "============== Savor authentic gulab jamun today! ==================");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Haldiram
                    String path =  "Data\\IndianSweets\\GulabJamun\\Haldiram\\Haldiram.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    haldiram.Product(product, quantity);

                }
                case 2 -> {
                    //Data for the Bikaji
                    String path =  "Data\\IndianSweets\\GulabJamun\\Bikaji\\Bikaji.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    bikaji.Product(product, quantity);
                }
                case 3->{
                    //Data for the MTR
                    String path =  "Data\\IndianSweets\\GulabJamun\\MTR\\MTR.txt";
                    Price.mrp(path, UserName);
                     byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    mtr.Product(product, quantity);
                }
                case 4->{
                    //Data for the Bikanervala
                    String path =  "Data\\IndianSweets\\GulabJamun\\Bikanervala\\Bikanervala.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    bikanervala.Product(product, quantity);
                }
                case 5->{
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
    
}
