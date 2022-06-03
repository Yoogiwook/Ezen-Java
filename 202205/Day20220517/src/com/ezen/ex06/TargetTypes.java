package com.ezen.ex06;

class Box<T> {
	protected T ob;

	public T getOb() { return ob; }

	public void setOb(T ob) { this.ob = ob; }
}

class EmptyBoxFactory {
	public static <T> Box<T> makeBox(){ //지네릭 메서드 , 객체 생성 없이 클래스이름.메서드이름 으로 접근가능
		Box<T> box = new Box<T>();
		return box;
	}
}
public class TargetTypes {

	public static void main(String[] args) {
		Box<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
		
		iBox.setOb(25);
		
		System.out.println(iBox.getOb());
		
	}

}
