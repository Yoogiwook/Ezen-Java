import java.util.Scanner;

public class Day220411 {

	public static void main(String[] args) {
	//���ǹ�(if, switch), �ݺ���(for)	
		
//		int num = 1;
		
//		if(num>0) 
//			System.out.println("���");
//		else if(num<0)
//			System.out.println("����");
//		else if(num==0)
//			System.out.println("��");
//		else
//			System.out.println("���ڸ� �Է����ּ���!");
		
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
//		System.out.println("���ڸ� �Է��ϼ���. (��:12345)>");
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
//		System.out.println("�� �ڸ����� ��:"+sum);
		
//		-------------------------------------------------
		
//		���� 5���� ���������� �Է��ؼ� �Է��� ������� ���ϱ�
//		int sum = 0;	// ������
//		int i = 0;		// ȸ���뵵	
//		int input;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(i++ < 5) {
//			System.out.println(i + "ȸ ���� �Է� : ");
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
//		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���. (�������� 0�Է�)");
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
//			System.out.println("�հ� : "+ sum);
		
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
//					System.out.print("¦");
//				
//				if((tmp /= 10)==0)
//					break;
//			}
//			System.out.println();
//	}
//			// �� �İ� �Ʒ����� ���� ��
//			for(int i=1; i<=100; i++) {
//				System.out.printf("i=%d", i);
//				
//				int tmp = i;
//			do {	// tmp%10 �� 3�� ������� Ȯ�� (0 ����)
//				if(tmp%10%3==0 && tmp%10!=0)
//					System.out.print("¦");
//			} while((tmp/=10)!=0); // tmp /= 10�� tmp = tmp/10 �� ����
//			
//			System.out.println();
//	}
		
//	-----------------------------------------------
		
		//��������, ��������
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
//		System.out.println("ȸ��Ƚ�� : " + i +", "+ "sum : " + sum);
		
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
//					System.out.println("¦");
//				
//				if((tmp/=10)==0)
//					break abc;
//			}
//		}
//	System.out.println("final");
	
//	---------------------------------------
	
//	��Ģ����
//	sum(0) �Ѵ���
//	+2
//	sum(2)
//	*3
//	sum(6)
//	/2
//	sum(3)
//	-10
//	sum(-7)
//  q --���� (���� ���)
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�����Է�(����:0):");
			String tmp = sc.nextLine();
			int num = Integer.parseInt(tmp);
			if(num == 0) break;
			
			System.out.println("��Ģ���� ��ȣ : ");
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
				System.out.println("+,*,/,- �� �ϳ��� �Է��ϼ���.");
				
			}
		}
		System.out.println(sum);
		
		//equals,    ch(���ڿ�) --> ���ڷ� ��ȯ�ؼ� �Ҽ��� �ִ�.
		
//		-----------------------------------------------
		
	} //main�� ��
}
