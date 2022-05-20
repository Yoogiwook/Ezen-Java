package com.ezen.ex01;

interface Printable{
	void print();
}

class Papers{
	private String con;
	public Papers(String s) { con = s; }
	
	public Printable getPrinter() {
		
		//local class : 메서드 안에 있는 클래스 member class보다 은닉 정도가 심함
		class Printer implements Printable{
			public void print() {
				System.out.println(con);
			}
		}
		return new Printer();
	} 
	
}
public class LocalClass1 {

	public static void main(String[] args) {
		Papers p = new Papers("message java!!");
		Printable prn = p.getPrinter();
		prn.print();
		
		
	}

}
