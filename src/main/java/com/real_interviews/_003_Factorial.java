package com.real_interviews;

import java.math.BigInteger;

public class _003_Factorial {
	
	private static long factorialIterative(int n) {
		long f = 1;
		for (int i = n; i > 0; i--) {
			f *= i;
		}
		return f;
	}
	
	private static BigInteger factorialIterativeBigint(int n) {
		BigInteger f = new BigInteger(String.valueOf(1));
		for (int i = n; i > 0; i--) {
			f = f.multiply(new BigInteger(String.valueOf(i)));
		}
		return f;
	}
	
	private static long factorialRecursive(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorialRecursive(n - 1);
	}
	
	public static void main(String[] args) {
		int n = 101;
		
		System.out.println(factorialIterative(n));
		System.out.println(factorialIterativeBigint(n));
		System.out.println(factorialRecursive(n));
	}
}
