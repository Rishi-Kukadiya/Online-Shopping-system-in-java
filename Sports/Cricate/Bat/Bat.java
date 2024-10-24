package Sports.Cricate.Bat;
import Listing.list;
import MRP.Price;
import Sports.Cricate.Bat.ADIDAS.addidasb;
import Sports.Cricate.Bat.CEAT.ceatb;
import Sports.Cricate.Bat.GM.gmba;
import Sports.Cricate.Bat.KOOKABURRA.kookab;
import Sports.Cricate.Bat.MRF.mrfb;
import Sports.Cricate.Bat.SG.sgsb;
import Sports.Cricate.Bat.SS.sscb;
import Sports.Cricate.Bat.newBalance.nebs;
import java.util.Scanner;

public class Bat {
    public static void bt(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits) {
        list.sp(UserName, "Data\\Sports\\cricket\\Bat\\Bat.txt", "========== Shop now! Elevate Cricket Bat with new gear! ==============");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the MRF
                    String path = "Data\\Sports\\cricket\\Bat\\MRF\\MRF.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    mrfb.Product(product, quantity);
                }
                case 2 -> {
                    //Data for the SG
                    String path = "Data\\Sports\\cricket\\Bat\\SG\\SG.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    sgsb.Product(product, quantity);
                }
                case 3->{
                    //Data for the CEAT
                    String path = "Data\\Sports\\cricket\\Bat\\CEAT\\CEAT.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    ceatb.Product(product, quantity);
                }
                case 4->{
                    //Data for the Kookaburra
                    String path = "Data\\Sports\\cricket\\Bat\\KOOKABURRA\\KOOKABURRA.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    kookab.Product(product, quantity);
                }
                case 5->{
                    //Data for the SS
                    String path = "Data\\Sports\\cricket\\Bat\\SS\\SS.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    sscb.Product(product, quantity);
                }
                case 6->{
                    //Data for the NEW BALANCE
                    String path = "Data\\Sports\\cricket\\Bat\\NEW BALANCE\\NEW BALANCE.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    nebs.Product(product, quantity);
                }
                case 7->{
                    //Data for the ADDIDAS
                    String path = "Data\\Sports\\cricket\\Bat\\ADIDAS\\ADIDAS.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    addidasb.Product(product, quantity);
                }
                case 8->{
                    //DATA FOR THE GM
                    String path = "Data\\Sports\\cricket\\Bat\\GM\\GM.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    gmba.Product(product, quantity);
                }
                case 9->{
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }

    }
}
