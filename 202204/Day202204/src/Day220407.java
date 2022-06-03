
public class Day220407 {

	public static void main(String[] args) {
		
//		System.out.println("1" + "2");		//( 12 )	
//		System.out.println(true + "" );		//( true )
//		System.out.println('A' + 'B');		//( AB )
//		System.out.println('1' + 2);		//( 12 )
//		System.out.println('1' + '2');		//( 12 )
//		System.out.println('J' + "ava");	//( Java )
//		System.out.println(true + null);	//( 오류 )
//	------------------------------------------------------
//		다음 중 형변환을 생략할 수 있는 것은? ( 모두 고르시오)
//		byte b = 10;
//		char ch = 'A';
//		int i = 100;
//		long l = 1000L;
//		
//		b = (byte)i; 
//		ch = (char)b;
//		short s = (short)ch;
//		float f = (float)l;
//		i = (int)ch;
//	------------------------------------------------------
//		다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)
//		byte b = 256;		//v
//		char c = '';		//v
//		char answer = 'no';	//v
//		float f = 3.14;		//v
//		double d = 1.4e3f;	//
//		------------------------------------------------------
//		int x = 2;
//		int y = 5;
//		char c = 'A'; // 'A' 의 문자코드는 65

//		int x = 2;
//		int y = 5;
//		char c = 'A'; // 'A' 의 문자코드는 65
//
//		System.out.println(y
//		System.out.println(y >= 5 | x < - && x > 2);	//true
//		System.out.println(y += 10 - x++);				//15 - 2 = 13
//		System.out.println(x += 2);						//5
//		System.out.println(!('A' <= c && c <= 'Z'));	//false
//		System.out.println('C' = c);		  C는 67		//2
//		System.out.println('5' - '0');	     53 - 48	//5
//		System.out.println(c + 1);	    		 65 + 1	//66
//		System.out.println(++c);						//B
//		System.out.println(c++);						//B
//		System.out.println(c);							//C
//		------------------------------------------------------
//		아래는 변수 num의 값에 따라 '양수, ' 음수, '0'을 출력하는 코드이다. 삼항
//		연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.
//		[Hint] 삼항 연산자를 두 번 사용하라.
//		int num = 10;
//		System.out.println( /* (1) */ );
//		답
//		int num = 10;
//		System.out.println( (num > 0)? "양수" : (num == 0) ? "0" : "음수");
//		------------------------------------------------------
//		아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수
//		num의 값이 '456' 이라면 '400'이 되고, '111'이라면 '100'이 된다. (1)에 알맞은
//		코드를 넣으시오.
//
//		int num = 456;
//		System.out.println( /* (1) */ );
//		답
//		int num = 456;
//		System.out.println(num/100*100);
//		------------------------------------------------------
//		아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수
//		num의 값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은
//		 코드를 넣으시오
//
//		int num = 333;
//		System.out.println( /* (1) */ );
//		답
//		int num = 333;
//		System.out.println(num/10*10+1);
//		------------------------------------------------------
//		아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의
//		값을 뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 
//		10의 배수는 30이다. 19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를
//		뺀 나머지는 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야한다.
//		(1)에 알맞은 코드를 넣으시오.
//		[Hint] 나머지 연산자를 사용하라.
//
//		int num = 24;
//		System.out.println( /* (1) */ );
//		답		
//		int num = 24;
//		System.out.println(10-num%10);
//		------------------------------------------------------
//		아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이
//		'C = 5/9 x ( F-32 )'라고 할 때, (1)에 알맞은 코드를 넣으시오. 단, 변환 
//		결과값은 소수점 셋째자리에서 반올림해야한다. (Math.round()를 사용하지
//		않고 처리할 것)
//
//		int fahrenheit = 100;
//		float celcius = ( /* (1) */ );
//
//		System.out.println("Fahrenheit : " + fahrenheit);
//		System.out.println("Celcius : " + celcius);
//		
//		int fahrenheit = 100;
//		
//		float celcius = 5/9f *( fahrenheit - 32);
//		System.out.println("Fahrenheit : " + fahrenheit);
//		System.out.println("Celcius : " + celcius);
//		답
//		celcius = (5/9f *( fahrenheit - 32))*(100);
//		celcius = (5/9f *( fahrenheit - 32))*(100)+0.5f;
//		celcius = (int)((5/9f *( fahrenheit - 32))*(100)+0.5f);
//		celcius = (int)((5/9f *( fahrenheit - 32))*(100)+0.5f)/100f;
//		System.out.println("Celcius : " + celcius);
//		------------------------------------------------------
//		다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만
//		변수 b의 값이 true가 되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오.
//		char ch = 'z';
//		boolean b = ( /* (1) */ )
//
//		System.out.println(b);
//		답
//		char ch = '1';		
//		boolean b = ('0' <= ch && ch <= '9') || ('a' <= ch && ch <= 'z')
//											 || ('A' <= ch && ch <= 'Z');
//		System.out.println(b);
//		------------------------------------------------------
//		다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 
//		대문자인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다
//		32만큼 더 크다. 예를들어 'A'의 코드는 65이고 'a'의 코드는 97이다.
//		(1) ~ (2)에 알맞은 코드를 넣으시오.
//		char ch = 'A';
//
//		char lowerCase = ( /* (1) */ ) ? ( /* (2) */ ) : ch;
//
//		System.out.println("ch : " + ch);
//		System.out.println("ch to lowercase : " + lowercase);	
//		답
//		char ch = 'C';
//		
//		char lowerCase = ( 'A' <= ch && ch <= 'Z' ) ? 
//				(char)(ch+32) : ch;
//		
//		System.out.println("ch : " + ch);
//		System.out.println("ch to lowercase : " + lowerCase);	
//		------------------------------------------------------
//		다음 문장들을 조건식으로 표현하라.
//		1. int형 변수가 x가 10보다 크고 20보다 작을 때 true인 조건식
//		int x = 11;
//		System.out.println(10 < x && x < 20);
////		2. char형 변수가 ch1가 공백이나 탭이 아닐 때 true인 조건식
//		char ch1 = 'k';
//		System.out.println(ch1 != ' ' && ch1 != '\t');
////		3. char형 변수가 ch2가 'x' 또는 'X'일 때 true인 조건식
//		char ch2 = 'X';
//		System.out.println(ch2 == 'x' || ch2 == 'X');
////		4. char형 변수가 ch3가 숫자('0'~'9')일 때 true인 조건식
//		char ch3 = '5';
//		System.out.println(ch3>='0' && ch3 <='9');
////		5. char형 변수가 ch4가 영문자(대문자 또는 소문자)일 때 true인 조건식
//		char ch4 = 'A';
//		System.out.println(('A' <= ch4 && ch4 <= 'Z') || 
//									('a' <= ch4 && ch4 <= 'z'));
////		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로
////		나눠떨어지지 않을 때 true인 조건식
//		int year = 2020;
//		System.out.println((year % 400 == 0 ) || (year % 4 == 0)
//											&& (year % 100 != 0));
////		7. boolean형 변수 powerOn가 false일 때 true인 조건식
//		boolean powerOn = false;
//		System.out.println(!powerOn);
////		8. 문자열 참조변수 str이 "yes" 일 때 true인 조건식
//		String str = "yes";
//		System.out.println(str.equals("yes"));
//		------------------------------------------------------
	}
	
}