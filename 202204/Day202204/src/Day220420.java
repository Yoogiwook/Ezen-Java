import java.util.Arrays;
import java.util.Scanner;

public class Day220420 {

	public static void main(String[] args) {

//		0~3세 할인율 100%
//		4~13세 할인율 50%
//		14~19세 할인율 25%
//		20세~64세 할인율 0%
//		65세 이상 할인율 100%
//		조건문 처리
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이를 입력해주세요(0~100세 정수입력) >>");
//		int cost = 2500;
//		int age = sc.nextInt();
//				
//		if(age < 4 || age >= 65)
//			System.out.println(age + "세 "+"무료입니다.");
//			else if (age < 14) {
//				cost /= 2;
//				System.out.println(age + "세 " + cost + "원입니다."); 
//				}
//			else if (age < 20) {
//				cost *= 0.75;
//				System.out.println(age + "세 " + cost + "원입니다."); 
//				}
//			else if (age < 65) 
//				System.out.println(age + "세 " + cost + "원입니다."); 
//			else
//				System.out.println("정확한 값을 입력해주세요");
		
//		---------------------------------------------
//		int fee = 2500;
//		int age = 0;
//		double rate = 0.0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("나이 입력");
//		
//		age = sc.nextInt();
//		
//		if(age>=65)
//			rate = 0;
//		else if(age>=20)
//			rate = 1;
//		else if(age>=14)
//			rate = 0.75;
//		else if(age>=4)
//			rate = 0.5;
//		else if(age<4)
//			rate = 0;
//		else
//			System.out.println("정확한 값 입력");
//		
//		System.out.println((int)(fee*rate) +"원");
		
//		---------------------------------------------
		// 1. 1~100까지 총합 / 평균 구하기.
//		int sum=0;
//		double avg=0.0;
//		for(int i=0; i<=100; i++) {
//			sum += i;
//			avg = sum/(double)i;
//		}
//			System.out.println("총합 : " + sum);
//			System.out.println("평균 : " + avg);
//			
//		// 2. 1~100 2의 배수이면서 7의 배수 객수 출력 및 총합
//		sum=0; // sum 다시 사용해야하기 때문에 0으로 초기화
//		int count=0;
//		for(int i=0; i<=100; i++) {
//			if(i%2==0 && i%7==0) {
//				count++;
//				sum += i;
//			}
//		}
//		System.out.println("총합 : " + sum);
//		System.out.println("갯수 : " + count);
		
//		---------------------------------------------
		// 위 식에서 나온 i값을 배열에 집어넣기
//		int sum = 0;
//		int count = 0;
//		for(int i=1; i<=100; i++) {
//			if(i%2==0 && i%7==0) {
//				count++;
//			}		// count로 i의 갯수 구하기
//		}
//		int[] nArr = new int[count];//배열 크기를 모르니 count 값으로 배열 크기 책정
//		int j = 0; //[]안에 집어넣을 변수 j 생성
//		for(int i=1; i<=100; i++) {
//			if(i%2==0 && i%7==0) {
//				sum += i;
//				nArr[j++] = i; //변수 j값에 i값 집어넣기 
//			}
//		}
//			
//		System.out.printf("sum : %d, count : %d\n", sum, count);
//		System.out.println(Arrays.toString(nArr));
		
//		---------------------------------------------
//		선택적 정렬(Selection sort)
//		int[] nArr = {9,6,7,3,5};
//		int indexMin = 0;
//		
//		for(int i=0; i<nArr.length-1; i++) {
//			indexMin = i;
//			
//			for(int j=i+1; j < nArr.length; j++) { 
//				if(nArr[j] < nArr[indexMin]) 
//					indexMin = j;
//				}
//			
//		int tmp = nArr[indexMin];
//		nArr[indexMin] = nArr[i];
//		nArr[i] = tmp;
//		
//		System.out.println(i+1+"회전 "+Arrays.toString(nArr));
//		}
//		System.out.println(i+1+"회전 "+Arrays.toString(nArr));
//		System.out.println(Arrays.toString(nArr));
		
//		int[] nArr = {6, 5, 9, 7, 3};
//	      
//	      for(int i= 0 ; i < nArr.length-1 ; i++) {      
//	         
//	         int index = i;
//	         
//	         for(int j = i+1; j < nArr.length ; j ++) {
//	            
//	            if(nArr[index] > nArr[j]) index = j;
//	            if( nArr[index] != i) {
//	                  int tmp  = nArr[index];
//	                  nArr[index] = nArr[i];
//	                  nArr[i] = tmp;
//	               }
//	         }
//	            System.out.print(i + "회전");
//	            System.out.println(Arrays.toString(nArr));
//	         }
//	      System.out.println(Arrays.toString(nArr));

//		---------------------------------------------
//	private 다른곳에서 함수를 갖다 쓸 수 없음
//	public  다른곳에서 함수를 갖다 쓸 수 있음
		/*void add(int i, int j){} --> 함수 정의(몸체)
		반환형 함수이름  매개변수
		 ㅣ
		 ㅣ	void는 반환값이 없다.
		int 정수형 int를 리턴한다.
		double
		
		  add(10,20) ==> 함수 호출
		 함수이름(인자,인자)

		*1. 인자0, 반환0 2.인자0, 반환x 3. 인자x, 반환0 4. 인자x, 반환x
		*
		*두 정수를 더하는 기능으로 함수 표현
		*/
		
//		int num = add(10,20);
//		
//		System.out.println(num);
//		
//	}
//	static int add(int i, int j) {
//		return i+j;
//		--------------------------
//		add(10,20);
//		}
		
//	static void add(int i, int j) {
//			System.out.println(i+j);
//		}
//		---------------------------
//		int num = add();
//		System.out.println(num);
//	}
		
//	static int add() {
//		return 10+20;
//	}
//		-----------------------------
//		add();
//	}	
		
//	static void add() {
//		System.out.println(30);
//	}
//		---------------------------------
//		함수 불러와서 계산
		int fee = 2500;
		int age = input();
		double rate = feeCalcRate(age);
		output(age,fee, rate);
	}
	
	static int input() { //입력
		int age = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력(0~100세 정수 입력) >>");
		age = sc.nextInt();
		return age;
	}
	
	static double feeCalcRate(int age) { //할인율 계산
		double rate = 0.0;
			if(age>=65)
				rate = 0;
			else if(age>=20)
				rate = 1;
			else if(age>=14)
				rate = 0.75;
			else if(age>=4)
				rate = 0.5;
			else if(age<4)
				rate = 0;
			else
				System.out.println("정확한 값 입력 요망");
		return rate;
	}
	static void output(int age, int fee, double rate) { //출력
		System.out.println(age + "세 요금은 " + (int)(fee*rate)+ "원");
	}
}
