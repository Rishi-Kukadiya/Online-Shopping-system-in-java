package register;
import clear.clear; // Assuming this is a custom class for clearing the screen
import java.util.Scanner;
public class Main {

    // Refactor the input validation into separate methods
    public static String validateInput(Scanner sc, String prompt, String regex, String errorMessage) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = sc.nextLine().trim();
            if (input.matches(regex)) {
                break;
            } else {
                System.out.println(errorMessage);
            }
        }
        return input;
    }

    public static String register() {
        clear.clc(); // Assuming clear is a custom class that clears the screen
        System.out.println("===================================================");
        System.out.println("               Welcome to SwiftShop                ");
        System.out.println("===================================================");

        // Create a scanner (no need to close it in this case)
        Scanner sc = new Scanner(System.in);

        // Collecting user details and validating input
        String UserName = validateInput(sc, "Enter the UserName   : ", "^[a-zA-Z0-9._@#$%^&*-]+$", 
                                        "----------------Invalid UserName!----------------\nPlease enter only Alphanumeric Characters.");
        String EmailId = validateInput(sc, "Enter the EmailId    : ", 
                                       "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$", 
                                       "----------------Invalid EmailId!----------------");
        String Password = validateInput(sc, "Enter the Password   : ", 
                                        "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$", 
                                        "----------------Invalid Password!----------------\nPassword must contain at least one lowercase, one uppercase, one digit, one special character, and be at least 8 characters long.");
        String Address = validateInput(sc, "Enter the Address    : ", 
                                       "^[\\d\\w\\s,.#-]+$", 
                                       "----------------Invalid Address!----------------");
        String PhoneNumber = validateInput(sc, "Enter the PhoneNumber: ", 
                                           "^(?:\\+91|0)?[6789]\\d{9}$", 
                                           "----------------Invalid PhoneNumber!----------------");

        // After all input is validated, create the User object
        User user = new User(UserName, EmailId, Password, Address, PhoneNumber);
        user.AddUser(); // Add the user to the file/database

        // Return the registered username
        return UserName;
    }
}
