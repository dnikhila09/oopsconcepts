package com.valuemomentum.training.exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class ArrayListExample {

	public static void main(String args[]) {
		
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		
		list.add("Nikhila");
		list.add("Yash");
		list.add("Nikky");
		list.add("Nikky");
		
		// System.out.println("first elemnt : "+list.get(1));	 
		// list.set(2, "valli");		 
		 //Sorting the list  
		//  Collections.sort(list);  
		 
	
		 Set s = new HashSet(list); 
		// Traversing list through Iterator
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*for(String Item:list)    
		    System.out.println(Item);    
		  
		 }*/  
	}
}


