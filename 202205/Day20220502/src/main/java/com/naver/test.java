package com.naver;

class A{
	int a=0;
	void funcA() {
		System.out.println("aaaa");
	}
	public A() {}
	public A(int a) {
		this.a = a;
	}
}
class B extends A{
	int b = 0;
	void funcA() {
		super.funcA();
		System.out.println("bbbb");
	}
	public B() {}
	public B(int a, int b) {
		super(a);
		this.b = b;
	}
}
class C extends B{
	int c = 0;
	
	void funcA() {
		super.funcA(); //오버라이딩 할때 super.funcA 하게되면 상위 클래스를 호출하여 출력
		System.out.println("cccc");
	}
	public C() {}
	public C(int a, int b, int c) {
		super(a,b);
		this.c = c;
	}
}

public class test {
	
	public static void main(String[] args) {
		
		A a = new C(100,200,300);//가능 >> 상위클래스가 하위클래스를 참조할 순 있지만,
//		C c = new A();			 //에러 >> 하위클래스가 상위클래스를 참조할 순 없다(본인의 기량을 다 펼칠 수 없기 때문)
//		a가 C에 있는 변수를 사용하려면 형변환 해야함
//		C c = (C)a;
		a.funcA(); //C 를 참조하고 있기 때문에 cccc가 출력됨
		
//		cc.funcB();
//		cc.funcC();
		
		
	}
	
}