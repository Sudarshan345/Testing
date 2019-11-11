package com.reg.Java8;

import java.util.function.Function;

public class FunctionalExe {

	public static void passFunction(Function<String, Integer> fun) {
		System.out.println("FunctionalExe.passFunction()");
		Integer i = fun.apply("12");
		System.out.println("i-->" + (i.intValue() + 1));
	}

	public static Integer converToInt(String s) {
		System.out.println("FunctionalEx.converToInt()" + s);
		return Integer.parseInt(s);
	}

	public static Function<String, Integer> getFunction() {
		System.out.println("FunctionalEx.f1()");
		return FunctionalExe::converToInt;
	}

	public static Function<String, Integer> getFunctionByLambda() {
		System.out.println("FunctionalEx.getFunctionByLambda()");
		return (x) -> Integer.parseInt(x);
	}

	public static Function<String, Integer> getFunctionByLambda1() {
		System.out.println("FunctionalEx.getFunctionByLambda1()");
		return (x) -> {
			System.out.println("FunctionalEx.getFunctionByLambda1()");
			return Integer.parseInt(x);
		};
	}

	public static void main(String args[]) {
		System.out.println("Main method........");

		passFunction(FunctionalExe::converToInt);

		System.out.println("Main method........2");

		passFunction((x) -> Integer.parseInt(x));

		System.out.println("Main method........3");
		passFunction((x) -> {
			System.out.println("FunctionalEx.inside arrow function");
			return Integer.parseInt(x);
		});

		Function<String, Integer> fun = getFunction();
		Integer val = fun.apply("15");
		System.out.println("FunctionalEx.main() Val->" + val);

		Function<String, Integer> fun1 = getFunctionByLambda1();
		Integer val1 = fun1.apply("20");
		System.out.println("FunctionalEx.main() Val->" + val1);

	}

}
