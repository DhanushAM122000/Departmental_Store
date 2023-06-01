package com;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStore {
	
	LinkedHashMap<Integer, Product> db=new LinkedHashMap<Integer,Product>();
	
	Scanner scan=new Scanner(System.in);
	
	int totalBill=0;
	
	public void addProduct(){
		
		db.put(1, new Product("Chocolates",10,10));
		db.put(2, new Product("Biscuits",20,20));
		db.put(3, new Product("Icecream",30,50));
		
	}
	
	public void displayproduct() {
		
		Set<Integer> keys=db.keySet();
		
		for(Integer key:keys) {
			
			Product p=db.get(key);
			System.out.println("Enter "+key+" to order "+ p.getName());
			System.out.println("Avaliable Quantity "+p.getQuantity());
			System.out.println("Cost Rs. "+p.getCost());
			System.out.println("-------------------------------------------------");
		}
		
	}
	
	public void byeproduct() {
		System.out.println("Enter your Choice:");
		int choice =scan.nextInt();
		Product p=db.get(choice);
		
		if(p!=null) {
			System.out.println("Enter Quantity");
			int quantity=scan.nextInt();
			
			if(quantity<=p.getQuantity()) {
				int Productcost=quantity*p.getCost();
				
				totalBill=totalBill+Productcost;
				
				p.setQuantity(p.getQuantity()-quantity);
				System.out.println("Order "+quantity+" "+p.getName());
				System.out.println("Current Product Cost: Rs. "+Productcost);
				System.out.println("Total Bill as of now: "+ totalBill);
			}
			else {
				System.out.println("Invalid Quantity");
				
			}
		}
		else {
			System.out.println("Invalid choice");
		}
			
	}
	
	public void checkout() {
		
		System.out.println("Total Bill Rs. "+totalBill);
		System.out.println("Thank you for Shopping");
		
	}

}
