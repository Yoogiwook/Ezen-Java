package com.ezen.ex06;

public class ThreadEx1 {

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
//		Runnable r = () -> { //람다식을 표시해주는 () -> { 해줘야함
//			for(int i=0; i<5; i++) {
////				Thread.currentThread() - 현재 실행중인 Thread 를 반환한다.
//				System.out.println(Thread.currentThread().getName());
//			}
//		};// 람다식 구현을 하게되면 밖에 클래스를 생성하지 않아도 됨
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}

}

class ThreadEx1_1 extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName());
		}
	}
}
class ThreadEx1_2 implements Runnable{
	public void run() {
		for(int i=0; i<5; i++) {
//			Thread.currentThread() - 현재 실행중인 Thread 를 반환한다.
			System.out.println(Thread.currentThread().getName());
		}
	}
}