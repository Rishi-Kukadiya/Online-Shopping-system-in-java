package DryFruits;
import DryFruits.Almonds.Almonds;
import DryFruits.Cashews.Cashews;
import DryFruits.Pistachios.Pistachios;
import DryFruits.Raisins.Raisins;
import DryFruits.Walnuts.Walnuts;
import Listing.list;
import java.util.Scanner;
public class DryFruits {
    public static void DryFruits1(String UserName,Scanner sc){
        boolean exits = false;
        while (!exits) {
        list.sp(UserName, "Data\\DryFruits\\DryFruits.txt", "========= Premium dry fruits: healthy, tasty, energizing! ==========");
            byte choise = sc.nextByte();
            switch (choise) {
                case 1 -> {
                    Almonds.Almonds1(UserName,sc);
                }
                case 2 -> {
                    Cashews.Cashews1(UserName,sc);
                }
                case 3->{
                    Pistachios.Pistachios1(UserName,sc);
                }
                case 4->{
                    Walnuts.Walnuts1(UserName,sc);
                }
                case 5->{
                    Raisins.Raisins1(UserName,sc);
                }
                case 6->{
                    exits = true;
                }
            }
        }
    }    
}
