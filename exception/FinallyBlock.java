package com.valuemomentum.training.exception;

public class FinallyBlock {

	public static void main(String args[]) {
		
		try 
		{
			int data = 30 / 0;
			//System.out.println(data);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println(e);
		} 
		finally
		{
			System.out.println("finally block is  executed");
		}
		
		System.out.println("end...");
	}

}
