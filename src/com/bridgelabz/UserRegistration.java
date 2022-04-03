package com.bridgelabz;

/**
 * Program on User Registration Using Regex
 *
 * @author : Shubham Pawar
 * @since : 01/04/2022
 * */

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
    Scanner sc = new Scanner(System.in);

    public void firstNameCheck() {
        System.out.print("Enter First Name of User: ");
        String fName = sc.next();
        /*
         * As a User needs to check the regex pattern for the firstName
         */
        boolean check = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", fName);
        if (check)
            System.out.println("Perfect! First #Name");
        else
            System.out.println("Please Enter a Valid First name with Only \"One Starting Capital\" latter");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRegistration user = new UserRegistration();

        System.out.println("Welcome to User Registration Program");
        /*
         * A method Calling (Function)
         */
        user.firstNameCheck();
    }
}
