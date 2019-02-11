package com.hackerrank.algorithms.implementation.easy;

public class _001_DivisibleSumPairs {
	
	public static void main(String[] args) {
		System.out.println(divisibleSumPairs(6, 3, new int[]{1, 3, 2, 6, 1, 2}));
	}
	
	private static int divisibleSumPairs(int n, int k, int[] ar) {
		int pairs = 0;
		for (int i = 0; i < n; i++) {
			for (int j = Math.min(i + 1, n); j < n; j++) {
				if ((ar[i] + ar[j])%k == 0) {
					pairs++;
				}
			}
		}
		return pairs;
	}
}
