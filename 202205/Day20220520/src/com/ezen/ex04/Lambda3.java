package com.ezen.ex04;
// member -> Local -> Anonymous -> lambda 순으로 코드가 직관적이고 간단해짐
interface Printable3{ void print(String s); }

public class Lambda3 {
	public static void main(String[] args) {
		//람다
		Printable3 prn = (s) -> System.out.println(s);
						// () -> : 람다식 시그니처
		prn.print("java is lambda3!!");
	}
}
