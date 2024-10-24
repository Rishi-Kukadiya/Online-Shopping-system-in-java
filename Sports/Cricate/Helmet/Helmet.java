package Sports.Cricate.Helmet;
import Listing.list;
import MRP.Price;
import Sports.Cricate.Helmet.Kookaburra.kkbh;
import Sports.Cricate.Helmet.MRF.mrfhel;
import Sports.Cricate.Helmet.SG.sghel;
import Sports.Cricate.Helmet.SS.sshel;
import java.util.Scanner;

public class Helmet {
    public static void hem(String UserName,Scanner sc){
        boolean exits = false ;
        while(!exits){
        list.sp(UserName, "Data\\Sports\\cricket\\Helmet\\Helmet.txt", "========== Shop now! Elevate Cricket Helmet with new gear! ==============");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the SS
                    String path = "Data\\Sports\\cricket\\Helmet\\SS\\SS.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    sshel.Product(product, quantity);
                }
                case 2 -> {
                    //Data for the SG
                    String path = "Data\\Sports\\cricket\\Helmet\\SG\\SG.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    sghel.Product(product, quantity);
                }
                case 3->{
                    //Data for the KOOKABOORA
                    String path = "Data\\Sports\\cricket\\Helmet\\Kookaburra\\Kookaburra.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    kkbh.Product(product, quantity);
                }
                case 4->{
                    //Data for the MRF
                    String path = "Data\\Sports\\cricket\\Helmet\\MRF\\MRF.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    mrfhel.Product(product, quantity);
                }
                case 5->{
                    exits = true ;
                }
            }
        }

    }
}
