package com.ezen.ex01;

// E : Element
// K : Key
// N : Number
// T : Type
// V : Value
class DBox<L,R>{
	private L left;
	private R right;
	
	public void set(L l, R r) {
		left = l;
		right = r;
	}
	@Override
	public String toString() {
		return left + " & " + right;
	}
}

public class MultiTypeParam {
	public static void main(String[] args) {
		
		DBox<String, Integer> box = new DBox<String, Integer>();
		
		box.set("Apple", 20); // << 이렇게 써도 new Integer(20) 으로 오토박싱 해줌
		System.out.println(box);
		box.set("Apple2", new Integer(50));
		System.out.println(box);
		
		
	}

}
