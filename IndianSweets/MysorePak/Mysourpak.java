package IndianSweets.MysorePak;

import IndianSweets.MysorePak.AdyarAnandaBhavan.Adyaanadbhav;
import IndianSweets.MysorePak.MTR.mtrM;
import IndianSweets.MysorePak.ShreeMithai.shreemithai;
import IndianSweets.MysorePak.SriKrishnaSweets.shrikishna;
import Listing.list;
import MRP.Price;
import java.util.Scanner;
public class Mysourpak {
    public static void pack(String UserName,Scanner sc) {
        boolean exits = false;
        while (!exits) {
        list.sp(UserName, "Data\\IndianSweets\\MysorePak\\MysorePak.txt", "=============== Delight in authentic Mysore pak! ===================");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the MTR
                    String path =  "Data\\IndianSweets\\MysorePak\\MTR\\MTR.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    mtrM.Product(product, quantity);
                }
                case 2 -> {
                    //Data for the AdyarAandaBhavan
                    String path =  "Data\\IndianSweets\\MysorePak\\AdyarAnandaBhavan\\AdyarAnandaBhavan.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Adyaanadbhav.Product(product, quantity);
                }
                case 3->{
                    //Data for the ShriKrihsnaSweets
                    String path =  "Data\\IndianSweets\\MysorePak\\SriKrishnaSweets\\SriKrishnaSweets.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    shrikishna.Product(product, quantity);
                }
                case 4->{
                    //Data for SreemITHAY
                     String path =  "Data\\IndianSweets\\MysorePak\\ShreeMithai\\ShreeMithai.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    shreemithai.Product(product, quantity);
                }
                case 5->{
                   exits = true;
                }
                
            }
        }
    }
}
