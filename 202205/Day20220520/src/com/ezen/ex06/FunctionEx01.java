package com.ezen.ex06;

import java.util.function.Function;
// 입력 O, 출력 O
public class FunctionEx01 {

	public static void main(String[] args) {
		
		Function<String, Integer> f = s -> s.length();
		
		System.out.println(f.apply("java function"));
		System.out.println(f.apply("java"));
	}

}
