

abstract class A{  //추상 클래스 
	int a = 10;
	void test() {
		System.out.println("AAAAAAAAAA");
	}
	
	abstract void func(); //추상메서드
	abstract void func2();
	abstract void func3();
}

abstract class B extends A{

	@Override
	void func() { // 상속받는곳에 추상메서드가 있으면 상속받는 클래스도 하나는 가지고 있어야함.
		System.out.println("BBBBBBBBBBB");
	}
}

class C extends B{

	@Override
	void func2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void func3() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AbTest {
	
	public static void main(String[] args) {
//		A a = new A(); //추상클래스이기 때문에 객체 생성 불가능
		A a = new C(); //상속받은 B클래스는 A의 내용 사용 가능
		System.out.println(a.a);
		a.test();
		a.func();
	}
	
}