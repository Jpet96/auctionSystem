package ooSystems;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class System1 {
	
	//creates a scanner object 
private static final Scanner Scan = new Scanner(System.in);
	

public static void main (String[] args) throws Exception {
	
	String choice = ""; 
	do {
	
	System.out.println("---------- MENU ----------");
	
	// GUI spacing 
	System.out.println("");

	
	
	System.out.println("-- 1. [L]og in --");
	System.out.println("-- 2. [C]reate Account --");
	System.out.println("-- 3. [B]rowse Auctions--");
	System.out.println("-- [Q]uit --");
	//System.out.println("-- 1. TODO --");
	//System.out.println("-- 1. TODO --");
	
	// user choice 
	choice = Scan.next().toUpperCase();
	
	switch (choice) {
	case "1" :
	case "L" : {
		loginAccount();
		break;
	}
	case "2" :
	case "C" : {
		createAccount();
		break;
	}
	case "3":
	case "B": {
		browseAuctions();
		break;
		} 
	} 
		
	} while (!choice.equals("Q"));
	

	}
private static void browseAuctions() {
	// TODO Auto-generated method stub
	
}


private static void createAccount() {
	// TODO Auto-generated method stub
	
}


private static void loginAccount() {
	// TODO Auto-generated method stub
	
}










}
