package com.ezen.ex06;

class Counter{
	int count=0;
	
	public void increment() { 
		synchronized(this) { // 동기화 블럭
		count++; 
		}
	}
	synchronized public void decrement() { count--; }
	// synchronized가 붙어있으면 쓰레드가 하나씩 작동함
	
	public int getcount() { return count; }
}

public class MutualAccess {

	public static Counter cnt = new Counter();
	public static void main(String[] args) throws Exception {
		
		Runnable task1 = () -> {  // Runnable 구현한 인스턴스 생성
			for(int i=0; i<100; i++) {
				cnt.increment();
			}
		};

		Runnable task2 = () -> {
			for(int i=0; i<100; i++) {
				cnt.decrement();
			}
		};
		
		Thread t1 = new Thread(task1); // Thread 인스턴스 생성
		Thread t2 = new Thread(task2); // Thread 인스턴스 생성
		
		t1.start();
		t2.start();
		t1.join();  // t1이 참조하는 쓰레드 종료까지 대기
		t2.join();  // t2가 참조하는 쓰레드 종료까지 대기
		
		System.out.println(cnt.getcount()); // 실행 할 떄 마다 다른값이 나옴
	}

}
