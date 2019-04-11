package com.hackerrank.data_structures.easy;

public class _002_2DArrayDS {
	
	private static int hourglassSum(int[][] arr) {
		
		if (arr.length < 3) {
			return 0;
		}
		int max = (int) Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr[i].length - 2; j++) {
				max = Math.max(max, arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
						                    arr[i + 1][j + 1] +
						                    arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
	
	}
	
}
