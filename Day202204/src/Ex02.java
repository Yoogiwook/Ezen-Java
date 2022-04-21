import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      
	      for (int i = 0; i<4; i++) {
	      int age = sc.nextInt();
	      int fee = 2500;
	      
	      if (0 <= age && age < 4 || 65 <= age)
	         fee *= 0;
	      else if (4 <= age && age < 14)
	         fee *= 0.5;
	      else if (14 <= age && age < 20)
	         fee *= 0.75;
	      else
	         fee *= 1;
	      System.out.println(age + "살의 요금은 " + fee + "원입니다.");
	      }
	
	}
	
}
