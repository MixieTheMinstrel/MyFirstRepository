package com.cody;

import com.simba.Class2;


public class Class1 {

	public static void main(String[] args) {
		greeting();
		fromCity();
	}
	
	private static void greeting(){
		System.out.println("Hello, stranger!");
	}
	
	private static void fromCity(){
		Class2 class2Object = new Class2();
		System.out.println(class2Object.name());
	}

}
