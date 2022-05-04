package com.ezen.ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int sum = 0;
		
		try { // 예외 처리 할 내용들
			int num = sc.nextInt();
			int a = 10/num;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(InputMismatchException e) {
			e.printStackTrace(); //에러가 난 부분을 로그에 남겨줌
		}catch(Exception e) {    //예외처리의 최상위 클래스, 간단하게 할때는 이거 하나로 처리 가능 왠만하면 세분화해서 처리하는게 좋음.
			e.printStackTrace();
		}finally { // 예외처리를 하던 안하던 finally를 들렸다 감, close같은 문장 넣어줄수 있음
			
		}
		
		for(int i=0; i<=100; i++)
			sum += i;
		System.out.println("sum = " + sum);
	}

}
