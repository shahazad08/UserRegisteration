package com.bridgelabz;

import static com.bridgelabz.UserRegistration.scanner;

public class UserRegisterationMain {
    public static void main(String args[]) {
        System.out.println("Welcoime to User Registeration");
        System.out.println("Enter 1 : to validate First Name ");
        System.out.println("Enter 2 : to validate Mobile Number ");
        switch (scanner.nextInt()){
            case 1:
                UserRegistration.validFirstName();
                break;

        }
    }
}
