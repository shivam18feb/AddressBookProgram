package com.bl.addressbook;
import java.util.*;
public class AddressBookMain{

    public static void main(String[] args){
    		String firstName, lastName, address, city, state, email;
            int zip;
            long phoneNo;

            Scanner sc= new Scanner(System.in);
            AddressBook contact = new AddressBook();
            System.out.print("Enter First Name  : ");  
            firstName = sc.next();
            contact.setFirstName(firstName);

            System.out.print("\nEnter Last Name  : ");  
            lastName = sc.nextLine();
            contact.setFirstName(lastName);

            System.out.print("\nEnter E-mail  : ");
            email = sc.next();
            contact.setEmail(email);

            System.out.print("\nEnter Address  : ");  
            address = sc.next(); 
            contact.setAddress(address);

            System.out.print("\nEnter City  : ");  
            city = sc.next(); 
            contact.setCity(city);

            

            System.out.print("\nEnter State  : ");  
            state = sc.next();
            contact.setState(state);

            System.out.print("\nEnter Phone Number  : ");   
            phoneNo = sc.nextLong();
            contact.setPhoneNo(phoneNo);

            System.out.print("\nEnter Zip  : ");  
            zip = sc.nextInt(); 
            contact.setZip(zip);

            sc.close();

            System.out.print("\nFirst Name  : " +  contact.getFirstName());
            System.out.print("\nLast Name   : " +  contact.getLastName());
            System.out.print("\nAddress     : " +  contact.getAddress());
            System.out.print("\nCity        : " +  contact.getCity());
            System.out.print("\nState       : " +  contact.getState());
            System.out.print("\nPone Number : " +  contact.getPhoneNo());
            System.out.print("\nE-mail      : " +  contact.getEmail());
            System.out.print("\nZip         : " +  contact.getZip());
        }
    }
