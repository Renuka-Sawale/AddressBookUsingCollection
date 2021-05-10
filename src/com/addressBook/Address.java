package com.addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Address {
    List<PersonDetails> list = new ArrayList<PersonDetails>();
    Scanner sc = new Scanner(System.in);

    public void insertContact(PersonDetails persondetails) {
        list.add(persondetails);
        System.out.println(list);
    }

    public void editContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name which you want to edit");
        String editname = sc.nextLine();
        PersonDetails details = null;
        for (int i= 0; i < list.size(); i++) {
            details = list.get(i);
            if (details.getFirstName().equals(editname)) {
                System.out.println("Enter the new first name");
                String newFirstName = sc.nextLine();
                details.setFirstName(newFirstName);
                System.out.println("Enter the new last name");
                String newLastName = sc.nextLine();
                details.setLastName(newLastName);
                System.out.println("Enter new address");
                String newAddress = sc.nextLine();
                details.setAddress(newAddress);
                System.out.println("Enter new city");
                String newCity = sc.nextLine();
                details.setCity(newCity);
                System.out.println("Enter new state");
                String newState = sc.nextLine();
                details.setState(newState);
                System.out.println("Enter new zip");
                String newZip = sc.nextLine();
                details.setZip(newZip);
                System.out.println("Enter new phoneNo");
                String newPhoneNo = sc.nextLine();
                details.setPhoneNo(newPhoneNo);
                System.out.println("Enter new email");
                String newEmail = sc.nextLine();
                details.setEmail(newEmail);
                break;
            }
        }
        System.out.println(list);
    }
}
