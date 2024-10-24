package Sports.Badminton.BadmintonShoes;

import Listing.list;
import MRP.Price;
import Sports.Badminton.BadmintonShoes.Ashaway.ashwayshoes;
import Sports.Badminton.BadmintonShoes.Victor.victors;
import Sports.Badminton.BadmintonShoes.Yonex.yonexs;
import Sports.Badminton.BadmintonShoes.lining.linings;
import java.util.Scanner;
public class Badmintonshooes {
    public static void shoes(String UserName,Scanner sc){
        boolean exits = false;
        while (!exits) {
        list.sp(UserName, "Data\\Sports\\Badminton\\BadmintonShoes\\BadmintonShoes.txt", "========== Shop now! Elevate Badminton Shoes with new gear! ==============");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the Yonex
                    String path = "Data\\Sports\\Badminton\\BadmintonShoes\\Yonex\\Yonex.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    yonexs.Product(product, quantity);
                }
                case 2 -> {
                    //Data for the Li-Ning
                    String path = "Data\\Sports\\Badminton\\BadmintonShoes\\Li-Ning\\Li-Ning.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    linings.Product(product, quantity);
                }
                case 3->{
                    //Data for the Victor
                    String path = "Data\\Sports\\Badminton\\BadmintonShoes\\Victor\\Victor.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    victors.Product(product, quantity);
                }
                case 4->{
                    //Data for the Ashaway
                    String path = "Data\\Sports\\Badminton\\BadmintonShoes\\Ashaway\\Ashaway.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    ashwayshoes.Product(product, quantity);
                }
                case 5->{
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }

    }
}
