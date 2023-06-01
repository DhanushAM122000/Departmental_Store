package com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		System.out.println("Welcome to Snakes Departmental Store");
		System.out.println("-------------------------------------------------");
		Scanner scan=new Scanner(System.in);
		
		DepartmentalStore store=new DepartmentalStore();
		
		store.addProduct();
		
		int choice=1;
		while(choice==1) {
			store.displayproduct();
			
			store.byeproduct();
			
			System.out.println("-------------------------------------------------");
			System.out.println("Enter 1 to continue or any other number to Checkout");
			
			choice=scan.nextInt();
			
			
		}
		store.checkout();
	}
}
