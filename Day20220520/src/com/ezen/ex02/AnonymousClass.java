package com.ezen.ex02;

interface Printable{
	void print();
}

class Papers{
	private String con;
	public Papers(String s) { con = s; }
	
	public Printable getPrinter() {
		return new Printable() { // 익명 클래스의 정의와 인스턴스 생성
		public void print() { // Printable은 인터페이스인데 구현부(몸체)가 생기면서 객체를 생성 할 수 있게됨
			System.out.println(con);
			}
		};
	}
}
public class AnonymousClass {

	public static void main(String[] args) {
		Papers p = new Papers("message java!!");
		Printable prn = p.getPrinter();
		prn.print();
		
		
	}

}
