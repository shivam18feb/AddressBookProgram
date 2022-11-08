package com.bl.addressbook;

public class AddressBook{

    String firstName, lastName, address, city, state, phoneNo, email;
    long zip;
    public void setDetails(){

        firstName = "Shivam";
        lastName = "Pandey";
        address = "124";
        city ="Prayagraj";
        state = "Uttar Pradesh";
        zip = 211004;
        phoneNo = "8100576002";
        email = "abc@gmail.com";
    }
    public void printValue(){

        System.out.println("First Nmae : " + firstName  + "\nLast Name : " + lastName + "\nAddress : " + address + "\nCity : " + city + "\nState : " + state + "\nZip : " + zip + "\nPhone Number : " + phoneNo + "\nE-mail : " + email); 
    }
}