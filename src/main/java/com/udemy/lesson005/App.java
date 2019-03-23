package com.udemy.lesson005;

// 5. House building problem

public class App {
	
	static void headRecursion(int n) {
		if (n == 0) return;
		headRecursion(n -1 );
		System.out.println(n);
	}
	
	static void tailRecursion(int n) {
		if (n == 0) return;
		System.out.println(n);
		tailRecursion(n -1 );
	}
	
	public static void main(String[] args) {
		headRecursion(4);
		tailRecursion(4);
	}
	
}
