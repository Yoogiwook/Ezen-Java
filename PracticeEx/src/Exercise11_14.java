import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise11_14 {
	static ArrayList record = new ArrayList();
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
	
		while(true) {
			switch(displayMenu()) {
				case 1:
					inputRecord();
					break;
				case 2:
					displayRecord();
					break;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			}
		} //end of while
	}
	static int displayMenu() {
System.out.println("******************************************");
	System.out.println("*             성적 관리 프로그램              *");
System.out.println("******************************************");
	System.out.println();
	System.out.println("1. 학생성적 입력하기 ");
	System.out.println();
	System.out.println("2. 학생성적 보기 ");
	System.out.println();
	System.out.println("3. 프로그램 종료 ");
	System.out.println();
	System.out.print("원하는 메뉴를 선택하세요.(1~3) : ");
	
	int menu = 0;
//	1 화면으로 메뉴 입력, 메뉴값 1~3, 다른값이면 다시 입력
	while(true) {
		 menu = s.nextInt();
		if(0 < menu && menu < 4) {
			if(menu == 3) {
				break;
			}
			return menu;
			} else 
			System.out.println("1부터 3까지만 입력해주세요.");
		continue;
		
	} //end of while
	
	return menu;
	} //end of displayMenu
	
		static void inputRecord() {
			System.out.println("1. 학생성적 입력하기");
			System.out.println("이름, 반, 번호, 국어성적, 영어성적, 수학성적의 순서로 공백없이 입력하세요.");
			System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
			
				
			while(true) {
				System.out.println(">>");
				
//				2 스캐너 이용 데이터 입력(',' 를 구분자로)
//				  입력받은 값이 q또는 Q이면 메서드를 종료, 그렇지않으면 입력받은 값으로 
//				  Student 인스턴스 생성 record에 추가
//				  입력받은 데이터에서 예외가 발생하면, "입력오류입니다. " 를 보여주고 다시 입력받는다
//				  q또는 Q가 입력될 때까지 2~3의 작업을 반복한다.
				
				try {
					String str = s.next();
					if(str.equalsIgnoreCase("q")) {
						break;
					} else {
					StringTokenizer stt = new StringTokenizer(str, ",");
					
					String name = "";
					int ban = 0;
					int no = 0;
					int kor = 0;
					int eng = 0;
					int math = 0;
					
					name = stt.nextToken();
					ban = Integer.parseInt(stt.nextToken());
					no = Integer.parseInt(stt.nextToken());
					kor = Integer.parseInt(stt.nextToken());
					eng = Integer.parseInt(stt.nextToken());
					math = Integer.parseInt(stt.nextToken());
					
					record.add(new Student(name, ban, no, kor, eng, math));
					
					}
			}catch(Exception e) {
				System.out.println("입력오류입니다.");
				continue;
				
				}
			} //end of while
		} //end of inputRecord
		static void displayRecord() {
			int koreanTotal = 0;
			int englishTotal = 0;
			int mathTotal = 0;
			int total = 0;
			
			int length = record.size();
			
			if(length > 0) {
				System.out.println();
				System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
				
System.out.println("=====================================================================");

			for(int i=0; i<length; i++) {
				Student student = (Student)record.get(i);
				System.out.println(student);
				koreanTotal += student.kor;
				mathTotal += student.math;
				englishTotal += student.eng;
				total += student.total;
			} // end of for
System.out.println("=====================================================================");
			System.out.println("총점 : "+koreanTotal+" "+englishTotal+" "
					+mathTotal+" "+total);
			System.out.println();
			} else {
System.out.println("=====================================================================");
			System.out.println(" 데이터가 없습니다.");
System.out.println("=====================================================================");
			}
	} // end of displayRecord
}

class Student implements Comparable{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int total;
	int schoolRank;
	int classRank;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor+eng+math;
	}
	
	int getTotal() {
		return total;
	}
	float getAverage() {
		return (int)((getTotal() / 3f)*10+0.5)/10f;
	}
	
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student tmp = (Student)o;
			
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}
	
	public String toString() {
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal()
				+","+getAverage()
				+","+schoolRank
				+","+classRank;
	}
} // end of class Student
