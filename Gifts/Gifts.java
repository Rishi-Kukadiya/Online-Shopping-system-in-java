package Gifts;
import Gifts.BluetoothSpeaker.bluthothspeaker;
import Gifts.Handbag.handbag;
import Gifts.Perfume.perfume;
import Gifts.Smartphone.smartphone;
import Gifts.WristWatch.WrritsWatch;
import Listing.list;
import java.util.Scanner;
public class Gifts {
    public static void gf(String UserName,Scanner sc){
        boolean exits = false;
        while(!exits) {
        list.sp(UserName, "Data\\Gifts\\Gifts.txt", "============= Celebrate occasions with perfect gifts! ==============");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    //Data for the WristWatch
                    WrritsWatch.watch(UserName,sc);
                }
                case 2 -> {
                    //Data for the Pefume
                    perfume.perfum(UserName,sc);
                }
                case 3->{
                    //Data for the SmartPhone
                    smartphone.smph(UserName,sc);
                }
                case 4->{
                    //Data for the BluthSpeaker
                    bluthothspeaker.btsp(UserName,sc);
                }
                case 5->{
                    //Data for the Handbag
                    handbag.hdb(UserName,sc);
                }
                case 6->{
                    exits = true;
                }
                
            }
        }
    }
}
