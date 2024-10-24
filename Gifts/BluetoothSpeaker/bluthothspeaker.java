package Gifts.BluetoothSpeaker;

import Gifts.BluetoothSpeaker.Boat.boat;
import Gifts.BluetoothSpeaker.Bose.Bose;
import Gifts.BluetoothSpeaker.JBL.JBL;
import Gifts.BluetoothSpeaker.Sony.Sony;
import Listing.list;
import MRP.Price;
import java.util.Scanner;
public class bluthothspeaker {
    public static void btsp(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits) {
        list.sp(UserName, "Data\\Gifts\\BluetoothSpeaker\\BluetoothSpeaker.txt", "================ Experience music like never before! ===============");
       
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the JBL
                    String path = "Data\\Gifts\\BluetoothSpeaker\\JBL\\JBL.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    JBL.Product(product, quantity);
                    
                }
                case 2 -> {
                    //Data for the SONY
                    String path = "Data\\Gifts\\BluetoothSpeaker\\Sony\\Sony.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Sony.Product(product, quantity);
                }
                case 3->{
                    //Data for the Bose
                    String path = "Data\\Gifts\\BluetoothSpeaker\\Bose\\Bose.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    Bose.Product(product, quantity);
                }
                case 4->{
                    //Data for the Boat
                    String path = "Data\\Gifts\\BluetoothSpeaker\\Boat\\Boat.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    boat.Product(product, quantity);
                }
                case 5->{
                    exits = true;
                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
        }
    }
}
