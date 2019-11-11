package com.reg.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
interface Sayable {
	String say(String message);

}

public class LambdaExpressionExample8 {
	public static void main(String[] args) {

		// You can pass multiple statements in lambda expression
		Sayable person = (message) -> {
			String str1 = "I would like to say, ";
			String str2 = str1 + message;
			return str2;
		};
		System.out.println(person.say("time is precious."));

		List<String> list = new ArrayList<String>();
		list.add("su");
		list.add("d");
		list.add("harsha");
		list.add("n");

		System.out.println("For each loop example.......");
		list.forEach(k -> System.out.println(k));

		List<Product> productList = new ArrayList<Product>();

		// Adding Products
		productList.add(new Product(1, "HP Laptop", 25000f));
		productList.add(new Product(3, "Keyboard", 300f));
		productList.add(new Product(2, "Dell Mouse", 150f));

		System.out.println("Sorting on the basis of name...");

		// implementing lambda expression
		Collections.sort(productList, (p1, p2) -> {
			return p1.name.compareToIgnoreCase(p2.name);
		});
		for (Product p : productList) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}

	}
}

class Product {
	int id;
	String name;
	float price;

	Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
