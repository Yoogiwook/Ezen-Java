import java.util.Scanner;

public class Day220415 {

	public static void main(String[] args) {
//		������ �⺻����� 1500�̶�� ����
//		
//		���̴� �����Լ��� �Է¹���.
//		0~3�� ������ 100%
//		4~13�� ������ 50%
//		14~19�� ������ 25%
//		20�� �̻� ������ 0%
//		65�� �̻� ������ 100%
//		
//		������� ���
//		int age = 0;
//		int cost = 1500;
//		int dis = 0;
//		
//			age = (int)(Math.random()*100)+1;
//			if(age <= 3) {
//				System.out.printf("age = %d�� �����Դϴ�.", age);
//			}
//			else if(age <= 13) {
//				dis = cost/2;
//				System.out.printf("age = %d��, %d�� �Դϴ�.", age, dis);
//				}
//			else if(age <= 19) {
//				dis = (int)(cost*0.75);
//				System.out.printf("age = %d��, %d�� �Դϴ�.", age, dis);
//			}
//			else if(age <= 64) {
//				dis = cost;
//				System.out.printf("age = %d��, %d�� �Դϴ�.", age, dis);
//			}
//			else
//				System.out.printf("age = %d�� �����Դϴ�.", age);
		
//		����� ��
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
//		System.out.println("���� : "+ age + " ������� : " + (int)(fee*rate)+"��");
		
//		-----------------------------------------------------
		
//		if���� ����Ͽ� �ټ� �� ������ �Է� �޾Ƽ� ���� ū ���� ����ϴ� ���α׷� �ۼ�
//		�Է¹޴� ���ڴ� 0 ~ 100 ���̰��� 5�� �Է¹޾Ƽ� ū �� ���ϱ� 
		
//		System.out.println("���� 5���� �Է��ϼ���.");
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
//				 System.out.println("0���� 100���� ���� �Է����ּ���.");
//				 num = 0;
//				 --i;
//				 }
//		if(max < num)
//			max = num;
//		}
//		System.out.println("max : "+ max);
	
//		����� ��
		
//		Scanner sc = new Scanner(System.in);
//		int num, max = 0, i = 0;
//		String tmp;
//		
//		System.out.println("���� 5ȸ �Է� : ");
//		while(i<5) {
//			tmp = sc.nextLine();
//			num = Integer.parseInt(tmp); //�������� ���ؼ� �� ���� ����ϴ°� ����.
//			
//		if( num >= 0 && num < 101) {
//			if(max < num) max = num;
//			i++;
//		} else {
//			System.out.println("0�̻� 100���ϸ� �Է°���!");
//			}
//		}
//		System.out.println("�ִ밪 : "+ max);
		
//		-----------------------------------------------------
		//����
		
//		for(int i=1; i<3; i++)		// i= 1,2,3(Ż��)
//			for(int j=1; j<4; j++)	// j= 1,2,3,4(Ż��)
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