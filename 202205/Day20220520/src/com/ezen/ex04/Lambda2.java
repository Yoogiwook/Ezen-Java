package com.ezen.ex04;

interface Printable2{ void print(String s); }

public class Lambda2 {
	public static void main(String[] args) {
		Printable2 prn = new Printable2() { //인터페이스를 객체로 생성하면서 구련부를 만들어 코드를 직관적으로 볼 수 있도록 함
			public void print(String s) {
				System.out.println(s); 
				}
		};
		prn.print("java is lambda2!!");
		
	}

}
