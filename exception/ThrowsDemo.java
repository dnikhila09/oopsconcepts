package com.valuemomentum.training.exception;

public class ThrowsDemo {

	void Division()  throws ArithmeticException{
		int a = 45, b = 0, rs;
		rs = a / b;
		System.out.println("result is:" + rs);
	}

	public static void main(String[] args) {
		ThrowsDemo T = new ThrowsDemo(); 
		/*
		 * 
		 * ThrowsDemo T = new ThrowsDemo(); try {
		 * 
		 * T.Division();
		 * 
		 * } catch (ArithmeticException Ex) { System.out.println("error:" +
		 * Ex.getMessage()); } System.out.println("end of the program");
		 */
		T.Division();	
	}
}