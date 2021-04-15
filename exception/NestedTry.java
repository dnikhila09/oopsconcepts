package com.valuemomentum.training.exception;

public class NestedTry {

	public static void main(String args[]) {
		try
		{
			try {
			    	System.out.println("Division");
			    	int b = 39 / 0;
			    }
			    catch (ArithmeticException e) 
			    {
			    	System.out.println(e);
			    }
			try {
				  int a[] = new int[5];
				  a[5] = 4;
				}
			    catch (ArrayIndexOutOfBoundsException e)
			    {
			    	System.out.println(e);
			    }

		} 
		catch (Exception e)
		{
			System.out.println("handeled");
		}

		System.out.println("end of program");
	}
}