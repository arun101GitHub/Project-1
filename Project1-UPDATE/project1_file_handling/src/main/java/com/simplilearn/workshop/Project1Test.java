package com.simplilearn.workshop;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;

public class Project1Test {
	private static void displayChoiceMessage() {
		System.out.println("Enter Choice A for Add a file to existing directory");
		System.out.println("Enter Choice B for Delete a file to existing directory");
		System.out.println("Enter Choice C for Search a file to existing directory");
	}

	private static void displayWelcomeMessage() {
		System.out.println("***** Welcome to Lockers Pvt. Ltd *******");
		System.out.println(" **** LockedMecom File Handling Prototype ****");
		System.out.println(" *****Developed By Arun Thapa ****");
		
	}

	private static void displayOptionMessage() {
		System.out.println("\nEnter Option Number 1 for return current files & directory");
		System.out.println("Enter Option Number 2 for Multiple Selections");
		System.out.println("Enter Option Number 3 for close application");
	}

	public static void main(String[] args) throws IOException {
		displayWelcomeMessage();
		Scanner input = new Scanner(System.in);
		
		int option;
		
		displayOptionMessage();
		
		CurrentDirectoryPath DirPath = new CurrentDirectoryPath();
		CreateNewFile Add = new CreateNewFile();
		TestDelete Delete = new TestDelete();
		SearchFile search = new SearchFile();
		
		
		option = input.nextInt();
		
		switch (option)
		{
		case 1:
			DirPath.findDirectory();
			break;
		case 2:
			displayChoiceMessage();
			Scanner sc = new Scanner(System.in); 
			   
	        // Character input 
	        char choice = sc.next().charAt(0); 
			switch(choice) {
		case 'A':{
			// Add a file
				Add.createFileUsingFileClass();
			    Add.createFileUsingFileOutputStreamClass();
			    Add.createFileIn_NIO();
			}
			break;
		case 'B': {
				// Delete a file
				 Delete.delete();
			 }
			break;
		case 'C':
			{
				// Search a file
				search.Search();
			}
			break; 
		default: 
		{// user did enter valid selection
		System.out.println("\n Your did not enter a valid selection. Try again");	

	     }
		break;
			}
		case 3:
		    { // close application
		    	
		    	System.out.println("terminating or closing java program");
		        System.exit(1); //non zero value to exit says abnormal termination of JVM
		    }
			break;
		
		default: 
		{// user did enter valid selection
		System.out.println("\n Your did not enter a valid selection. Try again");	

	     }
		break;
		
       }
	}
}
