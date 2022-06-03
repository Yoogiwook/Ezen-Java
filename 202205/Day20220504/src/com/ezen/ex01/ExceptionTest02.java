package com.ezen.ex01;

public class ExceptionTest02 {

	public static void main(String[] args) {
		int a = 100;
		int b ;
		try {
			b = a/10;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("무조건 실행");
		}
	}
	static void method1() throws Exception{
		throw new Exception();
	}
}
