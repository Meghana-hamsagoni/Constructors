package com.oops;
import java.util.Scanner;

public class Laptop {
	String brand;
	int ramSize;
	public Laptop(String b,int ram) {
		this.brand=b;
		this.ramSize=ram;
		
	}
	public void showSpecs () {
		System.out.println("Brand : " + brand);
		System.out.println("Ram Size :" + ramSize);
		
	}
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the brand name : \n");
		String userbrand = sc.nextLine();
		System.out.println("Enter the ram size : \n");
		int userram = sc.nextInt();
		Laptop obj= new Laptop("Lenovo", 16);
		obj.showSpecs();
		Laptop userInput= new Laptop(userbrand,userram);
		userInput.showSpecs();
		sc.close();
			
	}

}
