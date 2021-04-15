package com.valuemomentum.training.exception;

class Mango {
	String color = "green";
}

class Apple extends Mango {
	String color = "Red";

	void dispColor() {
		System.out.println(color);// prints color of Apple class
		System.out.println(super.color);// prints color of Mango class
	}
}

class SuperKeyword {
	public static void main(String args[]) {
		Apple a = new Apple();
		a.dispColor();
	}
}
