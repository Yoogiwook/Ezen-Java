import java.util.Arrays;

public class Day220419 {

	public static void main(String[] args) {
		//총점, 평균 구할땐 이 식이 바로생각나야함!!!!
		//예제 5-5
//		int sum = 0;
//		float average = 0f;
//		
//		int[] score = {100,88,100,100,90};
//		
//		for (int i=0; i < score.length; i++) {
//			sum += score[i];
//		}
//		average = sum / (float)score.length;
//		
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + average);
		
//		-----------------------------------------
		//예제 5-6
//		int[] score = {79, 88, 91, 33, 100, 55, 95};
//		
//		int max = score[0];
//		int min = score[0];
//		
//		for(int i=1; i < score.length; i++) {
//			if(score[i] > max) {
//				max = score[i];
//			} else if(score[i] < min) {
//				min = score[i];
//			}
//		}
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
		
//		-----------------------------------------
		//예제 5-7
//		int[] numArr = new int[10];
//		
//		for(int i=0; i< numArr.length; i++) {
//			numArr[i] = i;
//			System.out.print(numArr[i]);
//		}
//		System.out.println();
//	
//		for(int i=0; i<100; i++) {
//			int n = (int)(Math.random()*10);
//			int tmp = numArr[0];
//			numArr[0] = numArr[n];
//			numArr[n] = tmp;
//		}
//		for(int i=0; i<numArr.length; i++)
//			System.out.print(numArr[i]);
		
//		-----------------------------------------
		//예제 5-8
//		int[] ball = new int[45];  //배열 선언
//		
//		for(int i=0; i<ball.length; i++) {
//			ball[i] = i+1; 			//배열 초기화해서 1~45개 값 넣어줌
//		}
//		for(int i=0; i<6; i++) {		//1~6번방의 값을 랜덤으로 섞어줌
//			int j = (int)(Math.random()*45);
//			int tmp = ball[i];
//			ball[i] = ball[j];
//			ball[j] = tmp;
//		}
//		for(int i=0; i<6; i++)			//섞인 1~6번방의 값을 출력
//			System.out.printf("ball[%d] = %d%n", i, ball[i]);
		
//		-----------------------------------------
		//예제 5-9
//		int[] code = {-4, -1, 3, 6, 11};
//		int[] arr = new int[10];
//		
//		for(int i=0; i<arr.length; i++) {
//			int tmp = (int)(Math.random()*code.length);
//			arr[i] = code[tmp];		//code 방에 채워진 숫자를 arr 방에 넣어줌
//		}
//		System.out.println(Arrays.toString(arr));
		
//		-----------------------------------------
		//예제 5-10
//		int[] numArr = new int[10];
//		
//		for(int i=0; i<numArr.length; i++) {
//			System.out.print(numArr[i] = (int)(Math.random()*10));
//		}
//		System.out.println("\n----------");
//		
//		for(int i=0; i<numArr.length-1; i++) {
//			boolean changed = false;
//			
//			for(int j=0; j<numArr.length-1-i; j++) {
//				if(numArr[j] > numArr[j+1]) {
//					int temp = numArr[j];
//					numArr[j] = numArr[j+1];
//					numArr[j+1] = temp;
//					changed = true;
//				}
//			}
//			if(!changed) break; // changed가 더이상 일어나지 않으면 남은 횟수는 버려지고
//								// 바로 출력   if(changed != true)랑 같은 뜻
//			for(int k=0; k<numArr.length; k++)
//				System.out.print(numArr[k]);
//			System.out.println();
//		}
//		-----------------------------------------
		//예제 5-11
//		int[] numArr = new int[10];
//		int[] counter = new int[10];
//		
//		for(int i=0; i<numArr.length; i++) {
//			numArr[i] = (int)(Math.random()*10);
//			System.out.print(numArr[i]); // 랜덤한 값 0~9방에 집어넣기
//		}
//		System.out.println();
//		
//		for(int i=0; i<numArr.length; i++) { // 0~9의 값 각자 누적
//			counter[numArr[i]]++; 	// 기억해놓기
//		}
//		for(int i=0; i<numArr.length; i++) { // 누적된 값 출력
//			System.out.println(i + "의 개수 : "+ counter[i]);
//		}
//		-----------------------------------------
		//String 배열
		//예제 5-12
//		String[] names = {"Kim", "Park", "Yi"};
//		
//		for(int i=0; i<names.length; i++)
//			System.out.println("names[" + i + "]:" + names[i]);
//		
//		String tmp = names[2];
//		System.out.println("tmp : " + tmp);
//		names[0] = "Yu";
//		
//		for(int i=0; i<names.length; i++)
//			System.out.println(names[i]);
//		for(String str : names)	//위 아래 같은식 (향상된 for문)
//			System.out.println(str);
		
//		-----------------------------------------
		//예제 5-13
//		char[] hex = {'C','A','F','E'};
//		
//		String[] binary = { "0000", "0001", "0010", "0011",
//							"0100", "0101", "0110", "0111",
//							"1000", "1001", "1010", "1011",
//							"1100", "1101", "1110", "1111" };
//		
//		String result = "";
//		
//		for(int i=0; i<hex.length; i++) {
//			if(hex[i] >='0' && hex[i] <='9') {
//				result += binary[hex[i]-'0'];
//			} else {
//				result += binary[hex[i]-'A'+10];
//			}
//		}
//		System.out.println("hex : "+ new String(hex));
//		System.out.println("binary : "+ result);
		
//		-----------------------------------------
		//예제 5-14
//		String src = "ABCDE";
//		
//		for(int i=0; i<src.length(); i++) {
//			char ch = src.charAt(i);
//			System.out.println("src.charAt("+i+") : "+ ch);
//		}
//			char[] chArr = src.toCharArray();//String 문자 자체를 char로 바꿔줌
//			System.out.println(chArr);
//			
//			String msg = "korea";
//			chArr = msg.toCharArray();
//			System.out.println(chArr); //char 형만 sysout으로 바로 출력가능
			
//		-----------------------------------------
		//다차원 배열
//		int[][] score = { 
//						  {100,100,100},
//						  {20, 20, 20, 20 },
//						  {40, 40, 40, 40, 40 },
//						  {50, 50, 50, 50, 50, 50 }
//						};
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++)
//				System.out.print(score[i][j]+" ");
//			System.out.println();
//		}
		
//		-----------------------------------------
		//예제 5-18
//		int[][] score = {
//							{100, 100, 100},
//							{20, 20, 20},
//							{30, 30, 30},
//							{40, 40, 40}
//						};		
//		int sum = 0;
//		
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
//			}
//		}
//		
//		System.out.println("-----------------------");
//		for(int[] tmp : score) {
//			int j=0;
//			for(int i : tmp) {
//				sum += i;
//				System.out.print(tmp[j]+ " ");
//			}
//			System.out.println();
//		}
//		System.out.println("sum = "+ sum);
		
//		-----------------------------------------
		//예제 5-19
//		int[][] score = {
//							{100, 100, 100},
//							{20, 20, 20},
//							{30, 30, 30},
//							{40, 40, 40},
//							{50, 50, 50}
//						};
//		int korTotal = 0, engTotal = 0, mathTotal = 0;
//		
//		System.out.println(" 번호  국어  영어  수학  총점  평균");
//		System.out.println("=============================");
//		
//		for(int i=0; i<score.length; i++) {
//			int sum = 0;
//			float avg = 0;
//			
//			korTotal += score[i][0];
//			engTotal += score[i][1];
//			mathTotal += score[i][2];
//			System.out.printf("%3d", i+1); //번호 입력
//			
//			for(int j=0; j<score[i].length; j++) { //점수 출력
//				sum += score[i][j];
//				System.out.printf("%5d", score[i][j]);
//			}
//			avg = sum/ (float)score[i].length; // 평균 계산
//			System.out.printf("%5d %5.1f%n", sum, avg);  // 총점, 평균 출력
//		}
//		
//		System.out.println("=============================");
//		System.out.printf("총점 : %3d %4d %4d%n", korTotal, engTotal, mathTotal);
			// 각 과목 총점 출력
		
//		-----------------------------------------
		
//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//		
//		for(int i=0; i<arr.length; i++)
//			sum += arr[i];
//		
//		System.out.println("sum = " + sum);
//		//위 아래 두 식은 같은 식
//		int sum2 = 0;
//		for(int i : arr)
//			sum2 += i;
//		
//		System.out.println("sum = " + sum);
		
//		-----------------------------------------
		
//		int[][] arr = {
//						{5, 5, 5, 5, 5},
//						{10, 10, 10, 10, 10},
//						{20, 20, 20, 20, 20, 20, 20},
//						{30, 30, 30, 30, 30, 30}
//					  };
//		int total = 0;
//		float average = 0;
//		int count = 0;
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++)  {
//				total += arr[i][j];
//				count++;
//			}
//		}
//		System.out.println("count = "+count);
//		average = total/(float)(count);
//		
//		System.out.println("total="+total);
//		System.out.printf("average= %.2f",average);
		
//		-----------------------------------------
		
		//다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
		//(1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
//		int[] ballArr = {1,2,3,4,5,6,7,8,9};
//		int[] ball3 = new int[3];
//		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
//		for(int i=0; i<ballArr.length; i++) {
//			int j = (int)(Math.random()*ballArr.length);
//			int tmp = 0;
//			
//		//	(1)알맞은 코드를 넣어 완성하시오.
//			
//			tmp = ballArr[i];
//			ballArr[i] = ballArr[j];
//			ballArr[j] = tmp;
//		}
//		System.out.println(Arrays.toString(ballArr));
//		
//		//	(2)배열 ballArr의 앞에서 3개의 수를 배열 ball3으로 복사한다.
////		for(int i=0; i<3; i++)
////			ball3[i] = ballArr[i];
//		
//		System.arraycopy(ballArr, 0, ball3, 0, 3);
//		for(int i=0; i<ball3.length; i++) {
//			System.out.print(ball3[i]);
//		}
		
//		-----------------------------------------
//		다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변수 money의
//		금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라. 단, 가능한 한
//		적은 수의 동전으로 거슬러 주어야 한다. (1)에 알맞는 코드를 넣어서 프로그램을 완성하시오.
//		[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야한다.

//		int[] coinUnit = { 500, 100, 50, 10 };
//		int money = 2680;
//		int money2 = money;
//		System.out.println("money = " + money);
//		
//		
//		for(int i=0; i<coinUnit.length; i++) {
//		//	(1) 알맞은 코드를 넣어 완성하시오.
//			int num = money / coinUnit[i];
//			money %= coinUnit[i];
//			
//			System.out.println(coinUnit[i] + "원 : "+ num + "개");
//		}
		
//		-----------------------------------------
//		배열 answer에 담긴 데이터를 읽고 각 수자의 개수를 세어서 개수만큼 '*' *을 찍어서
//		그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
		// 예제 5-11 과 비슷한 문제
//		int[] answer = {1,4,4,3,1,4,4,2,1,3,2}; //1~4 -> 0~3 //0~9
//		
//		int[] counter = new int[4];
//		
//		for(int i=0; i<answer.length; i++) { //answer.length -> 11
//		//	(1) 알맞은 코드를 넣어 완성하시오.
//			counter[answer[i]-1]++; // -1한 이유는 배열 0,1,2,3 을 맞추기위해서
//		}
//		for(int i=0; i<counter.length; i++) {
//		//	(2) 알맞은 코드를 넣어 완성하시오.
//			System.out.print(counter[i]);
//			
//			for(int j=0; j<counter[i]; j++)
//				System.out.print("*");
//			
//			System.out.println();
//		}
//		출력 결과는
//		3***
//		2**
//		2**
//		4****
		
//		-----------------------------------------
//		주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열의 행과 열의
//		마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다 (1)에 알맞은 코드를 
//		넣어서 완성하시오.
		
		int[][] score = {
							{100, 100, 100},
							{20, 20, 20},
							{30, 30, 30},
							{40, 40, 40},
							{50, 50, 50}
						};
		int[][] result = new int[score.length + 1][score[0].length + 1];
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
		//		(1) 알맞은 코드를 넣어 완성하시오.
				result[i][j] = score[i][j];
				result[i][result[0].length-1] += score[i][j];
				result[result.length-1][j] += score[i][j];
				
			}
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
		
	}		
}
