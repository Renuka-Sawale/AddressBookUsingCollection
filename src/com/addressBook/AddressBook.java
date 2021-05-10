package com.addressBook;

import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Address addr = new Address();
        int option;
        System.out.println("Welcome to Address Book System");
        do {
            System.out.println("1. Add Person Details");
            System.out.println("2. Edit the Details");
            System.out.println("3. Delete the Details");
            System.out.println("0. Exit");
            System.out.println("Choose proper input:");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Enter first name");
                    String firstName = scan.nextLine();
                    System.out.println("Enter last name");
                    String lastName = scan.nextLine();
                    System.out.println("Enter address");
                    String address = scan.nextLine();
                    System.out.println("Enter city");
                    String city = scan.nextLine();
                    System.out.println("Enter state");
                    String state = scan.nextLine();
                    System.out.println("Enter zip");
                    String zip = scan.nextLine();
                    System.out.println("Enter phoneNo");
                    String phoneNo = scan.nextLine();
                    System.out.println("Enter email");
                    String email = scan.nextLine();
                    PersonDetails persondetails = new PersonDetails(firstName, lastName, address, city, state, zip, phoneNo, email);
                    addr.insertContact(persondetails);
                break;

                case 2:
                    addr.editContact();
                break;

                case 3:
                    addr.deleteContact();
                break;
            }
        } while (option !=0);
    }
}

