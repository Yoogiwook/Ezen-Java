import java.util.Arrays;
import java.util.Scanner;

public class Day220413 {

	public static void main(String[] args) {  //jvm이 호출
		// 입력(X), 출력(O)
//		add(); // 함수 호출
//		
//		System.out.println("프로그램 종료");
//	}
//	
//	// 			void(반환형) add(함수이름)
//	public static void add() {    // ---> 함수 정의, 함수 몸체
//	
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//			
//		System.out.println("두 수 합은 : " + (num1+num2));
//		
//	}
//	----------------------------------------------------	
		// 입력(O), 출력(X)
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		add(num1, num2);
//		
//		System.out.println("프로그램 종료");
//	}
//	
//	public static void add(int num1, int num2) {
//	
//		System.out.println("두 수 합은 : " + (num1+num2));
//	}
		
//	--------------------------------------------------
	// 입력(O), 출력(O)
//		Scanner sc = new Scanner(System.in);
//	
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//	
//		int result = add(num1, num2);
//	
//		System.out.println("두 수 합은 : " + result);
//		System.out.println("프로그램 종료");
//	}
//
//	public static int add(int num1, int num2) {
//
//		return num1+num2;
//	}
//	----------------------------------------------------
	// 입력(X), 출력(O)
//		double result = add();
//	
//		System.out.println("두 수 평균은 : " + result);
//		System.out.println("프로그램 종료");
//}
//
//	public static double add() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//	
//		return (num1+num2)/2.0;
//	}
//	-----------------------------------------------------
//		예제 5-1
//		int[] score = new int[5];
//		int k = 1;
//		
//		score[0] = 50;
//		score[1] = 60;
//		score[k+1] = 70;	// score[2] = 70
//		score[3] = 80;
//		score[4] = 90;
//		
//		int tmp = score[k+2] + score[4]; // int tmp = score[3] + score[4]
//		
//		// for 문으로 배열의 모든 요소를 출력한다.
//		for(int i=0; i<score.length; i++) { //score.length 를 이용하면 편함
//			System.out.printf("score[%d]:%d%n", i, score[i]);
//		}
//		System.out.printf("tmp:%d%n", tmp);
//		
//		System.out.printf("score[%d]:%d%n", 7, score[7]); 
//		// 위 식은 index 범위를 벗어난 값
//	---------------------------------------------------------
//		예제 5-2
//		int[] iArr1 = new int[10];
//		int[] iArr2 = new int[10];
////		int[] iArr3 = new int[]{100, 95, 80, 70 ,60};		
//		int[] iArr3 = {100, 95, 80, 70, 60};
//		char[] chArr = {'a', 'b', 'c', 'd'};
//		
//		for(int i=0; i<iArr1.length; i++) {
//			iArr1[i] = i+1;
//		}
//		for(int i=0; i<iArr2.length; i++) {
//			iArr2[i] = (int)(Math.random()*10)+1;
//		}
//		for(int i=0; i<iArr1.length; i++) {
//			System.out.print(iArr1[i]+",");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(iArr2)); // for 문을 사용하지않고도 
//		System.out.println(Arrays.toString(iArr3)); // 저장되어있는 전체 
//		System.out.println(Arrays.toString(chArr)); // 값을 출력가능
//		System.out.println(iArr3); // iArr3 의 주소값이 출력됨
//		System.out.println(chArr); // 캐릭터값은 유일하게 값이 출력됨

//	-------------------------------------------------------------
//		배열의 복사
//		int[] iArr1 = new int[5]; // iArr1 방이 5칸 -> 10칸으로 확장
//		
//		int[] tmp = new int[iArr1.length*2];
//		
//		for(int i=0; i<iArr1.length; i++) {
//			iArr1[i] = (int)(Math.random()*10)+1;
//		}
//		
//		System.out.println(Arrays.toString(iArr1));
//		
//		for(int i=0; i<iArr1.length; i++)
//			tmp[i] = iArr1[i];
//		
//		iArr1 = tmp;
//		
//		System.out.println(Arrays.toString(iArr1));
		
//	-------------------------------------------------------------
//		배열의 복사 실습 // double 타입 방 10 -> 20으로 늘리기
//		double[] dArr = new double[10];
//		
//		for(int i=0; i<dArr.length; i++) 
//			dArr[i] = (Math.random());
//		
//		for(int i=0; i<dArr.length; i++) 
//			System.out.printf("%.2f%n", dArr[i]);
//		
//		double[] tmp = new double[dArr.length * 2];
//
//		for(int i=0; i<dArr.length; i++) 
//			tmp[i] = dArr[i];
//		
//		dArr = tmp;
//		System.out.println("----------------------------");
//		for(int i=0; i<dArr.length; i++) 
//			System.out.printf("%.2f%n", dArr[i]);
		
//	-------------------------------------------------------------
//		예제 5-4
//		char[] abc = {'A', 'B', 'C', 'D'};
//		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//		System.out.println(abc);
//		System.out.println(num);
//		
//		//배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
//		char[] result = new char[abc.length+num.length];
//		System.arraycopy(abc, 0, result, 0, abc.length);
//		System.arraycopy(num, 0, result, abc.length, num.length);
//		System.out.println(result);
//		
//		//배열 abc를 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
//		System.arraycopy(abc, 0, num, 0, abc.length);
//		System.out.println(num);
//		
//		// num의 index6 위치에 3개를 복사
//		System.arraycopy(abc, 0, num, 6, 3);
//		System.out.println(num);
		
//	-------------------------------------------------------------
//		int[] abc = {10,20,30,40,50};
//		int[] abc2 = {1,2,3,4,5,6,7,8,9,};
////		int[] abc2 = {1,2,30,40,50,6,7,8,9};
//	
//		System.out.println(Arrays.toString(abc));
//		System.out.println(Arrays.toString(abc2));
//		
//		System.arraycopy(abc, 2, abc2, 2, 3);
//		System.out.println(Arrays.toString(abc2));
		
//	-------------------------------------------------------------
		//정수형 배열 5개 선언
		//초기화는 랜덤함수 통해서 1~100 사이값을 저장 및 출력
		//최대값
		int[] num = new int[5];
		
		for(int i=0; i<num.length; i++)
			num[i] = (int)(Math.random()*99)+1;
		
		System.out.println("기본 : " + Arrays.toString(num));
		
		//최대값 및 최소값 계산 및 출력
		
		int max = num[0];
		int min = num[0];
		
		for(int i=0; i<num.length; i++) {

			if(max < num[i])
				max = num[i];

			if(min > num[i])
				min = num[i];
		} 
		System.out.println("max : " + max);
		System.out.println("min : " + min);

		//Sort(정렬) - 내림차순
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++)
				if(num[i]>num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
				
		}
		System.out.println("내림차순 정렬 : " + Arrays.toString(num));
	
		//오름차순 정렬
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++)
				if(num[i]<num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
		}
		System.out.println("오름차순 정렬 : " + Arrays.toString(num));
		
		// 가장 이상적인답.
//		for(int i=0; i<num.length-1; i++) {
//			for(int j=i+1; j<num.length; j++)
//				if(num[i]<num[j]) {
//					int tmp = num[i];
//					num[i] = num[j];
//					num[j] = tmp;
//			}
//		}
	}
}