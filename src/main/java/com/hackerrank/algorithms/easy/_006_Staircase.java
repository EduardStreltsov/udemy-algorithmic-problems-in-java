package com.hackerrank.algorithms.easy;

import java.util.Scanner;

public class _006_Staircase {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	// Complete the staircase function below.
	static void staircase(int n) {
		for (int i = 0; i < n; i++) {
			StringBuilder s = new StringBuilder();
			for (int j = 0; j < n; j++) {
				s.append(s.length() < n - 1 - i ? ' ' : '#');
			}
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		staircase(n);
		
		scanner.close();
	}
}
