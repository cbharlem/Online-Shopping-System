import java.util.*;
public class UserManager {

    static ArrayList<User> appUsers = new ArrayList<>();


    public void createAccount(User newUser){
        appUsers.add(newUser);
        System.out.println("Account Successfully Created!");
    }



    public boolean logInAccount(String username, String password){
     for(User i: appUsers){
if(i.getUsername().equals(username)&&i.getPassword().equals(password)){
    return true;
}
     }
return false;
    }







}
