package com.ezen.ex07;

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
	
	public static <T> void peekBox(Box<T> box) { //지네릭 메서드 기반, 반환타입 앞에 <T>를 입력해줘야함
		System.out.println(box);
	}
}

public class WildcardUnBoxer {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setOb("apple");
		Unboxer.peekBox(box);
		

	}

}
