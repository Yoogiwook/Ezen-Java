package com.ezen.ex02;

class Box<T>{
	private T ob;
	public void set(T o) { ob = o; }
	public T get() { return ob; }
}

class UnBoxer{
	// 제네릭 메소드
	// 제네릭 메소드 표시 : <T>, Box<T> : 반환형, T o : 매개변수
	public static <T> T makeBox(Box<T> box){
		return box.get();
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
		Box<String> sBox = new Box<>();
		sBox.set("Generic Method");
		
//		String str = UnBoxer.<String>makeBox(sBox);
		String str = UnBoxer.makeBox(sBox); //<String> 생략 가능
		System.out.println(str);
	}

}
