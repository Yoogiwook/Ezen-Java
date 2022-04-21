
public class Day220412 {

	public static void main(String[] args) {
		//249p

		//함수는 왜 만들까?
		//수정을 편하게 하기위해, 중복제거, 코드를 짧게 할수있게

		//함수가 존재하면 반드시 다른 곳(main등에서) 호출을 해야한다.
		
		// 1) 함수에서 입력(X), 출력(X)
//		System.out.println("main() 함수!!");
//		
//		sub();  //함수 호출 문장
//		
//		System.out.println("main()2 함수!!");
//	} // main 의 끝
		// 1)
//	public static void sub() {
//		System.out.println("서브 함수 입니다.");
//	} // sub 의 끝
//		---------------------------------------
		// 2) 함수에서 입력(O), 출력(X)
//		
//		double dnum = 2.5;
//		int num2 = 5;
//
//		System.out.println("main() 함수!!");
//		
//		sub(dnum,num2);  //함수 호출 문장  --> 인자값
//		
//		System.out.println("main()2 함수!!");
//	} // main 의 끝
		// 2) 인자값과 매개변수는 같은 타입의 함수여야한다.
//	public static void sub(double i, int j) {  // --> 매개변수
//		System.out.println("두 수의 합은 " + (i + j) );
//	} // sub 의 끝
//		----------------------------------------
		// 3) 함수에서 입력(X), 출력(O)
//		
//		double dnum = 2.5;
//		int num2 = 5;
//
//		System.out.println("main() 함수!!");
//		
//		double n = sub();  //함수 호출 문장  --> 인자값
//		
//		System.out.println("결과 값은 " + n);
//		
//	} // main 의 끝 
//			
//	// 3)
//	//void 자리에는 반환형이 온다 --> void는 반환값이 없다는 것을 명시
//	//sub는 함수 이름 --> 변수이름 중에서 명명한다.
//	public static double sub() {
//		
//		double dnum = 12.5;
//		
//		System.out.println("sub() 함수...");
//		
//		return dnum;
//	
//	} // sub 의 끝
//	----------------------------------------------
		// 4) 함수에서 입력(O), 출력(O)
		
		int n = 5;
		int n2 = 10;
		System.out.println("main() 함수!!");
		
		int result = sub(n, n2);
	
		System.out.println("결과 값은 " + result);
	} // main 의 끝
	
	public static int sub(int n, int n2) {

		System.out.println("sub() 함수...");
		
		return n*n2;
	} // sub 의 끝

	
	
}
