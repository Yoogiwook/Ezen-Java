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
		
// 2�� 2�ٸ� ���, 3���� 3, 4�� 4 ...
		
//		for(int i=1; i<3; i++) {	  //��, ��
//			
//			for(int j=1; j<4; j++)  //��, ĭ
//				System.out.print(i*j);  // �� �ٲ޿�
//			
//			System.out.println();
//		}
		
		
//		int value = 0;
//		
//		for(int i=0; i<6; ++i)
//			System.out.println((int)(Math.random()*45) + 1);
		
		
		
//		1+(-2)+3+(-4)+... �� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 
//		100�̻��� �Ǵ��� ���Ͻÿ�.
//		
//		int sum = 0;
//		int i = 0;
//		int sign = 1;
//		int tmp = 0;
//		
//		for(i=1 ; true; i++, sign = -sign) { // sign = 1,-1,1,-1... �ݺ�
//			
//			tmp = i*sign;
//			sum += tmp;
//			
//			if(sum>=100)
//				break;
//		}
//		System.out.println("i : " + i + " tmp : " + tmp + " sum : " + sum);
				
		
		
//		1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
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
//			System.out.printf("1���� %2d ������ �� : %2d%n", i, sum);
//		}  // printf -> %2d �� �̿��ϸ� ����� ���ĵǾ� ����
//		System.out.println("--------------------------");
//		sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//			System.out.println("1���� " + i + " ������ �� : "+ sum);
//		}
		
		
//		char gender;
//		String regNo = "";
//		
//		System.out.println("����� �ֹι�ȣ�� �Է��ϼ���. (011231-1111222)>");
//		
//		Scanner scanner = new Scanner(System.in);
//		regNo = scanner.nextLine();
//		
//		System.out.println(regNo.charAt(0));
//		
//		gender = regNo.charAt(7); // �Է¹��� ��ȣ�� 8��° ���ڸ� gender�� ����
//		System.out.println("gender : " + gender);
//		
//		switch (gender) {
//		case 1: 
//		case 3:
//			System.out.println("����� �����Դϴ�.");
//			break;
//		case 2: 
//		case 4:
//			System.out.println("����� �����Դϴ�.");
//			break;
//		default:
//			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
//			;
//		}
		
		
				
	} //main�� ��

}
