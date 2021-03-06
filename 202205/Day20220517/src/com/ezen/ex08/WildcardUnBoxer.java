package com.ezen.ex08;

class Box<T> {
	private T ob;

	public T getOb() { return ob; }

	public void setOb(T ob) { this.ob = ob; }

	@Override
	public String toString() {
		return ob.toString();
	}
}

class Unboxer{
	public static <T> T openBox(Box<T> box) {
	return box.getOb();
	}
	
	public static void peekBox(Box<?> box) {  //와일드카드 기반 메서드 정의, 반환타입앞에 <T>를 안써도 됨
		System.out.println(box);
	}
}

public class WildcardUnBoxer {
	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.setOb(100);
		Unboxer.peekBox(box);
		

	}

}
