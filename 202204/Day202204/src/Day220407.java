
public class Day220407 {

	public static void main(String[] args) {
		
//		System.out.println("1" + "2");		//( 12 )	
//		System.out.println(true + "" );		//( true )
//		System.out.println('A' + 'B');		//( AB )
//		System.out.println('1' + 2);		//( 12 )
//		System.out.println('1' + '2');		//( 12 )
//		System.out.println('J' + "ava");	//( Java )
//		System.out.println(true + null);	//( ���� )
//	------------------------------------------------------
//		���� �� ����ȯ�� ������ �� �ִ� ����? ( ��� ���ÿ�)
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
//		������ ������ �߸� �ʱ�ȭ �� ����? (��� ���ÿ�)
//		byte b = 256;		//v
//		char c = '';		//v
//		char answer = 'no';	//v
//		float f = 3.14;		//v
//		double d = 1.4e3f;	//
//		------------------------------------------------------
//		int x = 2;
//		int y = 5;
//		char c = 'A'; // 'A' �� �����ڵ�� 65

//		int x = 2;
//		int y = 5;
//		char c = 'A'; // 'A' �� �����ڵ�� 65
//
//		System.out.println(y
//		System.out.println(y >= 5 | x < - && x > 2);	//true
//		System.out.println(y += 10 - x++);				//15 - 2 = 13
//		System.out.println(x += 2);						//5
//		System.out.println(!('A' <= c && c <= 'Z'));	//false
//		System.out.println('C' = c);		  C�� 67		//2
//		System.out.println('5' - '0');	     53 - 48	//5
//		System.out.println(c + 1);	    		 65 + 1	//66
//		System.out.println(++c);						//B
//		System.out.println(c++);						//B
//		System.out.println(c);							//C
//		------------------------------------------------------
//		�Ʒ��� ���� num�� ���� ���� '���, ' ����, '0'�� ����ϴ� �ڵ��̴�. ����
//		�����ڸ� �̿��ؼ� (1)�� �˸��� �ڵ带 �����ÿ�.
//		[Hint] ���� �����ڸ� �� �� ����϶�.
//		int num = 10;
//		System.out.println( /* (1) */ );
//		��
//		int num = 10;
//		System.out.println( (num > 0)? "���" : (num == 0) ? "0" : "����");
//		------------------------------------------------------
//		�Ʒ��� ���� num�� �� �߿��� ���� �ڸ� ���ϸ� ������ �ڵ��̴�. ���� ����
//		num�� ���� '456' �̶�� '400'�� �ǰ�, '111'�̶�� '100'�� �ȴ�. (1)�� �˸���
//		�ڵ带 �����ÿ�.
//
//		int num = 456;
//		System.out.println( /* (1) */ );
//		��
//		int num = 456;
//		System.out.println(num/100*100);
//		------------------------------------------------------
//		�Ʒ��� ���� num�� �� �߿��� ���� �ڸ��� 1�� �ٲٴ� �ڵ��̴�. ���� ����
//		num�� ���� 333�̶�� 331�� �ǰ�, 777�̶�� 771�� �ȴ�. (1)�� �˸���
//		 �ڵ带 �����ÿ�
//
//		int num = 333;
//		System.out.println( /* (1) */ );
//		��
//		int num = 333;
//		System.out.println(num/10*10+1);
//		------------------------------------------------------
//		�Ʒ��� ���� num�� ������ ũ�鼭�� ���� ����� 10�� ������� ���� num��
//		���� �� �������� ���ϴ� �ڵ��̴�. ���� ���, 24�� ũ�鼭�� ���� ����� 
//		10�� ����� 30�̴�. 19�� ��� 20�̰�, 81�� ��� 90�� �ȴ�. 30���� 24��
//		�� �������� 6�̱� ������ ���� num�� ���� 24��� 6�� ����� �����Ѵ�.
//		(1)�� �˸��� �ڵ带 �����ÿ�.
//		[Hint] ������ �����ڸ� ����϶�.
//
//		int num = 24;
//		System.out.println( /* (1) */ );
//		��		
//		int num = 24;
//		System.out.println(10-num%10);
//		------------------------------------------------------
//		�Ʒ��� ȭ��(Fahrenheit)�� ����(Celcius)�� ��ȯ�ϴ� �ڵ��̴�. ��ȯ������
//		'C = 5/9 x ( F-32 )'��� �� ��, (1)�� �˸��� �ڵ带 �����ÿ�. ��, ��ȯ 
//		������� �Ҽ��� ��°�ڸ����� �ݿø��ؾ��Ѵ�. (Math.round()�� �������
//		�ʰ� ó���� ��)
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
//		��
//		celcius = (5/9f *( fahrenheit - 32))*(100);
//		celcius = (5/9f *( fahrenheit - 32))*(100)+0.5f;
//		celcius = (int)((5/9f *( fahrenheit - 32))*(100)+0.5f);
//		celcius = (int)((5/9f *( fahrenheit - 32))*(100)+0.5f)/100f;
//		System.out.println("Celcius : " + celcius);
//		------------------------------------------------------
//		������ ������ ���� ch�� ������(�빮�� �Ǵ� �ҹ���)�̰ų� ������ ����
//		���� b�� ���� true�� �ǵ��� �ϴ� �ڵ��̴�. (1)�� �˸��� �ڵ带 �����ÿ�.
//		char ch = 'z';
//		boolean b = ( /* (1) */ )
//
//		System.out.println(b);
//		��
//		char ch = '1';		
//		boolean b = ('0' <= ch && ch <= '9') || ('a' <= ch && ch <= 'z')
//											 || ('A' <= ch && ch <= 'Z');
//		System.out.println(b);
//		------------------------------------------------------
//		������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��ε�, ���� ch�� ����� ���ڰ� 
//		�빮���� ��쿡�� �ҹ��ڷ� �����Ѵ�. �����ڵ�� �ҹ��ڰ� �빮�ں���
//		32��ŭ �� ũ��. ������� 'A'�� �ڵ�� 65�̰� 'a'�� �ڵ�� 97�̴�.
//		(1) ~ (2)�� �˸��� �ڵ带 �����ÿ�.
//		char ch = 'A';
//
//		char lowerCase = ( /* (1) */ ) ? ( /* (2) */ ) : ch;
//
//		System.out.println("ch : " + ch);
//		System.out.println("ch to lowercase : " + lowercase);	
//		��
//		char ch = 'C';
//		
//		char lowerCase = ( 'A' <= ch && ch <= 'Z' ) ? 
//				(char)(ch+32) : ch;
//		
//		System.out.println("ch : " + ch);
//		System.out.println("ch to lowercase : " + lowerCase);	
//		------------------------------------------------------
//		���� ������� ���ǽ����� ǥ���϶�.
//		1. int�� ������ x�� 10���� ũ�� 20���� ���� �� true�� ���ǽ�
//		int x = 11;
//		System.out.println(10 < x && x < 20);
////		2. char�� ������ ch1�� �����̳� ���� �ƴ� �� true�� ���ǽ�
//		char ch1 = 'k';
//		System.out.println(ch1 != ' ' && ch1 != '\t');
////		3. char�� ������ ch2�� 'x' �Ǵ� 'X'�� �� true�� ���ǽ�
//		char ch2 = 'X';
//		System.out.println(ch2 == 'x' || ch2 == 'X');
////		4. char�� ������ ch3�� ����('0'~'9')�� �� true�� ���ǽ�
//		char ch3 = '5';
//		System.out.println(ch3>='0' && ch3 <='9');
////		5. char�� ������ ch4�� ������(�빮�� �Ǵ� �ҹ���)�� �� true�� ���ǽ�
//		char ch4 = 'A';
//		System.out.println(('A' <= ch4 && ch4 <= 'Z') || 
//									('a' <= ch4 && ch4 <= 'z'));
////		6. int�� ���� year�� 400���� �����������ų� �Ǵ� 4�� ������������ 100����
////		������������ ���� �� true�� ���ǽ�
//		int year = 2020;
//		System.out.println((year % 400 == 0 ) || (year % 4 == 0)
//											&& (year % 100 != 0));
////		7. boolean�� ���� powerOn�� false�� �� true�� ���ǽ�
//		boolean powerOn = false;
//		System.out.println(!powerOn);
////		8. ���ڿ� �������� str�� "yes" �� �� true�� ���ǽ�
//		String str = "yes";
//		System.out.println(str.equals("yes"));
//		------------------------------------------------------
	}
	
}