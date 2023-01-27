package Main;

import Login.LoginClass;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = scanner.next();
        System.out.println("Enter password");
        String password = scanner.next();

        LoginClass loginClass = new LoginClass();
        boolean isUserExist = loginClass.validateLogin(userName, password);

        if (isUserExist) {
            System.out.println("User exists");
        } else {
            System.out.println("Wrong userName or password");
        }

    }
}
