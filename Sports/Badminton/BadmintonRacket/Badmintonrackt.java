package Sports.Badminton.BadmintonRacket;

import Listing.list;
import MRP.Price;
import Sports.Badminton.BadmintonRacket.Ashaway.ashway;
import Sports.Badminton.BadmintonRacket.Victor.victor;
import Sports.Badminton.BadmintonRacket.Yonex.yonex;
import Sports.Badminton.BadmintonRacket.lining.ling;
import java.util.Scanner;
public class Badmintonrackt {
    public static void badrackt(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits){
        list.sp(UserName, "Data\\Sports\\Badminton\\BadmintonRacket\\BadmintonRacket.txt", "========== Shop now! Elevate Badminton Racket with new gear! ==============");
       
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Yonex
                    String path = "Data\\Sports\\Badminton\\BadmintonRacket\\Yonex\\Yonex.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    yonex.Product(product, quantity);
                }
                case 2 -> {
                    //Data for the Li-Ning
                    String path = "Data\\Sports\\Badminton\\BadmintonRacket\\Li-Ning\\Li-Ning.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    ling.Product(product, quantity);
                }
                case 3->{
                    //Data for the Victor
                    String path = "Data\\Sports\\Badminton\\BadmintonRacket\\Victor\\Victor.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    victor.Product(product, quantity);
                }
                case 4->{
                    //Data for the Ashaway
                    String path = "Data\\Sports\\Badminton\\BadmintonRacket\\Ashaway\\Ashaway.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    ashway.Product(product, quantity);
                }
                case 5->{
                   exits = true;
                }
            }
        }

    }
}
