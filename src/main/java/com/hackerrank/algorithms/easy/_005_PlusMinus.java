package com.hackerrank.algorithms.easy;

import java.util.Arrays;

public class _005_PlusMinus {
	
	private static void plusMinus(int[] arr) {
		System.out.println((float) Arrays.stream(arr).filter(i -> i > 0).count() / arr.length);
		System.out.println((float) Arrays.stream(arr).filter(i -> i < 0).count() / arr.length);
		System.out.println((float) Arrays.stream(arr).filter(i -> i == 0).count() / arr.length);
	}
	
	public static void main(String[] args) {
		plusMinus(new int[]{-1, 1, -1, 0, 1, 1});
	}
	
}
