package com.ezen.ex03;

class Box<T extends Number>{ //T에 올 수 있는 대상은 Number이거나 Number를 상속한 객체만 가능
//class Box<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
	public int toIntValue() {
		return ob.intValue();  //intValue() 는 입력된 값을 정수로 변환해주는 메서드인데 <T>타입은 정수형이 아니기떄문에 에러
							   // 단, Number를 상속받는 상태면 가능
	}
}

class Person{}

public class BoundedBox {

	public static void main(String[] args) {
		
		Box<Double> aBox = new Box<>();
//		Box<String> sBox = new Box<>(); // String은 Number를 상속하고있지 않기 때문에 사용 불가
		aBox.set(100.5);
		
		System.out.println(aBox.get());
	}

}
