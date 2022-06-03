import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Ex6_4_2 {

	public static void main(String[] args) {
		
		Student2 s = new Student2("손흥민", 1, 10, 90, 100, 60); 
												// 생성자 호출 >> 디폴트생성자
		System.out.println(s.getName());
		System.out.println(s.getTotal());
		
		Student2 s2 = new Student2("이상우", 2, 9, 90, 80, 70); 
		System.out.println(s2.getName());
		System.out.println(s2.getTotal());
		
		Student2 s3 = new Student2("박상무", 2, 9); 
		System.out.println(s3.getName());
		System.out.println(s3.getTotal());

	}

}

// private < default < protected < public

@Getter  // @ <- 어노테이션
@Setter	// 롬복을 쓰는게 편함 지금은 타이핑, 이클립스꺼사용
@ToString
class Student2{
	//변수>> 인스턴스변수, 클래스변수, 지역변수
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	//함수 오버로딩
	public Student2(String name, int ban, int no,
										int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public char[] getName() {
		
		return null;
	}
	//함수 오버로딩
	public Student2(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	//함수 --> 인스턴스메소드, 클래스메소드
	
	
	int getTotal() {
		int sum = kor+eng+math;
		return sum;
	}
	double getAverage() {
		return getTotal()/3.0;
	}
}