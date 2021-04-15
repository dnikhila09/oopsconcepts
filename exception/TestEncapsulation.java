package com.valuemomentum.training.exception;

public class TestEncapsulation {
	
	public static void main(String[] args) {  
		 
		Details d = new Details();
		
		d.setId(5368);
		d.setName("Nikhila Duvva");
		d.setEmail("dnikhila092gmail.com");
		
		System.out.println("Id : "+d.getId()+"\nName : "
		+d.getName()+"\nEmail : "
				+d.getEmail());
	}

}
