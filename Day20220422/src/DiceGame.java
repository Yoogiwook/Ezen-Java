/*
 * 주사위 2개를 던진다.
 * (1,2)
 * (4,5)
 * (6,6)
 * (3,2) ==> break 두 수 합이 5가 되면 종료
 */
public class DiceGame {

	public static void main(String[] args) {
//		int dice1 = 0;
//		int dice2 = 0;
//		int result = 0;
//		int count = 0;
//		do {
//			
//		dice1 = (int)(Math.random()*6)+1;
//		dice2 = (int)(Math.random()*6)+1;
//		result = dice1+dice2;
//		System.out.println(result);
//		count++;
//		
//		} while(result != 5);
//		
//		System.out.println("주사위 던진 횟수 : "+ count);
//		System.out.println("두 주사위의 합 : "+ result);
//		------------------------------------------
//		강사님답
		
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			
			System.out.println("(" + num1 + "," + num2 + ")");
			
			if((num1+num2) == 5) break;
		}
		
	}

}
