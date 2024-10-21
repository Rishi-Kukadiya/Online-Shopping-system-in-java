import Listing.list;
import Sports.Sports;
import clear.clear;
import forgot.ForgotInfo;
import java.util.Scanner;
import login.login;
import register.Main;


public class Home {

    // Function for registering and logging in the user
    public static String foundUser(int choice) {
        String isFound = null;
        switch (choice) {
            case 1 -> {
                // Logic behind registering the user
                isFound = Main.register();
                break;
            }
            case 2 -> {
                // Logic behind logging in the user
                isFound = login.lg();
                break;
            }

            case 3->{
                //logic behind the fogot of the password of the user
                isFound = ForgotInfo.forget();
            }
            default -> throw new AssertionError("Invalid choice, please try again.");
        }
        return isFound;
    }

    // Function for printing the header
    public static void printHeader() {
        System.out.println("===================================================");
        System.out.println("               Welcome to SwiftShop                ");
        System.out.println("===================================================");
    }

    // Print welcome message with the user's name
    public static void printName(String name) {
        System.out.println("====================================================================");
        System.out.println("                   " + "Welcome " + name + " to SwiftShop          ");
        System.out.println("====================================================================");
    }

    // Function for printing the main menu
    public static void printMenu() {
        System.out.println("\nPlease choose an option:");
        System.out.println("1 : New User, Kindly Register!");
        System.out.println("2 : Already have an Account? Log In");
        System.out.println("---------------------------------------------------");
    }

    // Main method of the code  
    @SuppressWarnings("resource")
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);            // Commented out the clear.clc() call for testing
            clear.clc();

            // Print the header and menu
            printHeader();
            printMenu();

            System.out.print("\nPlease enter your choice: ");
            byte choice = sc.nextByte();

            String isPresent = foundUser(choice); // Checking the login of the user
            System.out.println(isPresent);
            

             // If the user is not found
             if (isPresent == null) {
                byte attemptCount = 0;
                while (isPresent == null && attemptCount < 5) {

                    clear.clc();
                    printHeader();

                    System.out.println("\nIt seems we couldn't find your account.");
                    System.out.println("1 : Register your Account ");
                    System.out.println("2 : Try Again to Log In   ");
                    System.out.println("3 : Forgot the Password   ");
                    System.out.println("---------------------------------------------------");
                    System.out.print("Please enter your choice: ");


                    choice = sc.nextByte();
                    sc.nextLine();

                    isPresent = foundUser(choice);
                    attemptCount++;

                }

                if (attemptCount >= 5) {
                    System.out.println("\nMaximum attempts reached. Please register an account.");
                    System.out.println("1 : Register now ");
                    System.out.println("2 : Forgot the password or UserName : ");
                    choice = sc.nextByte(); 
                    isPresent = foundUser(choice);

                }
            }

            clear.clc();
            printName(isPresent);
            System.out.println("");


            //printing the menu
            list.sp(isPresent, "Data\\menu.txt", "============== Discover Something You'll Love Today! ===============");
            byte Category = sc.nextByte();
            switch (Category) {
                case 1 -> {
                    //sports data
                    Sports.sp(isPresent);
                }
                case 2 -> {
                    //Data for the puja
                }
                case 3 ->{
                    //Data for the snacks
                }
                case 4->{
                    //Data for the freshVrgetable
                }
                case 5->{
                    //Data for the Gfts

                }
                case 6->{
                    //Data for the DryFruits

                }
                case 7->{
                    //Data for the IndiaSweets

                }
                default -> throw new AssertionError("Invalid choice, please try again.");
            }
    }
}
