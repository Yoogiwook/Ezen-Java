import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("toy", "box", "robot", "toy"); //asList : 배열을 List에 넣어준다
		//생성하면서 초기화는 가능하지만 추가가 불가능
		
		System.out.println(list);
		
//		list.add("box"); //에러
//		System.out.println(list);
		
		list = new ArrayList<String>(list); // list를 ArrayList로 속성변환(형변환)하여 추가 가능
		
		ListIterator<String> it = list.listIterator(); //양방향 검색가능 많이 쓰진 않음

		while(it.hasNext()) { // 읽어올 데이터가 있나 확인
			String str = it.next(); // 데이터 불러와서 str에 저장
			System.out.print(str + '\t');
		}
		
		System.out.println();
		
		while(it.hasPrevious()) { //역순으로 읽어올 데이터가 있나
			String str = it.previous(); // 역순으로 데이터 불러와서 str에 저장
			System.out.print(str + '\t');
		}
		
		System.out.println();
		
		for( Iterator<String> itr = list.iterator(); itr.hasNext(); )
			System.out.print(itr.next() + '\t');
		//아래 문장을 위의 문장으로 간편하게 할수있음
//		Iterator<String> it2 = list.iterator();
//		System.out.println("\n---------------------------");
//		while(it2.hasNext()) {
//			String str2 = it2.next();
//			System.out.print(str2 + '\t');
//		}
		
	}

}
