package com.ezen.ex01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx01 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(5);
		list1.add(4); // 아래랑 같은 식 오토박싱
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 값 카피
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2)); 
					// containsAll << collection 에서 상속받음 list1 에 있는 데이터 들이 list2에 들어있나 확인
					// 변화가 있으면 true, 없으면 false
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		 // add는 값 추가 set은 값 덮어 씌우기
		list2.set(3, "AA");
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
		// retainAll list1과 list2를 비교해 겹치는 부분만 남기고 삭제, 변화가 있으면 true, 없으면 false
		print(list1, list2);

		for(int i= list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i); 
		} // list1 과 list2를 비교해 중복된 값은 삭제
		print(list1, list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: "+list1);
		System.out.println("list2: "+list2);
		System.out.println();
	}
}
