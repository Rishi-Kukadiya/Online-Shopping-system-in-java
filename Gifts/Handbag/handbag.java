package Gifts.Handbag;

import Gifts.Handbag.Coach.coach;
import Gifts.Handbag.KateSpade.katespared;
import Gifts.Handbag.LouisVuitton.LoiusVuittaion;
import Gifts.Handbag.MichaelKors.MichalKoras;
import Listing.list;
import MRP.Price;
import java.util.Scanner;
public class handbag {
    public static void hdb(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits){
        list.sp(UserName, "Data\\Gifts\\Handbag\\Handbag.txt", "================== Find the perfect handbag today! =================");
        
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the LouisVuittion
                    String path = "Data\\Gifts\\Handbag\\LouisVuitton\\LouisVuitton.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    LoiusVuittaion.Product(product, quantity);
                }
                case 2 -> {
                    //Data for the MichaelKors
                    String path = "Data\\Gifts\\Handbag\\MichaelKors\\MichaelKors.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    MichalKoras.Product(product, quantity);
                }
                case 3->{
                    //Data for the Coach
                    String path = "Data\\Gifts\\Handbag\\Coach\\Coach.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    coach.Product(product, quantity);
                }
                case 4->{
                    //Data for the KateSpade
                    String path = "Data\\Gifts\\Handbag\\KateSpade\\KateSpade.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.println("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    katespared.Product(product, quantity);
                }
                case 5->{
                    exits = true;
                }
                
            }
        }
    }
}
