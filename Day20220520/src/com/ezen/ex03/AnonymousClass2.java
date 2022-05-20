package com.ezen.ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClass2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Robot");
		list.add("apple");
		list.add("toy");
		Comparator<String> cmp = new Comparator<String>() { //인터페이스를 이용해서 객체생성 하면서 오버라이딩하여 리턴값 출력
			
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		};
		Collections.sort(list,cmp);
		System.out.println(list);
	}

}
