import java.util.*;
public class Main {

    static Scanner input = new Scanner(System.in);
    static boolean isLoggedIn;
    static UserManager manager = new UserManager();

    public static void logIn() {

            System.out.println("---------------------");
            System.out.println("Log In to your Account");
            System.out.println("---------------------");
            System.out.print("Enter Username: ");
            String logInUsername = input.nextLine();
            System.out.print("Enter Password: ");
            String logInPassword = input.nextLine();

            boolean valid = manager.logInAccount(logInUsername, logInPassword);

            if(valid){
                System.out.println("Logged In Successfully!");
                isLoggedIn = true;
            }else{
                System.out.println("Incorrect Details. Please Try Again");
                isLoggedIn = false;
            }

    }

    public static void signUp() {
        System.out.println("---------------------");
        System.out.println("Create an Account");
        System.out.println("---------------------");
        System.out.print("Enter Username: ");
        String newUsername = input.nextLine();
        System.out.print("Enter password: ");
        String newPassword = input.nextLine();

        User newUser = new User(newUsername, newPassword);
        manager.createAccount(newUser);
    }


    public static void main(String[] args) {
       Products Tv = new Electronics(010126, "TV", 5000, 50);
       Products Laptop = new Electronics(010226, "Laptop", 60000, 50);
       Products Printer = new Electronics(010326, "Printer", 8000, 50);

       Products Chicken = new Grocery(020126, "Chicken", 350, 30);
       Products Steak = new Grocery(020226, "Steak", 900, 30);
       Products Pork = new Grocery(020326, "Pork", 550, 30);

       Products Sofa = new Furniture(030126, "Sofa", 10000, 20);
       Products Table = new Furniture(030226, "Table", 4000, 20);
       Products Shelves = new Furniture(030326, "Shelves", 2000, 20);



        int choice;
        do {

            if(isLoggedIn)  break;


            System.out.println(" ");
            System.out.println("Welcome to Shopee!");
            System.out.println("Menu: ");
            System.out.println("1. Log In");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            System.out.print("Enter: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    logIn();
                    break;
                case 2:
                    signUp();
                    break;
                case 3:
                    choice = 3;
                    break;
                default:
                    System.out.println("Invalid Input. Try Again!");
                    break;
            }
        } while (choice != 3);

        System.out.println("ISLOGGED IN IS WORKING");

    }
}









