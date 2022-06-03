package com.ezen.ex05;

import java.util.Random;

@FunctionalInterface // << 함수형 인터페이스 => 추상메서드가 1개만 존재해야 함
interface Cenerator{
	int rand();
//	int max(); // 추상메서드가 1개만 존재해야함 2개 이상이면 람다식 사용 불가능
}

public class Lambda5 {
	public static void main(String[] args) {
		Cenerator gen = () -> {
		Random rand = new Random();
		return rand.nextInt(50);
		};
		
		int num = gen.rand();
		System.out.println(num);
		
	}
}
