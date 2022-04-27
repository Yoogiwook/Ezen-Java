
public class TestVariables2 {

	public static void main(String[] args) {
//		Variables2 var = new Variables2();
//		System.out.println(var.iv);

		System.out.println(Variables2.cv);  //클래스 변수는 객체 생성 하지않고 
							//  접근 가능 >> 이유는 객체 생성 전에 메모리 공간 올라가있음
//		Variables2 var2 = new Variables2();
//		var2.method();  //객체 생성 후 접근 가능
		
//		Variables2.method2(); //static 이 붙어서 객체 생성 안하고도 접근 가능
		
		
	}

}

	class Variables2 {
		int iv; 		//인스턴스변수, 멤버변수
		final static int cv = 100;	//클래스변수, 정적변수
				//클래스 변수는 사용 안하는게 좋음 아무나 수정 할 수 있기 때문에
				//final 을 붙이게 되면 수정 불가능
		void method() {
			int lv = 0;	//지역변수
		}
		
		static void method2() {
			int lv = 0;	//지역변수
			System.out.println("lv = " + lv);
		}
	}