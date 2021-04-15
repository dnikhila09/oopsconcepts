package com.valuemomentum.training.exception;

class Animall 
{
	void eat()
	{
		System.out.println("eating...");
	}
}

class Dogg extends Animall
{
	void eat() 
	{
		System.out.println("eating bread...");
	}
}

class Cat extends Animall
{
	void eat()
	{
		System.out.println("eating rat...");
	}
}

class Lion extends Animall
{
	void eat()
	{
		System.out.println("eating meat...");
	}
}

class PolymorphismR {
	public static void main(String[] args) {
		Animall a = new Dogg();//upcasting
		a.eat();
		Animall a1 = new Cat();
		a1.eat();
		Animall a2 = new Lion();
		a2.eat();
	}
}
