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

    public void lastNameCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Name of User: ");
        String lName = sc.next();

        /*
         * As a User needs to check the regex pattern for the laststName
         */
        boolean check = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lName);
        if (check)
            System.out.println("Perfect! Last #Name");
        else
            System.out.println("Please Enter a Valid Last Name with Only \"One Starting Capital\" latter");
    }
    public void email() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email of User: ");
        String eMail = sc.next();
        /*
         * As a User needs to check the regex pattern for the emailId
         */
        boolean check = Pattern.matches("^[a-z]{1,}[0-9]{1,}@[a-z]{1,}[.]com", eMail);
        if (check)
            System.out.println("Perfect! #Email!");
        else
            System.out.println("Please Enter a Valid Email");
    }
    public void mobileNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mobile number : ");
        String mobileNum = sc.nextLine();
        /*
         * As a User needs to check the regex pattern for the MobileNumber
         */
        boolean check = Pattern.matches("[+91]{3} [6789]{1}[0-9]{9}", mobileNum);
        if (check)
            System.out.println("Perfect! Mobile #Num");
        else
            System.out.println("Please Enter a Valid Mobile Number");
    }
    /*
     * / rule1 minimum 8 characters
     */
    public void passWordRule1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password :  ");
        String passWord = sc.nextLine();
        boolean check = Pattern.matches("[a-zA-Z]{8,}", passWord);
        if (check)
            System.out.println("Perfect! #password");
        else
            System.out.println("Please Enter a Valid password, it should have minimum 8 characters");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRegistration user = new UserRegistration();

        System.out.println("Welcome to User Registration Program");
        /*
         * A method Calling (Function)
         */
        user.firstNameCheck();
        user.lastNameCheck();
        user.email();
        user.mobileNum();
        user.passWordRule1();
    }

}
