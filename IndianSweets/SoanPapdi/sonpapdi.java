package IndianSweets.SoanPapdi;

import IndianSweets.SoanPapdi.Bikaji.bikajis;
import IndianSweets.SoanPapdi.Bikano.bikano;
import IndianSweets.SoanPapdi.Haldiram.haldirams;
import IndianSweets.SoanPapdi.PatelBrothers.patelBrothers;
import Listing.list;
import MRP.Price;
import java.util.Scanner;

public class sonpapdi {
    public static void soan(String UserName, Scanner sc) {
        boolean exists = false;
        while (!exists) {

            list.sp(UserName, "Data\\IndianSweets\\SoanPapdi\\SoanPapdi.txt",
                    "============== Savor our premium soan papdi treat! =================");

            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    String path = "Data\\IndianSweets\\SoanPapdi\\Haldiram\\Haldiram.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    haldirams.Product(product, quantity);
                }
                case 2 -> {
                    // Data for the Bikhaji
                    String path = "Data\\IndianSweets\\SoanPapdi\\Bikhaji\\Bikhaji.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    bikajis.Product(product, quantity);
                }
                case 3 -> {
                    // Data for the K.C.DAS
                    String path = "Data\\IndianSweets\\SoanPapdi\\PatelBrothers\\PatelBrothers.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    patelBrothers.Product(product, quantity);
                }
                case 4 -> {
                    // Data for the Bikanervalla
                    String path = "Data\\IndianSweets\\SoanPapdi\\Bikano\\Bikano.txt";
                    Price.mrp(path, UserName);
                    byte product = sc.nextByte();
                    System.out.print("How many Quntity u Needed : ");
                    int quantity = sc.nextInt();
                    bikano.Product(product, quantity);
                }
                case 5 -> {
                    exists = true;
                }
               
            }
        }
    }
}
