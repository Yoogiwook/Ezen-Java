package com.ezen.ex01;

import java.util.HashSet;  //HashSet은 중복된 데이터X

public class HashSetEqualTest {

	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
		
		set.add(new Num(100));
		set.add(new Num(200));
		set.add(new Num(300));
		set.add(new Num(100));
		
		for(Num n : set)
			System.out.println(n);
	}

}

class Num{
	private int num;
	
	public Num(int n) {
		num = n;
	}
	@Override
	public int hashCode() {
		System.out.println("hashCode");
		return num % 3;
	}
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals");
		
		return num == ((Num)obj).num;
	}
	
	@Override
	public String toString() {
		
		return String.valueOf(num);
	}
}