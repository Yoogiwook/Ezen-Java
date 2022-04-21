import java.util.Scanner;

public class Day20220408 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) { 
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			} System.out.println();
	}
		
		
//		for(int i=2; i<=9; i++) {
//			
//			for(int j=1; j<=i; j++) {
//				System.out.println(i + "*" + j + "= " + i*j);
//				}
//			System.out.println();
//		}
		
// 2단 2줄만 출력, 3단은 3, 4단 4 ...
		
//		for(int i=1; i<3; i++) {	  //행, 줄
//			
//			for(int j=1; j<4; j++)  //열, 칸
//				System.out.print(i*j);  // 줄 바꿈용
//			
//			System.out.println();
//		}
		
		
//		int value = 0;
//		
//		for(int i=0; i<6; ++i)
//			System.out.println((int)(Math.random()*45) + 1);
		
		
		
//		1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 
//		100이상이 되는지 구하시오.
//		
//		int sum = 0;
//		int i = 0;
//		int sign = 1;
//		int tmp = 0;
//		
//		for(i=1 ; true; i++, sign = -sign) { // sign = 1,-1,1,-1... 반복
//			
//			tmp = i*sign;
//			sum += tmp;
//			
//			if(sum>=100)
//				break;
//		}
//		System.out.println("i : " + i + " tmp : " + tmp + " sum : " + sum);
				
		
		
//		1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
//		int sum = 0;
//		
//		for(int i=1; i<=20; i++) {
//			if(i%2 !=0 && i%3 !=0)
//				
//			sum += i; 
//		System.out.println(" sum : " + sum);
//		}
//		
		
		
//		System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
//		System.out.println("----------------------------------------------");
//		
//		for(int i=1; i<=10; i++)
//			System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n",
//								i,   2*i,  2*i-1, i*i, 11-i, i%3,  i/3);
		
		
		
//		int sum = 0;
//		
//		for (int i=1; i <= 10; i++) {
//			sum += i;
//			System.out.printf("1부터 %2d 까지의 합 : %2d%n", i, sum);
//		}  // printf -> %2d 를 이용하면 결과가 정렬되어 나옴
//		System.out.println("--------------------------");
//		sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//			System.out.println("1부터 " + i + " 까지의 합 : "+ sum);
//		}
		
		
//		char gender;
//		String regNo = "";
//		
//		System.out.println("당신의 주민번호를 입력하세요. (011231-1111222)>");
//		
//		Scanner scanner = new Scanner(System.in);
//		regNo = scanner.nextLine();
//		
//		System.out.println(regNo.charAt(0));
//		
//		gender = regNo.charAt(7); // 입력받은 번호의 8번째 문자를 gender에 저장
//		System.out.println("gender : " + gender);
//		
//		switch (gender) {
//		case 1: 
//		case 3:
//			System.out.println("당신은 남자입니다.");
//			break;
//		case 2: 
//		case 4:
//			System.out.println("당신은 여자입니다.");
//			break;
//		default:
//			System.out.println("유효하지 않은 주민등록번호입니다.");
//			;
//		}
		
		
				
	} //main의 끝

}
