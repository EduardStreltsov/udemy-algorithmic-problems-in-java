package com.udemy.lesson004;

// 4. Adding numbers: iteration vs recursion

class Algorithm {
	
	static int sumIterative(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result = result + i;
		}
		return result;
	}
	
	static int sumRecursive(int n) {
		if (n == 1) return 1;
		return n + sumRecursive(n - 1);
	}
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println(sumIterative(n));
		System.out.println(sumRecursive(n));
		// write your code here
	}
}
