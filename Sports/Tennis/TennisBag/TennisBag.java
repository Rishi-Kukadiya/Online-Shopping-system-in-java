package Sports.Tennis.TennisBag;

import Listing.list;
import MRP.Price;
import Sports.Tennis.TennisBag.Babolat.balbottgb;
import Sports.Tennis.TennisBag.Head.headbag;
import Sports.Tennis.TennisBag.Wilson.wilsonbag;
import Sports.Tennis.TennisBag.Yonex.yonexbag;
import java.util.Scanner;
public class TennisBag {
    public static void bag(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits) {
        list.sp(UserName, "Data\\Sports\\Tennis\\TennisBag\\TennisBag.txt", "========== Carry your game in style—discover our premium tennis bags today! ==============");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Wilson
                    String path = "Data\\Sports\\Tennis\\TennisBag\\Wilson\\Wilson.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    wilsonbag.Product(product, quantity);
                }
                case 2 -> {
                    //Data for the Head
                    String path = "Data\\Sports\\Tennis\\TennisBag\\Head\\Head.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    headbag.Product(product, quantity);
                }
                case 3->{
                    //Data for the Babplot
                    String path = "Data\\Sports\\Tennis\\TennisBag\\Babolat\\Babolat.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    balbottgb.Product(product, quantity);
                }
                case 4->{
                    //Data for the Yonex
                    String path = "Data\\Sports\\Tennis\\TennisBag\\Yonex\\Yonex.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    yonexbag.Product(product, quantity);
                }
                case 5->{
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }

    }
}
