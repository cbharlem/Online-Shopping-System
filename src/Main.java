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
       ArrayList<Products> productsList = new ArrayList<>();


        productsList.add(new Electronics(10126, "TV", 5000, 50));
        productsList.add(new Electronics(10226, "Laptop", 60000, 50));
        productsList.add(new Electronics(10326, "Printer", 8000, 50));

        productsList.add(new Grocery(20126, "Chicken", 350, 30));
        productsList.add(new Grocery(20226, "Steak", 900, 30));
        productsList.add(new Grocery(20326, "Pork", 550, 30));

        productsList.add(new Furniture(30126, "Sofa", 10000, 20));
        productsList.add(new Furniture(30226, "Table", 4000, 20));
        productsList.add(new Furniture(30326, "Shelves", 2000, 20));



        int choiceLP;
        do {

            if(isLoggedIn)  break;


            System.out.println(" ");
            System.out.println("Welcome to Shopee!");
            System.out.println("Menu: ");
            System.out.println("1. Log In");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            System.out.print("Enter: ");
            choiceLP = input.nextInt();
            input.nextLine();

            switch (choiceLP) {

                case 1:
                    logIn();
                    break;
                case 2:
                    signUp();
                    break;
                case 3:
                    choiceLP = 3;
                    break;
                default:
                    System.out.println("Invalid Input. Try Again!");
                    break;
            }
        } while (choiceLP != 3);



        int choiceM;

        do{


            System.out.println("Menu: ");
            System.out.println("1. Browse Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Remove Product from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. View Orders");
            System.out.println("7. Exit");
            choiceM = input.nextInt();
            input.nextLine();


            switch(choiceM){

                case 1:
                    System.out.println("=== AVAILABLE PRODUCTS ===");
                    for(Products i: productsList){
                        System.out.println(i.getProductInfo());
                    }
                    break;











            }















        }while(choiceM != 7);

    }
}









