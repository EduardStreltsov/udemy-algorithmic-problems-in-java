package com.hackerrank.data_structures.easy;

import java.util.Arrays;

public class _001_ArraysDS {
	
	private static int[] reverse(int[] arr) {
		int tmp = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			tmp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tmp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		Arrays.toString(reverse(arr));
	}
}
