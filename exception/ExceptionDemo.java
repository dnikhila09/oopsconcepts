package com.valuemomentum.training.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
	
		String languages[]= {"C++","C","Java","perl","python"};
		
		try {
			for(int c=0;c<=languages.length;c++)
			{
				System.out.println(languages[c]);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		//	System.out.println(e.printStackTrace());
		//	System.out.println(e.);

		
		}
		
	}

}
