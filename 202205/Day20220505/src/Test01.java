import java.util.Arrays;

class Time{
	int hour;
	int minute;
	int second;
}

public class Test01 {

	public static void main(String[] args) {
		
//		Time[] t = new Time[3]; // 공간만 생성
//		t[0] = new Time(); // 객체를 생성해야
//		t[0].hour = 100; // 값을 입력할 수 있음
//		System.out.println(t[0].hour);
		
		
		 //반환형 없는 경우, 매개전달 없는 경우
	      sum();

	      //반환형 없는 경우, 매개전달 있는 경우
	      sum2(10,20);

	      //반환형 있는 경우, 매개전달 있는 경우
	      int num = sum3(10,20);
	      System.out.println(num);

	      //반환형 있는 경우, 매개전달 없는 경우
	      int num2 = sum4();
	      System.out.println(num2);
}
	   //    반환   이름(매개변수)  
	   static void sum() {
	      System.out.println("sum");
	   }
	   static void sum2(int i, int j) {
	      System.out.println(i+j);
	   }
	   static int sum3(int i, int j) {
	      return i+j;
	   }
	   static int sum4() {
	      return 100;
	   }
}