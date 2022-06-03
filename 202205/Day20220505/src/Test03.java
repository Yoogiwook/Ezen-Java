
public class Test03 {

	public static void main(String[] args) {
		//메서드 오버라이딩 --> 자신이 참조하고 있는 곳에 있는 메소드가 출력됨
		A a = new A();
		a.test();
		a.testA();
		
		A a1 = new B();
		a1.test();
		a1.testA();
		A a2 = new C();
		a2.test();
		a2.testA();
		
//		System.out.println(a2.a);

		B bb = (B)a1;
		bb.testA();
		bb.testB();
		
		System.out.println(bb.a);
		System.out.println(bb.b);
		
//		C cc = a1(x)  // C cc = new B(); ==> 하위클래스가 상위클래스 참조할 수 없다.
//		C cc = a(x) // C cc = new A();
		C cc = (C)a2;  // C cc = new C();
		System.out.println(cc.a);
		cc.testA();
		
		
//		B b = new A(); // 하위클래스는 상위클래스 참초 불가
		B b1 = new B();
		B b2 = new C();
//		System.out.println(b2.a);

//		C c = new A(); // 하위클래스는 상위클래스 참초 불가
//		C c1 = new B();// 하위클래스는 상위클래스 참초 불가
		C c2 = new C();
//		System.out.println(c2.a);
		
	}

}

class A{
	int a=1;
	public A() {}
	public A(int a) {
		this.a = a;
	}
	void testA(){
		System.out.println("testA");
	}
	void test(){
		System.out.println("testA");
	}
}

class B extends A{
	int b=2;
	public B() {}
	public B(int a, int b) {
		super(a);
		this.b = b;
	}
	void testB(){
		System.out.println("testB");
	}
	void test(){
		System.out.println("testB");
	}
}

class C extends B{
	int c=3;
	public C() {}
	public C(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}
	void testC(){
		System.out.println("testC");
	}
	void test(){
		System.out.println("testC");
	}
}