package floorConstruction.classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class ConstructionOrder {
	
	public void orderOfConstruction(Integer[]arr) {
		
		// creating a new object of stack class
		
		Stack <Integer>stack = new Stack<Integer>();
		
		// initializing variables and  arrays
		
		int j=0;
		int val=0;
		
		Integer[]sortedFloorSizes=arr.clone();
		
		// printing sortedfloorSizes array to check cloning operation
		
		//for (int i =0; i<arr.length;i++)
		
	//	System.out.println(sortedFloorSizes[i]);
		// sorting the input array in descending order
		
		Arrays.sort(sortedFloorSizes,Collections.reverseOrder());
		
		// going through all elements of the input array
		
		for(int i=0; i<arr.length; i++) {
			
			//checking for the largest size among elements 
			
			if(arr[i]==sortedFloorSizes[j]) {
				
				if(i==arr.length-1) 
				
					j=i;
				else
					
					j=i+1;
				
				
				// printing day number with appropriate assembly work
				
				System.out.println("day:"+(i+1));
				
				if (stack!=null) {
					
					// printing current floor sizes
					
					System.out.println(arr[i]+ " ");
					
					while (!stack.isEmpty()) {
						
						
						// popping the element from stack and assigning it to 'val'
						
						
						val=stack.pop();
						
						// checking for smaller floor sizes
						
						
						
						if(val>=sortedFloorSizes[i])
							
							// printing lower floor sizes on same day
							
							
							System.out.println(val +"");
						
						else {
							
							
							// adding element back to stack 
							
							stack.push(val);
							
							
							j= j-stack.size();
							
							break;
							
							
							
						}
						
					}
					System.out.println();
					
					
					
					}else
						//If stack is empty, print the correct floor size
	                    System.out.println(arr[i]);
				
					
				}else {
	            	//Printing the day number with no assembly work
					
	                System.out.println("Day: " + (i + 1));
	                System.out.println();
	                
	                
	                //Adding the element to the stack
	                
	                
	                stack.push(arr[i]);
					
					
			}
		
		
		
	}

	}
}
