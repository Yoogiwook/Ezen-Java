package com.ezen.ex01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		// Queue는 인터페이스이기 때문에 객체를 생성할 수 없다 그래서 구현체인 LinkedList를 사용함
		
		st.push("0");
		st.push("1");
		st.push("2");
		// First In Last Out
		q.offer("0");
		q.offer("1");
		q.offer("2");
		// First In First Out
		
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
