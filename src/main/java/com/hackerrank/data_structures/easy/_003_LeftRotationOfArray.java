package com.hackerrank.data_structures.easy;

import java.util.Arrays;

public class _003_LeftRotationOfArray {
	
	private static int getShiftedIndex(int length, int index, int shift) {
		if (shift == 0) {
			return index;
		}
		int shifted = index - shift;
		if (shifted < 0) {
			shifted = length - shifted;
		}
		return shifted;
	}
	
	private static int[] leftShift(int[] arr, int n) {
		
		if (n == arr.length) {
			return arr;
		}
		if (n > arr.length) {
			n = n % arr.length;
		}
		
		int[] buffer = new int[n];
		
		for (int i = arr.length - 1; i >= 0; i -= n) {
			for (int j = 0; j < n; j++) {
				int tmp = buffer[j];
				buffer[j] = arr[i - j];
				arr[i - j] = tmp;
			}
		}
		for (int j = 0; j < n; j++) {
			arr[arr.length - 1 - j] = buffer[j];
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(leftShift(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 3)));
	}
}
