import java.util.Scanner;

public class Day220415 {

	public static void main(String[] args) {
//		버스의 기본요금은 1500이라고 가정
//		
//		나이는 랜덤함수로 입력받음.
//		0~3세 할인율 100%
//		4~13세 할인율 50%
//		14~19세 할인율 25%
//		20세 이상 할인율 0%
//		65세 이상 할인율 100%
//		
//		버스요금 계산
//		int age = 0;
//		int cost = 1500;
//		int dis = 0;
//		
//			age = (int)(Math.random()*100)+1;
//			if(age <= 3) {
//				System.out.printf("age = %d세 무료입니다.", age);
//			}
//			else if(age <= 13) {
//				dis = cost/2;
//				System.out.printf("age = %d세, %d원 입니다.", age, dis);
//				}
//			else if(age <= 19) {
//				dis = (int)(cost*0.75);
//				System.out.printf("age = %d세, %d원 입니다.", age, dis);
//			}
//			else if(age <= 64) {
//				dis = cost;
//				System.out.printf("age = %d세, %d원 입니다.", age, dis);
//			}
//			else
//				System.out.printf("age = %d세 무료입니다.", age);
		
//		강사님 답
//		int age;
//		int fee = 1500;
//		double rate = 0;
//		
//		age = (int)(Math.random()*120)+1;
//		
//		if(age>=65)
//			rate = 0.0;
//		else if(age >= 20)
//			rate = 1.0;
//		else if(age >= 14)
//			rate = 0.75;
//		else if(age >= 4)
//			rate = 0.5;
//		else
//			rate = 0.0;
//		
//		System.out.println("나이 : "+ age + " 최종요금 : " + (int)(fee*rate)+"원");
		
//		-----------------------------------------------------
		
//		if문을 사용하여 다섯 개 정수를 입력 받아서 가장 큰 수를 출력하는 프로그램 작성
//		입력받는 숫자는 0 ~ 100 사이값만 5개 입력받아서 큰 수 구하기 
		
//		System.out.println("숫자 5개를 입력하세요.");
//		Scanner sc = new Scanner(System.in);
//		int max = 0;
//		int num = 0;
//		String tmp;
//		
//		for(int i=0; i<5; i++) {
//			 tmp = sc.nextLine();
//			 num = Integer.parseInt(tmp);
//			 					 
//		if(0 > num || 100 < num) {
//				 System.out.println("0부터 100사이 값만 입력해주세요.");
//				 num = 0;
//				 --i;
//				 }
//		if(max < num)
//			max = num;
//		}
//		System.out.println("max : "+ max);
	
//		강사님 답
		
//		Scanner sc = new Scanner(System.in);
//		int num, max = 0, i = 0;
//		String tmp;
//		
//		System.out.println("정수 5회 입력 : ");
//		while(i<5) {
//			tmp = sc.nextLine();
//			num = Integer.parseInt(tmp); //안정성을 위해선 이 식을 사용하는게 좋음.
//			
//		if( num >= 0 && num < 101) {
//			if(max < num) max = num;
//			i++;
//		} else {
//			System.out.println("0이상 100이하만 입력가능!");
//			}
//		}
//		System.out.println("최대값 : "+ max);
		
//		-----------------------------------------------------
		//복습
		
//		for(int i=1; i<3; i++)		// i= 1,2,3(탈출)
//			for(int j=1; j<4; j++)	// j= 1,2,3,4(탈출)
//				System.out.println(i*j);
		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<=i; j++)  
//		System.out.print("*");
//			System.out.println();
//			}
		
//		for(int i=0 ; i<5; i++) {
//	         for(int j = i; j<5 ; j++)
//	            System.out.print("*");
//	         System.out.println();
//	      }
		
//		for(int i=0 ; i<5; i++) {
//	         for(int j = 0; j<5-i ; j++)
//	            System.out.print("*");
//	         System.out.println();
//	      }
//    *
//   **
//  ***
// ****		
//*****		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i+j >=4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		}

}
