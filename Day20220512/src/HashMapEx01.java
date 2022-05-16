import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

class AgeDesc implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2 - o1;
	}
	
}

public class HashMapEx01 {

	public static void main(String[] args) {
//		HashMap<Integer, String> map = new HashMap<Integer, String>(); //자동으로 sort 안해줌
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(new AgeDesc()); //자동으로 sort 해줌
		
		
		map.put(6, "kim");
		map.put(3, "kim");
		map.put(20, "kim");
		map.put(13, "kim");
		map.put(4, "hong");
		map.put(4, "Lee");
		map.put(14, "Lee");
		map.put(5, "park");
		map.put(15, "park");
		map.put(4, "Lee2");
		map.put(4, "kim");
		// key 값이 중복되면 마지막 문장이 들어감(덮어씌움)
		
		System.out.println(map);
		System.out.println(map.get(5)); //value값만 보려면 get(key 값) 넣어주면 됨
		
		// Map 자체로는 반복문을 돌릴수가 없음
		Set<Integer> set = map.keySet();
		for( Integer n : set ) // key만 출력
			System.out.print(n + "\t");
		System.out.println();
		for( Integer n : set ) // value만 출력
			System.out.print(map.get(n) + "\t");
		
		System.out.println();
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext())
			System.out.print(map.get(itr.next()) + "\t");
		
	}

}
