package com.udemy.lesson006;

public class Factorial {
	
	public static int factorialRecursive(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorialRecursive(n - 1);
		}
	}
	
	public static int factorialIterative(int n) {
		if (n <= 1) {
			return 1;
		}
		int result = 1;
		for (int i = n; i > 1; i--) {
			result = result * i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(factorialRecursive(13));
		System.out.println(factorialIterative(13));
	}
	
}
