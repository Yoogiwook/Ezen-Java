package com.ezen.ex10;

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
	
	public static void peekBox(Box<? super Integer> box) {  //와일드카드 상한제한, Integer, Number, Object 가능  ,set만 가능
		System.out.println(box);
	}
}

public class LowerBoundedWildcard {
	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.setOb(123);
		Unboxer.peekBox(box); //box가 Integer이거나 Integer의 조상이어야만 가능
		
		Box<Number> box2 = new Box<>();
		box2.setOb(12.4);
		Unboxer.peekBox(box2); //box가 Integer이거나 Integer의 조상이어야만 가능

		Box<Object> box3 = new Box<>(); //Object는 최상위 클래스이기 때문에 아무거나 다 집어넣을 수 있음
		box3.setOb("String");
		Unboxer.peekBox(box3); //box가 Integer이거나 Integer의 조상이어야만 가능
	}

}
