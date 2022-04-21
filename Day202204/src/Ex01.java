import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
			//if 문을 이용한 가위바위보
//		int user, com;
//		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
//		
//		Scanner sc = new Scanner(System.in);
//		String tmp = sc.nextLine();
//		user = Integer.parseInt(tmp);
//		
//		com = (int) (Math.random()*3) + 1;
//		
//		System.out.println("당신은 " + user + "입니다.");
//		System.out.println("컴은 " + com + "입니다.");
//		
//		if(com - user ==1 || com - user == -2) 
//			System.out.println("당신이 졌습니다.");
//		 else if (com - user ==2 || com - user == -1) 
//			System.out.println("당신이 이겼습니다.");
//		 else 
//			System.out.println("비겼습니다.");
		
		
			// switch 문을 이용한 가위바위보
//		int user, com;
//		
//		System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요.>");
//		
//		Scanner scanner = new Scanner(System.in);
////		int user = scanner.nextInt();
//		String tmp = scanner.nextLine();
//		user = Integer.parseInt(tmp);
//		
//		com = (int)(Math.random() * 3) +1;
//		
//		System.out.println("당신은 "+ user +"입니다.");
//		System.out.println("컴은 "+ com +"입니다.");
//		
//		
//		switch(user-com) {
//			case 2: case -1:
//				System.out.println("당신이 졌습니다.");
//				break;
//			case 1: case -2:
//				System.out.println("당신이 이겼습니다.");
//				break;
//			case 0:
//				System.out.println("비겼습니다.");
//				break;
//				}
		
		
				// switch문을 이용한 학점 계산
//		// 90A 80B 70C 60D F
//		int jumsu = 0;
//		
//		System.out.println("점수를 입력하세요.>");
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
		
					
		
				// switch문의 제약조건
//		System.out.println("현재 월을입력하세요.>");
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
//				System.out.println("현재의 계절은 봄입니다.");
//				break;
//			case 6: case 7: case 8:
//				System.out.println("현재의 계절은 여름입니다.");
//				break;
//			case 9: case 10: case 11:
//				System.out.println("현재의 계절은 가을입니다.");
//				break;
//			default:  // default 를 사용하면 그 외 숫자도 겨울로 인식
//			//case 12: case 1: case 2:    를 쓰고 default 생략 가능
//				System.out.println("현재의 계절은 겨울입니다.");
//		}
		
		
		
		
				// switch 문
		
//		System.out.println("점수를 입력해주세요.>");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		String tmp = sc.nextLine();
//		int num = Integer.parseInt(tmp);
//		//int num2 = sc.nextInt();  위 두줄과 같음
//				
//		switch(num) {
//		case 1:
//			System.out.println("1입력");
//			break;
//		case 2:
//			System.out.println("2입력");
//			break;
//		case 3:
//			System.out.println("3입력");
//			break;
//		case 4:
//			System.out.println("4입력");
//			break;
//		default:
//			System.out.println("그 외 입력");
//		}
		
		
		
				// 중첩 if문
//		int score = 0;
//		char grade = ' ';
//		char opt = '0';
//		
//		System.out.println("점수를 입력해주세요.>");
//		
//		Scanner scanner = new Scanner(System.in);
//		score = scanner.nextInt();
//		
//		System.out.printf("당신의 점수는 %d입니다.%n", score);
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
//		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
//	 	
//		scanner.close();
		
		
		
				// 조건문 if, switch
//		Scanner sc = new Scanner(System.in);
//		
//		String str = sc.nextLine();
//		
//		if(str.equals("yes") )
//			System.out.println("정답입니다.");
//		// 내용이 yes 인 경우
//
//		if(str.equalsIgnoreCase("yes") )
//			System.out.println("정답입니다.");  // yes 일 경우 실행
//		System.out.println("11111");  // 무조건 실행
//		// 대소문자 구분 없이 내용이 yes인 경우 
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		
//		if(num >0)
//			System.out.println("양수");
//		else { 
//			if(num < 0)
//			System.out.println("음수");
//		else
//			System.out.println("영");
//		}  // 동적 if (if 안에 if) 안쓰는게 좋음
		
		// 정수 입력받아서 -> 90이상 A 80 B 70 C 60 D 60 이하 F
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//			
//		if (num >= 90 && num <= 100)  
//			System.out.println("A학점");
//		else if(num >= 80 && num <= 89)
//			System.out.println("B학점");		
//		else if(num >= 70 && num <= 79)
//			System.out.println("C학점");
//		else if(num >= 60 && num <= 69)
//			System.out.println("D학점");
//		else
//			System.out.println("F학점");
//		// else 는 두가지 결과만 표현할 때, else if 는 결과가 여러가지일경우
		
		
		
				// 대입 연산자
//		int i=10;
//		
//		i <<= 3;  // i +=3; 둘 다 같음
//		
//		System.out.println(i);
		
		
		
		
				//  조건 연산자 중요
//		int num1 = 1;
//		int num2 = 5;
//		
//		//int num3 = num1>num2 ? num1 : num2;
//		
//		//  조건	   조건참	  조건거짓
//		System.out.println(num1>num2 ? num1 : "abc");
		
				
				//  쉬프트 연산자
//		System.out.println(8 << 2); // 1000   <-- 2bit 이동 100000 32
//		System.out.println(8 >> 2); // 1000   --> 2bit shift 0010! 2
					
		
//		//키보드로 두 정수 입력을 받아서, 총점과 평균을 출력한다.
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
//		System.out.println("합계 : " + sum + "\n평균 : " + ave);
		
		
		
//		int num = 4000;  //4000초 --> 시 분 초
//		
//		int h=0;
//		int m=0;
//		int s=0;
//		
//		h = num / 3600;
//		m = num % 3600 / 60;
//		s = num % 60;
//		
//		System.out.println(num + "초는 " + h + "시 " + m + "분 " + s + "초 입니다.");
		
		
		
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
//		if ( a>20 || b>5)    // if ( a>20(1시간) && b>5(5초) )
//							 // &&연산자를 사용시 연산 소요시간이 적은것을 왼쪽으로
//			System.out.println("만족");
//		
//		System.out.println("불만족");
		
				
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		//문자 'a' / 문자열 : "korea" 
//		char ch = ' ';
//		
//		String str = "korea";
//		ch = str.charAt(2);
//		
//		System.out.printf("문자를 하나 입력하세요.>");
//		
//		String input = scanner.nextLine();
//		ch = input.charAt(0);
//		
//		if('0'<= ch && ch <= '9') {
//			System.out.printf("입력하신 문자는 숫자입니다.\n");
//		}	
//		
//		if(('a'<= ch && ch <='z') || ('A'<= ch && ch<= 'Z')) {
//			System.out.printf("입력하신 문자는 영문자입니다.\n");
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
//		//클래스는 객체를 생성해야한다. new 연산자로 생성
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
		//equals 객체를 무시하고 내용물만 보고 비교
		//equalsIgnoreCase 대소문자 구분 없이 비교
		
		
		
		
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
//		System.out.println(x >= y);   // >= 허용  => 불가능
//		System.out.println(x <= y);   // <= 허용  =< 불가능
//		
//		System.out.println(x == y);   // 두 값이 같냐
//		System.out.println(x != y);   // 두 값이 다르냐
		
		
		
		
		
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
//		//정수 연산 정수 = 정수
//		//정수 연산 실수 = 실수
//		//실수 연산 실수 = 실수
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
//		num2 = ++num; // 전위형 4	 4 , 4
//		System.out.println(num + "," + num2);
//		
//		num3 = num++; // 후위형 5  5 , 4
//		
//		
//		System.out.println(num + "," + num3);
//		
//		
//		int i = 0;
//		int j = 0;
//		
//		i += 1;
//		j = i;    // j = ++i;	전위형
//		
//		int m = 0;
//		int n = 0;
//		
//		n = m;
//		m +=1;	  // n = m++;	후위형
		
		/*
		 * //객체 //객체 생성-->new 클래스로 객체 생성 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * 
		 * String name = sc.nextLine();
		 * 
		 * System.out.println(name); 
		 * // 
		 * //int num = sc.nextLine(); // 에러 
		 * //
		 * 
		 * String input = sc.nextLine(); 
		 * int num = Integer.parseInt(input);
		 * 
		 * System.out.println(num);
		 */		
		
		
		
		
		/*
		 * //이름, 나이 출력한다.
		 * 
		 * int age = 20; String name;
		 * 
		 * Scanner sc = new Scanner(System.in); 
		 * name = sc.nextLine();
		 * 
		 * System.out.printf("name : %s, age : %d\n",name, age);
		 * System.out.println("name : " + name + ", age : " + age); 
		 * //%s 문자열 , %d 정수
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
		 * System.out.printf("age3 : %3d, max : %3d\n", age3, max); // \n <- 개행문자(줄바꾸기)
		 */		
		
		/*
		 * int oct = 010; 
		 * //8진수 int de = 10; 
		 * //10진수 int hex = 0x10; 
		 * //16진수 int bin =
		 * 0b1010; //2진수
		 * 
		 * // 2진법 1, 8진법 : 3bit 000~111 , 16진법 : 0000~1111
		 * 
		 * // 01/011 -> 13 (8진법) 
		 * // 0/1011 -> B(11(16진법))
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
		 * // final int I = 10; <- final 을 붙이면 I 값을 고정함 
		 * //int i = 10;
		 * 
		 * final int MAX = 100; 
		 * final int MIN = 0;
		 * 
		 * int kor = 90;
		 */
		
		/*
		 * short d = 35; // short 앞에 자동으로 (short) 가 붙어있음
		 * 
		 * float f = 10.2f; 
		 * // 실수 끝에는 f를 붙여줘야함 double fd = 10.5;
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



// 정수형	byte, short, int, long
//       1      2     4    8
// bit(0,1)
// byte(8bit)		00000000 ~ 11111111(0~256)
// Kbyte (1024byte)
// Mbyte (1024kbyte)
// Gbyte (1024mbyte)

//byte(1) -  -128 ~ 127
//short(2)   -32,768 ~ 32,767
//int(4)     -21억 ~ 21억
//long(8)    존나많음


/*int a,b;

a = 50000;

System.out.println(a);

short c = (short)a;  //강제형변환

int cc;  //4byte
short dd = 30000; //2byte

//  연산시에는 자료형이 일치해야한다.
cc = dd;   //자동형변환 dd 2byte를 4byte로 변환한 다음 대입

System.out.println(c);*/

    // 'A' , '1' ==> 문자(char) , "ABC" ==> 문자열(String)
	// '' ==> 사이에는 문자 1개

		
	}
	
}
