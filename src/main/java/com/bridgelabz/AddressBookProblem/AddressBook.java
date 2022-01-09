package com.bridgelabz.AddressBookProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
	Scanner sc = new Scanner(System.in);	
	public void editContact(Map<String, AddressBookDetails> addressBook, AddressBookDetails information) {
			System.out.println("Enter the name of person u want to edit details : ");
			String editInfoOfName = sc.next();
			addressBook.replace(editInfoOfName, information, infoObjectCreater());
		    }
	private void deleteContact(Map<String, AddressBookDetails> addressBook, AddressBookDetails information) {
		System.out.println("Enter the name of person u want to delete details : ");
		String editInfoOfName = sc.next();
		addressBook.remove(editInfoOfName);
	    }
	
	public AddressBookDetails infoObjectCreater() {
		Scanner sc = new Scanner(System.in);
		 /*----------------Strings----------------------*/
        System.out.println("Enter first name = ");
        String firstName = sc.next();
        System.out.println("Enter Last name = ");
        String lastName = sc.next();
        System.out.println("Enter Address = ");
        String address = sc.next();
        System.out.println("Enter City = ");
        String subCity = sc.next();
        System.out.println("Enter  State = ");
        String state = sc.next();
        System.out.println("Enter  Email= ");
        String email = sc.next();
        
        //-------------int & long---------------//
        System.out.println("Enter zip code = ");
        int Zip = sc.nextInt();
        System.out.println("Enter phone Number = ");
        long PhoneNumber = sc.nextLong();
        
        AddressBookDetails editedInformation = new AddressBookDetails(firstName,lastName,address,subCity,state,email,Zip,PhoneNumber);
        return editedInformation;
        }
	
	
	public void addContact() {
		Scanner sc = new Scanner(System.in);
    	Map<String, AddressBookDetails> addressBook = new HashMap<>();
    	String ans = "Y";
    	 AddressBookDetails information = null;
    	while(ans.equals("Y")) {
        
            /*----------------Strings----------------------*/
            System.out.println("Enter first name = ");
            String firstName = sc.next();
            System.out.println("Enter Last name = ");
            String lastName = sc.next();
            System.out.println("Enter Address = ");
            String address = sc.next();
            System.out.println("Enter City = ");
            String subCity = sc.next();
            System.out.println("Enter  State = ");
            String state = sc.next();
            System.out.println("Enter  Email= ");
            String email = sc.next();
            
            //-------------int & long---------------//
            System.out.println("Enter zip code = ");
            int Zip = sc.nextInt();
            System.out.println("Enter phone Number = ");
            long PhoneNumber = sc.nextLong();
            
            information = new AddressBookDetails(firstName,lastName,address,subCity,state,email,Zip,PhoneNumber);
	
	        addressBook.put(firstName,information);
	        for(String AddressBookDetails: addressBook.keySet()){
	            System.out.println("firstName = " + information.getFirstName() +
	                    "\nlast Name = "+ information.getLastName() +
	                    "\naddress = "+ information.getAddress() +
	                    "\ncity = "+ information.getCity() +
	                    "\nstate = "+ information.getState() +
	                    "\nemail = "+ information.getEmail() +
	                    "\nZip = "+ information.getZipCode() +
	                    "\nPhoneNumber = "+ information.getPhoneNumber());
        	};
        	
        	System.out.println("Do you want to add new contact (Y-yes/N-no): ");
        	ans = sc.next();
        }
    	System.out.println("Edit Contact (press 1)"
				+ "Delete Contact (press 2)");
		int action = sc.nextInt();
		switch(action) {
			case 1: editContact(addressBook,information);
			break;
			
			case 2: deleteContact(addressBook,information);
			break;
			
			default: System.err.println("invalid input");
				
		}
	}
}
