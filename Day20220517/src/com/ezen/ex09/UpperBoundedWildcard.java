package com.ezen.ex09;

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
	
	public static void peekBox(Box<? extends Number> box) {  //와일드카드 하한제한, get만 가능
		System.out.println(box);
	}
}

public class UpperBoundedWildcard {
	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.setOb(123);
		System.out.println(box.getOb());
		Unboxer.peekBox(box); //box가 Number거나 Number를 상속받는 자손들이어야만 가능
		

	}

}
