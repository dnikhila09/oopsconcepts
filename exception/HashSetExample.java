package com.valuemomentum.training.exception;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	 public static void main(String args[]){  
		  
		  HashSet<String> set=new HashSet<String>();  
		  set.add("Nikhila");  
		  set.add("Yash");  
		  set.add("Valli");
		  set.add("Nikhila");  
		 
		  System.out.println("Before deleting elements are: "+set);  
		  
		   set.remove("Valli");  
		   
		  System.out.println("After adding element "+set);
		  
		  if(set.contains("Yash"))
		  {
			  System.out.println("Yash contains");
		  }
		  
	//	  set.clear();

		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext())
		  {  
		   System.out.println(itr.next());  
		  }  
		 }  

}
