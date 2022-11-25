package com.bridgelabz.addressbooksystems;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("---------- Welcome To Address Book Program!! ----------");
		
		AddressBookMain addressBookDirectory = new AddressBookMain();
        addressBookDirectory.operationDirectory();
        Address addressBook = new Address();
        addressBook.operation();
	}
	private void operationDirectory() {
		// TODO Auto-generated method stub
	}
}
