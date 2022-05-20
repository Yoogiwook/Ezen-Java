package com.ezen.ex04;

interface Printable{ void print(String s); }

class Printer implements Printable{

	@Override
	public void print(String s) { System.out.println(s); }
	
}


public class Lambda1 {
	public static void main(String[] args) {
		Printable prn = new Printer(); //printer() 는 메서드 print() 에 접근하기위해서 만든것일 뿐 별 쓸모 없음
		prn.print("java is lambda!!");
		
	}

}
