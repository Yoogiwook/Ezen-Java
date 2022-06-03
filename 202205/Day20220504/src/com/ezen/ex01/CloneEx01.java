package com.ezen.ex01;

class Point implements Cloneable{
	int x,y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x +", y="+ y;
	}
	
	public Object clone() { // protected를 public으로 바꿔줘야함
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		return obj;
	}
}

public class CloneEx01 {

	public static void main(String[] args) {
		Point  original = new Point(3, 5);
		Point copy = (Point)original.clone();
		Point copy2 = original;
		
		original.x = 10;
		original.y = 20;
		copy.x = 100;
		copy.y = 200;
		System.out.println(original);
		System.out.println(copy);
		System.out.println(copy2);
	}

}
