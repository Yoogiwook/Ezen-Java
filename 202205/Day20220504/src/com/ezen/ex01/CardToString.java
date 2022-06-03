package com.ezen.ex01;

import java.util.Date;
class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	@Override
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
}

public class CardToString {

	public static void main(String[] args) {
		Card c1 = new Card("DIA", 10);
		Card c2 = new Card();
		
		System.out.println(c1);
		System.out.println(c2.toString());
		
		Date today = new Date();
		System.out.println(today);
		
	}

}
