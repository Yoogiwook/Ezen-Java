import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
			//if ���� �̿��� ����������
//		int user, com;
//		System.out.println("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.>");
//		
//		Scanner sc = new Scanner(System.in);
//		String tmp = sc.nextLine();
//		user = Integer.parseInt(tmp);
//		
//		com = (int) (Math.random()*3) + 1;
//		
//		System.out.println("����� " + user + "�Դϴ�.");
//		System.out.println("���� " + com + "�Դϴ�.");
//		
//		if(com - user ==1 || com - user == -2) 
//			System.out.println("����� �����ϴ�.");
//		 else if (com - user ==2 || com - user == -1) 
//			System.out.println("����� �̰���ϴ�.");
//		 else 
//			System.out.println("�����ϴ�.");
		
		
			// switch ���� �̿��� ����������
//		int user, com;
//		
//		System.out.print("����(1),����(2),��(3) �� �ϳ��� �Է��ϼ���.>");
//		
//		Scanner scanner = new Scanner(System.in);
////		int user = scanner.nextInt();
//		String tmp = scanner.nextLine();
//		user = Integer.parseInt(tmp);
//		
//		com = (int)(Math.random() * 3) +1;
//		
//		System.out.println("����� "+ user +"�Դϴ�.");
//		System.out.println("���� "+ com +"�Դϴ�.");
//		
//		
//		switch(user-com) {
//			case 2: case -1:
//				System.out.println("����� �����ϴ�.");
//				break;
//			case 1: case -2:
//				System.out.println("����� �̰���ϴ�.");
//				break;
//			case 0:
//				System.out.println("�����ϴ�.");
//				break;
//				}
		
		
				// switch���� �̿��� ���� ���
//		// 90A 80B 70C 60D F
//		int jumsu = 0;
//		
//		System.out.println("������ �Է��ϼ���.>");
//		
//		Scanner sc = new Scanner(System.in);
//		String tmp = sc.nextLine();
//		jumsu = Integer.parseInt(tmp);
//		
//		switch(jumsu/10) {
//			case 9:
//				System.out.println("A");
//				break;
//			case 8:
//				System.out.println("B~.");
//				break;
//			case 7:
//				System.out.println("C~.");
//				break;
//			case 6:
//				System.out.println("D~.");
//				break;
//			default:
//				System.out.println("F~.");
//				break;
//		}
		
					
		
				// switch���� ��������
//		System.out.println("���� �����Է��ϼ���.>");
//		
//		Scanner scanner = new Scanner(System.in);
////		String tmp = scanner.nextLine();
////		month = Integer.parseInt(tmp);
//		int month = scanner.nextInt();
//		
//		switch (month) {
//			case 3:
//			case 4:
//			case 5:
//				System.out.println("������ ������ ���Դϴ�.");
//				break;
//			case 6: case 7: case 8:
//				System.out.println("������ ������ �����Դϴ�.");
//				break;
//			case 9: case 10: case 11:
//				System.out.println("������ ������ �����Դϴ�.");
//				break;
//			default:  // default �� ����ϸ� �� �� ���ڵ� �ܿ�� �ν�
//			//case 12: case 1: case 2:    �� ���� default ���� ����
//				System.out.println("������ ������ �ܿ��Դϴ�.");
//		}
		
		
		
		
				// switch ��
		
//		System.out.println("������ �Է����ּ���.>");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		String tmp = sc.nextLine();
//		int num = Integer.parseInt(tmp);
//		//int num2 = sc.nextInt();  �� ���ٰ� ����
//				
//		switch(num) {
//		case 1:
//			System.out.println("1�Է�");
//			break;
//		case 2:
//			System.out.println("2�Է�");
//			break;
//		case 3:
//			System.out.println("3�Է�");
//			break;
//		case 4:
//			System.out.println("4�Է�");
//			break;
//		default:
//			System.out.println("�� �� �Է�");
//		}
		
		
		
				// ��ø if��
//		int score = 0;
//		char grade = ' ';
//		char opt = '0';
//		
//		System.out.println("������ �Է����ּ���.>");
//		
//		Scanner scanner = new Scanner(System.in);
//		score = scanner.nextInt();
//		
//		System.out.printf("����� ������ %d�Դϴ�.%n", score);
//		
//		if (score >=90) {
//			grade ='A';
//			if (score >= 98) {
//				opt = '+';
//			} else if(score <94) {
//				opt = '-';
//			}
//		} else if (score >= 80) {
//			grade = 'B';
//			if (score >= 88) {
//				opt = '+';
//			} else if (score <84) {
//				opt = '-';
//			}
//			} else {
//				grade = 'C';
//			}
//		System.out.printf("����� ������ %c%c�Դϴ�.%n", grade, opt);
//	 	
//		scanner.close();
		
		
		
				// ���ǹ� if, switch
//		Scanner sc = new Scanner(System.in);
//		
//		String str = sc.nextLine();
//		
//		if(str.equals("yes") )
//			System.out.println("�����Դϴ�.");
//		// ������ yes �� ���
//
//		if(str.equalsIgnoreCase("yes") )
//			System.out.println("�����Դϴ�.");  // yes �� ��� ����
//		System.out.println("11111");  // ������ ����
//		// ��ҹ��� ���� ���� ������ yes�� ��� 
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		
//		if(num >0)
//			System.out.println("���");
//		else { 
//			if(num < 0)
//			System.out.println("����");
//		else
//			System.out.println("��");
//		}  // ���� if (if �ȿ� if) �Ⱦ��°� ����
		
		// ���� �Է¹޾Ƽ� -> 90�̻� A 80 B 70 C 60 D 60 ���� F
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//			
//		if (num >= 90 && num <= 100)  
//			System.out.println("A����");
//		else if(num >= 80 && num <= 89)
//			System.out.println("B����");		
//		else if(num >= 70 && num <= 79)
//			System.out.println("C����");
//		else if(num >= 60 && num <= 69)
//			System.out.println("D����");
//		else
//			System.out.println("F����");
//		// else �� �ΰ��� ����� ǥ���� ��, else if �� ����� ���������ϰ��
		
		
		
				// ���� ������
//		int i=10;
//		
//		i <<= 3;  // i +=3; �� �� ����
//		
//		System.out.println(i);
		
		
		
		
				//  ���� ������ �߿�
//		int num1 = 1;
//		int num2 = 5;
//		
//		//int num3 = num1>num2 ? num1 : num2;
//		
//		//  ����	   ������	  ���ǰ���
//		System.out.println(num1>num2 ? num1 : "abc");
		
				
				//  ����Ʈ ������
//		System.out.println(8 << 2); // 1000   <-- 2bit �̵� 100000 32
//		System.out.println(8 >> 2); // 1000   --> 2bit shift 0010! 2
					
		
//		//Ű����� �� ���� �Է��� �޾Ƽ�, ������ ����� ����Ѵ�.
//		Scanner sc = new Scanner(System.in);
//		
//		String n1 = sc.nextLine();
//		String n2 = sc.nextLine();
//		
//		int num1 = Integer.parseInt(n1);
//		int num2 = Integer.parseInt(n2);
//		
//		int sum = num1 + num2;
//		double ave = sum / 2.0;
//		
//		System.out.println("�հ� : " + sum + "\n��� : " + ave);
		
		
		
//		int num = 4000;  //4000�� --> �� �� ��
//		
//		int h=0;
//		int m=0;
//		int s=0;
//		
//		h = num / 3600;
//		m = num % 3600 / 60;
//		s = num % 60;
//		
//		System.out.println(num + "�ʴ� " + h + "�� " + m + "�� " + s + "�� �Դϴ�.");
		
		
		
//		int x = 0xAB;
//		int y = 0xF;
//		
//		System.out.println(x);
//		
//		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString (x));
//		System.out.printf("y = %#X \t\t%s%n", y, toBinaryString (y));
//		System.out.printf("%#X | %#X = %#X \t%s%n" ,
//								x, y, x | y, toBinaryString (x | y));
//		System.out.printf("%#X & %#X = %#X \t%s%n" ,
//								x, y, x & y, toBinaryString (x & y));
//		System.out.printf("%#X ^ %#X = %#X \t%s%n" ,
//								x, y, x ^ y, toBinaryString (x ^ y));
//		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n" ,
//						x, y, y, x ^ y ^ y, toBinaryString (x ^ y ^ y));
//		
//	}
//	
//	static String toBinaryString(int x) {
//		String zero = "00000000000000000000000000000000";
//		String tmp = zero + Integer.toBinaryString(x);
//		return tmp.substring(tmp.length()-32);




//		int a = 30;
//		int b = 5;
//		
//		if ( a>20 || b>5)    // if ( a>20(1�ð�) && b>5(5��) )
//							 // &&�����ڸ� ���� ���� �ҿ�ð��� �������� ��������
//			System.out.println("����");
//		
//		System.out.println("�Ҹ���");
		
				
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		//���� 'a' / ���ڿ� : "korea" 
//		char ch = ' ';
//		
//		String str = "korea";
//		ch = str.charAt(2);
//		
//		System.out.printf("���ڸ� �ϳ� �Է��ϼ���.>");
//		
//		String input = scanner.nextLine();
//		ch = input.charAt(0);
//		
//		if('0'<= ch && ch <= '9') {
//			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.\n");
//		}	
//		
//		if(('a'<= ch && ch <='z') || ('A'<= ch && ch<= 'Z')) {
//			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�.\n");
//		}
		

		
		
//		char ch = 95;
//		
//		
//		System.out.println((('a'<=ch && ch <= 'z') || ('A'<=ch && ch <='Z')));
//							     //97 ~ 122        ||        65 ~ 90
		
		
		
//		int a = 1;
//		int b = 0;
//		
//		int i = 18;
//		
//		System.out.println(a>0 && b>0);
//		System.out.println(a>0 || b>0);
//		System.out.println( !(a>0 || b>0));
//										//6, 12, 18... --> 3, 9, 15 
//		System.out.println(i%2 ==0 || (i%3 ==0 && i%6 !=0) );
		
		
		
		
//		String str1 = "abc";
//		String str11 = "abc";
//		
//		System.out.println("aaaa : " + (str1 == str11));
//
//		String str2 = new String("abc");	
//		String str3 = new String("abc");
//		//Ŭ������ ��ü�� �����ؾ��Ѵ�. new �����ڷ� ����
//		System.out.println("bbbb : " + (str2 == str3));
//		
//		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" == "abc");
//		System.out.printf(" str1==\"abc\" ? %b%n", str1 == "abc");
//		System.out.printf(" str2==\"abc\" ? %b%n", str2 == "abc");
//		System.out.printf("str1.equals (\"abc\") ? %b%n", str1.equals("abc"));
//		System.out.printf("str2.equals (\"abc\") ? %b%n", str2.equals("abc"));
//		System.out.printf("str2.equals (\"ABC\") ? %b%n", str2.equals("ABC"));
//		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n",
//												str2.equalsIgnoreCase("ABC"));
		//equals ��ü�� �����ϰ� ���빰�� ���� ��
		//equalsIgnoreCase ��ҹ��� ���� ���� ��
		
		
		
		
//		System.out.printf("10 == 10.0f \t %b\n", 10 == 10.0f);
//		System.out.printf("'0' == 0    \t %b\n", '0' == 0);
//		System.out.printf("'A' == 65   \t %b\n", 'A' == 65);
//		System.out.printf("'A' > 'B'   \t %b\n", 'A' == 'B');
//		System.out.printf("'A'+1 != 'B'   \t %b\n", 'A'+1 != 'B');
		
		
		
		
		
//		int x = 10;
//		int y = 8;
//		
//		System.out.println(x > y);
//		System.out.println(x < y);
//		System.out.println(x >= y);   // >= ���  => �Ұ���
//		System.out.println(x <= y);   // <= ���  =< �Ұ���
//		
//		System.out.println(x == y);   // �� ���� ����
//		System.out.println(x != y);   // �� ���� �ٸ���
		
		
		
		
		
//		double pi = 3.141592;
//		double shortPi = pi * 1000;
//		
//		System.out.println(shortPi);
//		
//		shortPi = Math.round(pi * 1000);
//		
//		System.out.println(shortPi);
//		
//		shortPi = Math.round(pi * 1000) / 1000.0;
//		
//		System.out.println(shortPi);
		
		
		
		
//		double pi = 3.141592;
//		double shortpi = Math.round(pi*1000) / 1000.0;
//		System.out.println(shortpi);
		
		
		
		
//		float pi = 3.14159f;  //3.141
//		
//		float result = (int)(pi*1000) / 1000f;
//		
//		System.out.println(result);
//		
//		//3.142
//		
//		float result2 = (int)(pi*1000+0.5) / 1000f;
//		
//		System.out.println(result2);
		
		
		
		
//		char c = 'a';
//		for(int i=0; i<26; i++)  { 
//			System.out.print(c++);
//		}
//		System.out.println();
//		
//		c = 'A';
//		for(int i=0; i<26; i++)  {
//			System.out.print(c++);
//		}
//		System.out.println();
//		
//		c = '0';
//		for (int i=0; i<10; i++)  {
//			System.out.print(c++);
//		}
//		System.out.println();
		
		
		
		
//		char c1 = 'a';
//		
//		char c2 = (char)(c1 + 1);
//		
//		char c3 = 'a' - 32;
//		
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
		
		
		
//		char a = 'a';	//65
//		char d = 'd';	//68
//		char zero = '0';
//		char two = '2';
//		
//		System.out.printf("'%c' - '%c' = %d%n", d, a, d -a);
//		System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
//		System.out.printf("'%c'=%d%n", a, (int)a);
//		System.out.printf("'%c'=%d%n", d, (int)d);
//		System.out.printf("'%c'=%d%n", zero, (int)zero);
//		System.out.printf("'%c'=%d%n", two, (int)two);
		
		
		
//		int a= 10;
//		int b= 4;
//		
//		//���� ���� ���� = ����
//		//���� ���� �Ǽ� = �Ǽ�
//		//�Ǽ� ���� �Ǽ� = �Ǽ�
//		System.out.println(a/0.0);
//		
//		System.out.println((double)a/b);
//		
//		System.out.println(a/(double)b);
//		
//		System.out.println((double)a/(double)b);
		
		
		
//		int num = 1;
//		int num2 = 0;
//		int num3 = 0;
//		
//		num = num +1; // 2
//		
//		num += 1; // 3
//		
//		num2 = ++num; // ������ 4	 4 , 4
//		System.out.println(num + "," + num2);
//		
//		num3 = num++; // ������ 5  5 , 4
//		
//		
//		System.out.println(num + "," + num3);
//		
//		
//		int i = 0;
//		int j = 0;
//		
//		i += 1;
//		j = i;    // j = ++i;	������
//		
//		int m = 0;
//		int n = 0;
//		
//		n = m;
//		m +=1;	  // n = m++;	������
		
		/*
		 * //��ü //��ü ����-->new Ŭ������ ��ü ���� 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * 
		 * String name = sc.nextLine();
		 * 
		 * System.out.println(name); 
		 * // 
		 * //int num = sc.nextLine(); // ���� 
		 * //
		 * 
		 * String input = sc.nextLine(); 
		 * int num = Integer.parseInt(input);
		 * 
		 * System.out.println(num);
		 */		
		
		
		
		
		/*
		 * //�̸�, ���� ����Ѵ�.
		 * 
		 * int age = 20; String name;
		 * 
		 * Scanner sc = new Scanner(System.in); 
		 * name = sc.nextLine();
		 * 
		 * System.out.printf("name : %s, age : %d\n",name, age);
		 * System.out.println("name : " + name + ", age : " + age); 
		 * //%s ���ڿ� , %d ����
		 */
		
	
		
		/*
		 * int age = 2; 
		 * int age2 = 20; 
		 * int age3 = 200; 
		 * int max = 1000;
		 * 
		 * System.out.println("age :" + age + ", " + "max : " + max);
		 * 
		 * // "age : " + "20" ==> age : 20 
		 * System.out.printf("age  : %3d, max : %3d\n", age, max); 
		 * System.out.printf("age2 : %3d, max : %3d\n", age2, max);
		 * System.out.printf("age3 : %3d, max : %3d\n", age3, max); // \n <- ���๮��(�ٹٲٱ�)
		 */		
		
		/*
		 * int oct = 010; 
		 * //8���� int de = 10; 
		 * //10���� int hex = 0x10; 
		 * //16���� int bin =
		 * 0b1010; //2����
		 * 
		 * // 2���� 1, 8���� : 3bit 000~111 , 16���� : 0000~1111
		 * 
		 * // 01/011 -> 13 (8����) 
		 * // 0/1011 -> B(11(16����))
		 * 
		 * 
		 * System.out.println(oct); 
		 * System.out.println(de); 
		 * System.out.println(hex);
		 * System.out.println(bin); 
		 * System.out.println("-------------------");
		 * System.out.println(Integer.toBinaryString(bin));
		 * System.out.println(Integer.toHexString(hex));
		 * System.out.println(Integer.toOctalString(oct));
		 * 
		 */
		
		/* boolean a = true; boolean b = false;
		 * 
		 * char c = 'k'; 
		 * // char cc = 'kk';
		 * 
		 * // final int I = 10; <- final �� ���̸� I ���� ������ 
		 * //int i = 10;
		 * 
		 * final int MAX = 100; 
		 * final int MIN = 0;
		 * 
		 * int kor = 90;
		 */
		
		/*
		 * short d = 35; // short �տ� �ڵ����� (short) �� �پ�����
		 * 
		 * float f = 10.2f; 
		 * // �Ǽ� ������ f�� �ٿ������ double fd = 10.5;
		 *//*
		 * int x = 10; int y = 20;
		 * 
		 * System.out.println("before x : " + x); 
		 * System.out.println("before y : " + y);
		 * 
		 * // int c; c = x; x = y; y = c; 
		 * System.out.println(x); 
		 * System.out.println(y);
		 * //
		 * 
		 * System.out.println("after x : " + x); 
		 * System.out.println("after y : " + y);
		 */
	

//	private static Object toBinaryString(int x) {
//		// TODO Auto-generated method stub
//		return null;



// ������	byte, short, int, long
//       1      2     4    8
// bit(0,1)
// byte(8bit)		00000000 ~ 11111111(0~256)
// Kbyte (1024byte)
// Mbyte (1024kbyte)
// Gbyte (1024mbyte)

//byte(1) -  -128 ~ 127
//short(2)   -32,768 ~ 32,767
//int(4)     -21�� ~ 21��
//long(8)    ��������


/*int a,b;

a = 50000;

System.out.println(a);

short c = (short)a;  //��������ȯ

int cc;  //4byte
short dd = 30000; //2byte

//  ����ÿ��� �ڷ����� ��ġ�ؾ��Ѵ�.
cc = dd;   //�ڵ�����ȯ dd 2byte�� 4byte�� ��ȯ�� ���� ����

System.out.println(c);*/

    // 'A' , '1' ==> ����(char) , "ABC" ==> ���ڿ�(String)
	// '' ==> ���̿��� ���� 1��

		
	}
	
}
