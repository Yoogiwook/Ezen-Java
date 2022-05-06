//상위클래스 찹조변수는 하위클래스 참조 가능
//하위클래스 참조변수는 하위클래스 참조 불가
//단, 상위클래스가 참조한 하위클래스를 하위클래스 참조변수에게 타입변환 후 참조하게 할 수 있다.
public class Test {

	public static void main(String[] args) {
		Object obj = new BB(new D());  //Object는 모든 클래스를 참조 할 수 있다 최상위 클래스이기 떄문에,
					//하지만 접근 가능한 자원은 본인에 한정되어있다. 접근 하려면 타입변환을 해줘야함
		BB b = (BB)obj;
		
		
		
//		AA a = new C();
//		C c = (C)a; // ==> 가능
////		----------------------
//		AA a = new B();
//		B b = (C)a; // ==> 불가능 상위클래스가 참조한 하위클래스를 참조해야함
//		C c = (B)a; // ==> 불가능 하위클래스가 상위클래스 참조 불가
		
		Integer a = 10;  
		Integer bb = new Integer(10);
		
		Number num = new Integer(10);
		System.out.println((Integer)num + 10);
		
	}

}

class D{
	int d;
}
class F{}
class AA{
	int a;
	void funcA() {}
}
class BB extends AA{
	int b;
	public BB(Object o) { // (Object o) 는 어떤 객체를 넣어도 상관없음
		if( o instanceof D) { // o에 D가 아닌 다른 클래스가 오면 타입변환이 불가능하게 설정
			D dd = (D)o; // int d;에 접근하기 위해 타입변환
			dd.d = 10;
		}else if(o instanceof F) {
			F f = (F)o;
		}
	}
}