import java.util.Scanner;

public class Day220411 {

	public static void main(String[] args) {
	//조건문(if, switch), 반복문(for)	
		
//		int num = 1;
		
//		if(num>0) 
//			System.out.println("양수");
//		else if(num<0)
//			System.out.println("음수");
//		else if(num==0)
//			System.out.println("영");
//		else
//			System.out.println("숫자만 입력해주세요!");
		
//	---------------------------------------------
		
//		switch(num) {
//		case 1:
//			System.out.println("1111111111");
//			break;
//		case 2:
//			System.out.println("2222222222");
//			break;
//		case 3:
//			System.out.println("3333333333");
//			break;
//		case 4:
//			System.out.println("4444444444");
//			break;
//			default :
//				System.out.println("0000000000");
//	}
//		int sum = 0;
//		for(int i=2; i<=9; i++)
//			for(int j=1; j<=i; j++)
//				System.out.println(i*j);
		
//		-------------------------------------------
		
//		int i = 5;
//		
//		while(i-- !=0) {
//			System.out.println(i + "- I can do it.");
		
//		-----------------------------------------------
		
//		int num = 0, sum = 0;
//		System.out.println("숫자를 입력하세요. (예:12345)>");
//		
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		num = Integer.parseInt(tmp);
//		
//		while(num !=0) {
//			sum += num%10;
//			System.out.printf("sum=%3d num=%d%n", sum, num);
//			
//			num /=10;
//		}
//		System.out.println("각 자리수의 합:"+sum);
		
//		-------------------------------------------------
		
//		숫자 5개를 순차적으로 입력해서 입력한 순서대로 더하기
//		int sum = 0;	// 누적용
//		int i = 0;		// 회전용도	
//		int input;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(i++ < 5) {
//			System.out.println(i + "회 정수 입력 : ");
//			input = sc.nextInt();
//			
//			sum +=input;
//			System.out.println("sum : " + sum);
//					}
		
//		------------------------------------------------
		
//		int num;
//		int sum = 0;
//		boolean flag = true;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0입력)");
//		
//		while(flag) {
//			System.out.println(">>");
//			
//			String tmp = scanner.nextLine();
//			num = Integer.parseInt(tmp);
//			
//			if(num!=0) {
//				sum += num;
//			} else {
//				flag = false;
//			}
//		}	
//			System.out.println("합계 : "+ sum);
		
//		----------------------------------------
		
//		for(int i=1; i<=100; i++) {
//			System.out.printf("i=%d", i);
//			
//			int tmp = i;
//			
//			for( ; ; ) {
//				
//				
//				if(tmp%10%3==0 && tmp%10!=0)
//					System.out.print("짝");
//				
//				if((tmp /= 10)==0)
//					break;
//			}
//			System.out.println();
//	}
//			// 위 식과 아래식은 같은 식
//			for(int i=1; i<=100; i++) {
//				System.out.printf("i=%d", i);
//				
//				int tmp = i;
//			do {	// tmp%10 이 3의 배수인지 확인 (0 제외)
//				if(tmp%10%3==0 && tmp%10!=0)
//					System.out.print("짝");
//			} while((tmp/=10)!=0); // tmp /= 10은 tmp = tmp/10 과 동일
//			
//			System.out.println();
//	}
		
//	-----------------------------------------------
		
		//지역변수, 전역변수
//		int sum = 0;
//		int i = 1;
//		
//		for (i = 1; i <= 10; i++) {
//			
////			if(sum > 100)
////				break;
//			if(i%2 ==1)
//				continue;
//			sum += i;
//		}
//		System.out.println("회전횟수 : " + i +", "+ "sum : " + sum);
		
//	-------------------------------------------
		
//		int sum = 0;
//		int i	= 0;
//		
//		while(true) {
//			if(sum > 100)
//				break;
//			++i;
//			sum += i;
//		}
//		System.out.println("i = " + i);
//		System.out.println("sum = " + sum);
		
//	---------------------------------------
//		
//		for(int i=0; i<=10; i++) {
//			if (i%3==0)
//				continue;
//			System.out.println(i);
//		}
		
//	-----------------------------------------
		
//		abc : for(int i=1; i<=100; i++) {
//			
//			System.out.printf("i=%d ", i);
//			
//			int tmp = i;
//			
//			for ( ; ; ) {
//			
//				if(tmp%10%3==0 && tmp%10!=0)
//					System.out.println("짝");
//				
//				if((tmp/=10)==0)
//					break abc;
//			}
//		}
//	System.out.println("final");
	
//	---------------------------------------
	
//	사칙연산
//	sum(0) 총누적
//	+2
//	sum(2)
//	*3
//	sum(6)
//	/2
//	sum(3)
//	-10
//	sum(-7)
//  q --종료 (총합 계산)
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자입력(종료:0):");
			String tmp = sc.nextLine();
			int num = Integer.parseInt(tmp);
			if(num == 0) break;
			
			System.out.println("사칙연산 기호 : ");
			String str = sc.nextLine();
			char ch = str.charAt(0);
			
			switch(ch) {
			case '+':
				sum +=num;
				break;
			case '*':
				sum *=num;
				break;
			case '/':
				sum /=num;
				break;
			case '-':
				sum -=num;
				break;
			default:
				System.out.println("+,*,/,- 중 하나를 입력하세요.");
				
			}
		}
		System.out.println(sum);
		
		//equals,    ch(문자열) --> 문자로 변환해서 할수도 있다.
		
//		-----------------------------------------------
		
	} //main의 끝
}
