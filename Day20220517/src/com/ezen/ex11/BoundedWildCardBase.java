package com.ezen.ex11;

class Box<T> {
	private T ob;

	public T getOb() { return ob; }

	public void setOb(T ob) { this.ob = ob; }

	@Override
	public String toString() {
		return ob.toString();
	}
}

class Toy {
@Override
	public String toString() {
		return "I am Toy";
	}	
}

class Robot extends Toy{}
class BoxHandler{										//bot 전달 대상은 Toy, Robot 가능
	public static void outBox(Box<? extends Toy> box) { //box에 전달 가능한 인스턴스는 Toy 또는 Toy를 상속한 아이들
		Toy t = box.getOb();					//box >> Box<Toy> or Box<Robot> 가능
		System.out.println(t);
//		box.setOb(t); // get만 가능하기 때문에 에러
	}
	
	public static void inBox(Box<? super Toy> box, Toy t) {
		box.setOb(t);						//box 대상은 Toy, Object 가능
		
//		Toy t2 = box.getOb(); // 에러
	}
}
public class BoundedWildCardBase {
	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
		
	
	}

}
