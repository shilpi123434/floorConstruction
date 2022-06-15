package floorConstruction.main;

import java.util.Scanner;

import floorConstruction.classes.ConstructionOrder;

public class Driver {
	
	public static void main(String[]args) {
		
		// creating a new object of scanner class
		
		Scanner sc= new Scanner (System.in);
		
		// CREATINBG A NEW OBJECT OF CREATED CLASS
		
		ConstructionOrder floorCons = new ConstructionOrder();
		
		// taking input of floors from the user
		
		System.out.println("Enter the total no. of floors in the building :");
		int noOfFloors=sc.nextInt();
		
		
		// taking the floor sizes per day from the user using loop 
		
		
		Integer[] floorSize=new Integer[noOfFloors];
		for(int i =1; i<=noOfFloors;i++) {
			System.out.println("Enter floor size given on day :"+ i);
			floorSize[i-1]=sc.nextInt();
			
		}
		
		// comparing floor size and displaying appropriate output 
		
		System.out.println("The order of construction as follows:");
		floorCons.orderOfConstruction(floorSize);
		
		
		sc.close();
		
		
		
		
	}

}
