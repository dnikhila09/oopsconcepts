package com.valuemomentum.training.exception;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Tom");
		al.add("jerry");
		al.add("john");
		al.add("jive");

		ListIterator<String> itr = al.listIterator();

		System.out.println("traversing ele in the forward direction");

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("traversing ele in backward direction");

		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
