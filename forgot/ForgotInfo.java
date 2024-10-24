package forgot;
import clear.clear;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import register.Main;

interface GETDATA{
    public String getData();
}

class forgot implements GETDATA{
    private String email;
    private String phoneNumber;

    // Constructor
    forgot(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override //overide the method of the interface for this class
    public String getData() {
        try {
            File userData = new File("user.txt");

            // Check if the file exists
            if (!userData.exists()) {
                System.out.println("User data file does not exist.");
                return null;
            }

            // Reading the file
            try (Scanner sc = new Scanner(userData)) {
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();  // Reading each line
                    String[] data = line.split(":"); // Assuming colon separates the fields in the file
                    
                    // Check if the email and phone number match
                    if (data[1].equals(this.email) && data[4].equals(this.phoneNumber)) {
                        return data[0];  // Return some user information (data[0] in this case)
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while accessing the file.");
            e.printStackTrace();
        }
        return null;  // If no matching data is found
    }
}


//class for set the data userName and the Password for the User
class setUser implements GETDATA{
    private String UserName;
    private String Password;
    private String Email;
    private String phoneNumber;

    // Constructor
    setUser(String UserName, String Password, String Email, String phoneNumber) {
        this.UserName = UserName;
        this.Password = Password;
        this.Email = Email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getData() {
        List<String> lines = new ArrayList<>();
        File userData = new File("user.txt");
        
        // Read the existing file content
        try (Scanner sc = new Scanner(userData)) {
            String lineString;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();  // Reading each line
                String[] data = line.split(":"); // Assuming colon separates the fields in the file
                
                // Check if the email and phone number match
                if (data[1].equals(this.Email) && data[4].equals(this.phoneNumber)) {
                    // Update the user information
                    data[0] = this.UserName;
                    data[2] = this.Password;
                }
                // Rebuild the modified line
                lineString = String.join(":", data);
                lines.add(lineString); // Add it to the list of lines
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while accessing the file.");
            e.printStackTrace();
            return null;
        }

        // Delete the existing file
        if (userData.delete()) {
            System.out.println("Old user.txt deleted successfully.");
        } else {
            System.out.println("Failed to delete old user.txt file.");
            return null;
        }

        // Write the modified content back to the new user.txt file
        try (FileWriter writer = new FileWriter("user.txt")) {
            for (String data : lines) {
                writer.write(data + System.lineSeparator());
            }
            System.out.println("New user.txt file created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
            return null;
        }

        return this.UserName;  // Return the updated username after successful write
    }
}



// Separate class for handling forgot info
public class ForgotInfo {
    public static String forget(){
        // Clear the screen (assuming clear.clc() is a valid method from the clear package)
        clear.clc();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("               Welcome to SwiftShop                ");
        System.out.println("===================================================");

        // Prompt the user for input
        String email = Main.validateInput(sc, "Enter the EmailId    : ", 
        "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$", 
        "----------------Invalid EmailId!----------------");

        String phoneNumber = Main.validateInput(sc, "Enter the PhoneNumber: ", 
        "^(?:\\+91|0)?[6789]\\d{9}$", 
        "----------------Invalid PhoneNumber!----------------");


        // Create an object of Forgot class
        forgot fg = new forgot(email, phoneNumber);

        // Get user data from the file
        String found = fg.getData();
        if(found != null){
            //logic for the change the data of the user
            System.out.println("Account has been Found !!");
            String newUser  = Main.validateInput(sc, "Enter the New UserName   : ", "^[a-zA-Z0-9._@#$%^&*-]+$", 
            "----------------Invalid UserName!----------------\nPlease enter only Alphanumeric Characters.");


            String newPassword = Main.validateInput(sc, "Enter the New Password   : ", 
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$", 
            "----------------Invalid Password!----------------\nPassword must contain at least one lowercase, one uppercase, one digit, one special character, and be at least 8 characters long.");

            //creat the object the new user database
            setUser set = new setUser(newUser, newPassword, email, phoneNumber);
            String nu = set.getData();
            if(nu != null){
                System.out.println("The chnage has been Succesfully done !!");
                return nu;
            }else{
                System.out.println("There is some technical error while correcting the data!!");
                return null;
            }
        }else{
            System.out.println("The Account is not found !!");
        }
        return null;
    }
}
