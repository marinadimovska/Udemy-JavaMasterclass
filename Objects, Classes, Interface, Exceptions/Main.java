import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UsernameException, PassException { // vinagi na metodi
        String username;
        String password;
        String password1;
        String gsm;
        ArrayList<User> users = new ArrayList<>(); //creating array

        User user1 = new User("Marina", "1234", "0877262794");
        User user2 = new User("Nikolai", "0000", "0877262094");
        User user3 = new User("Marian", "1111", "0877262994");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter r or l");
        String enter = scanner.next();

        if(enter.equals("r")){
            System.out.println("Enter username");
            username = scanner.next();
            for (int i = 0; i < users.size() ; i++) {
                if(username.equals(users.get(i).getName())){
                    throw new UsernameException();
                }
            }
            password = scanner.next();
            password1 = scanner.next();

            if(!password.equals(password1)){
                throw new PassException();
            }
            gsm = scanner.next();
            User registration = new User(username, password, gsm);
            users.add(registration);
        }

        else{
            System.out.println("Enter username");
            username = scanner.next();
            boolean usernameFlag = true;
            for (int i = 0; i < users.size() ; i++) {
                if(username.equals(users.get(i).getName())){
                    usernameFlag = false;
                    password = scanner.next();
                    if(password.equals(users.get(i).getPass())){
                        System.out.println("Welcome  " + users.get(i).getName());
                    }else{
                        System.out.println("Wrong password!");
                    }
                }
            }
            if(usernameFlag){
                System.out.println("Did not match username");
            }
        }
    }
}
