package  Sports.Tennis.TennisBalls;

import Listing.list;
import MRP.Price;
import Sports.Tennis.TennisBalls.Babolat.balbotball;
import Sports.Tennis.TennisBalls.Head.headball;
import Sports.Tennis.TennisBalls.Wilson.willsonball;
import Sports.Tennis.TennisBalls.Yonex.yonexball;
import java.util.Scanner;
public class tennisbal {
     public static void ball(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits) {
        list.sp(UserName, "Data\\Sports\\Tennis\\TennisBalls\\TennisBalls.txt", "========== Get ready to serve it up—explore our selection of tournament-quality tennis balls! ==============");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Wilson
                    String path = "Data\\Sports\\Tennis\\TennisBalls\\Wilson\\Wilson.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    willsonball.Product(product, quantity);
                }
                case 2 -> {
                    //Data for the Head
                    String path = "Data\\Sports\\Tennis\\TennisBalls\\Head\\Head.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    headball.Product(product, quantity);
                }
                case 3->{
                    //Data for the Babplot
                    String path = "Data\\Sports\\Tennis\\TennisBalls\\Babolat\\Babolat.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    balbotball.Product(product, quantity);
                }
                case 4->{
                    //Data for the Yonex
                    String path = "Data\\Sports\\Tennis\\TennisBalls\\Yonex\\Yonex.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    yonexball.Product(product, quantity);
                }
                case 5->{
                   exits = true;
                }
            }
        }

    }
}
