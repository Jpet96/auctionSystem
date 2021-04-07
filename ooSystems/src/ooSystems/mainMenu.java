package ooSystems;

import java.util.Scanner;

public class mainMenu {
	Scanner scan = new Scanner(System.in);
	
	
	public void printHeader() {
		System.out.println("------------------------------");
		System.out.println("|     Welcome to eAuction!   |");
		System.out.println("|                            |");
		System.out.println("------------------------------");
		
		
		
	}
	
	public void menu() {
			int choice = -1; 
	
			
			System.out.println("----------- MENU ------------");
			// GUI spacing 
			System.out.println(" ");
			System.out.println("-- 1. [L]og in --");
			System.out.println("-- 2. [C]reate Account --");
			System.out.println("-- 3. [B]rowse Auctions--");
			System.out.println("-- 4. [Q]uit --");
			System.out.println(" ");

			
			// user choice 
			choice = scan.nextInt();
			
			switch (choice) {
			case 1 :
			  {
				loginAccount();
				break;
			}
			case 2: {
				createAccount();
				break;
			}
			case 3: {
				browseAuctions();
				break;
				}
			case 4: 
				System.out.println("Thank you for using eAuction!");
				System.exit(0);
				break;
			}
			
			}

	public void runMenus () {
		printHeader();
		menu();
	}
	
	
	
	
	private void browseAuctions() {

		// TODO Auto-generated method stub
		
	}

	private void createAccount() {
		User user = new User();
		System.out.println("Please enter a username: ");
		String userName = scan.next().toLowerCase();
		System.out.println("Please enter a password (Not case-sensitive) : ");
		String password = scan.next().toLowerCase();
		User.accountCreation(userName, password);
		
		
		
		System.out.println("Thankyou for registering to eAuction! ");
		
		menu();
		
		
		
	}

	private void loginAccount() {
		// TODO Auto-generated method stub
		
	}
		
	
	
	
}
	

