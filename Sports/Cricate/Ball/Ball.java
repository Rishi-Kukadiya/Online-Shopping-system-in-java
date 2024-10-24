package Sports.Cricate.Ball;
import Listing.list;
import MRP.Price;
import Sports.Cricate.Ball.Kookaburra.kookb;
import Sports.Cricate.Ball.MRF.mrfb;
import Sports.Cricate.Ball.SG.sgb;
import Sports.Cricate.Ball.SS.sssb;
import java.util.Scanner;
public class Ball {
    public static void ball(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits){
        list.sp(UserName, "Data\\Sports\\cricket\\Ball\\Ball.txt", "========== Shop now! Elevate Cricket Ball with new gear! ==============");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the SS
                    String path = "Data\\Sports\\cricket\\Ball\\SS\\SS.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    sssb.Product(product, quantity);
                }
                case 2 -> {
                    //Data for the SG
                    String path = "Data\\Sports\\cricket\\Ball\\SG\\SG.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    sgb.Product(product, quantity);
                }
                case 3->{
                    //Data for the KOOKABOORA
                    String path = "Data\\Sports\\cricket\\Ball\\Kookaburra\\Kookaburra.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    kookb.Product(product, quantity);
                }
                case 4->{
                    //Data for the MRF
                    String path = "Data\\Sports\\cricket\\Ball\\MRF\\MRF.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    mrfb.Product(product, quantity);
                }
                case 5->{
                    exits = true;
                }
            }
        }

    }
}
