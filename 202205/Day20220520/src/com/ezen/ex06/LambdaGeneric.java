package com.ezen.ex06;

@FunctionalInterface
interface Calculator<T>{
	T cal(T a, T b);
}

public class LambdaGeneric {
	public static void main(String[] args) {
		
		Calculator<Integer> c = (a, b) -> a+b;
		System.out.println(c.cal(10, 10));

		Calculator<Double> c1 = (a, b) -> a*b;
		System.out.println(c1.cal(1.2, 3.2));

	}

}
