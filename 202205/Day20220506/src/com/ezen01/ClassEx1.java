package com.ezen01;

final class Card{
	String kind;
	int num;
	
	Card(){
		this("SPADE", 1);
	}
	
	Card(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	@Override // 오버라이딩 하지 않으면 주소값이 출력됨.
	public String toString() {
		return kind + ":" + num;
	}
}

public class ClassEx1 {

	public static void main(String[] args) throws Exception{
		Card c = new Card("HEART", 3); // 얘네 값을 출력하기위해
		Card c2 = Card.class.newInstance(); //deprecated >> 가급적이면 사용하지 말라는 뜻
		
		Class cObj = c.getClass();
//		Class cObj = Class.forName("com.ezen01.Card"); // DB와 연동할때 많이 쓸거임
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
	}

}
