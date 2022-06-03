import java.util.Scanner;

/* 요일에 해당하는 영문 소문자 입력하기
 * 일 월 화 수 목 금 토 --> 랜덤하게 이 중 하나가 나오면
 * 그에 맞는 소문자로 요일 입력 --> sunday, monday, tuesday, wednesday, 
 * thursday, friday, saturday
 */
public class Day {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] DayEng = { 
				"sunday", "monday", "tuesday", "wednesday",
				"thursday", "friday", "saturday"
								};
		String[] DayKor = {"일", "월", "화", "수", "목", "금", "토" };
		
		System.out.println("해당 요일의 영어 단어를 소문자로 입력하세요.");
		
		int retry = 0;
		int last = -1;
		
		int success =0;
		int failed =0;
		do {
			int day;
			do {
				day = (int)(Math.random()*DayKor.length); //랜덤 값 day에 저장
			}while(day == last); // day와 last가 같은 값이면 다시 do로 올라감
			last = day;		// 최종요일이 저장된 상태
			
			while(true) {
				System.out.print((DayKor[day])+"요일 : ");
				String qus = sc.nextLine();  // 정답 입력 > qus에 저장
				
				if(qus.equals(DayEng[day])) {
					success++; // 성공시 +1
					break; // qus와 비교 후 맞으면 브레이크
				}
				failed++; // 실패시 +1
				System.out.println("오답입니다. 재입력해주세요.");
			}
			
			System.out.println("정답입니다. >> 재시도(1) : 종료(0) : ");
			retry = sc.nextInt();
			sc.nextLine();		//엔터 제거용
			
		}while(retry == 1);
		
		System.out.printf("성공 : %d회, 실패 : %d회\n", success, failed);
		System.out.println("프로그램 종료!!");
	}

}