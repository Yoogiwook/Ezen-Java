import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Num{
	
	private int num;
	public Num(int num) { this.num = num; }
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		return num % 3;
	} // 데이터를 분류해줌
	
	@Override
	public boolean equals(Object obj) {
		if(this.num == ((Num)obj).num)
			return true;
		else
			return false;
	} // 데이터가 같은값인지 확인
}
// Hashset은 중복X, 순서X
public class HashSetEx02 {

	public static void main(String[] args) {
		
		Set<Num> set = new HashSet<Num>();
		
		set.add(new Num(5));
		set.add(new Num(5));
		set.add(new Num(1));
		set.add(new Num(3));
		set.add(new Num(2));
		// 사용자가 직접 클래스를 만들고 생성자를 이용해 값을 넣으면 중복 제거가 안됨
		// 중복제거를 하기 위해서는 사용자가 직접 hashCode와 equals를 오버라이딩해서 제거 해줘야함
		System.out.println("cnt : " + set.size());
		
		for( Iterator<Num> itr =  set.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		
		for(Num s : set)
			System.out.print(s + "\t");
	}

}
