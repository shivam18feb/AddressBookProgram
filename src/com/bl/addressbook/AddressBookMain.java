package com.bl.addressbook;

public class AddressBookMain{

    public static void main(String[] args){
    	System.out.println("Welcome to Address Book Program");
        AddressBook contact = new AddressBook();
        contact.setDetails();
        contact.printValue();
    }
}