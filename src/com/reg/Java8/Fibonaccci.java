package com.reg.Java8;

public class Fibonaccci {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3, i, count = 10;
System.out.println("Hello world");
		System.out.print(n1 + " " + n2); // printing first two elements


		for (i = 2; i < count; ++i) {
			n3 = n1 + n2; // adding first two elements and storing another variable
			System.out.print(" " + n3); // printing the sum of first two numbers
			n1 = n2; // storing n2 in n1
			n2 = n3; // storing n3 in n2
		}

	}
 
}
