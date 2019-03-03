package com.hackerrank.algorithms.implementation.easy;

import java.util.Arrays;

public class _003_DiagonalDifference {
	
	private static int[][] getRandomMatrix(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				arr[i][j] = ((int) (Math.random() * 2)) == 1 ? 1 : -1 * (int) (Math.random() * 100);
			}
		}
		
		return arr;
	}
	
	private static int difference(int n1, int[][] arr) {
		int diagonalSum1 = 0;
		int diagonalSum2 = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			diagonalSum1 += arr[i][i];
			diagonalSum2 += arr[i][arr.length - 1 - i];
		}
		return diagonalSum1 - diagonalSum2;
	}
	
	public static void main(String[] args) {
		int n = (int) (Math.random() * 100);
		System.out.println("Side of the matrix is " + n);
		int[][] arr = getRandomMatrix(n);
		printMatrix(arr);
		System.out.println("The difference is " + difference(n, arr));
	}
	
	private static void printMatrix(int[][] arr) {
		Arrays.stream(arr).forEach(ints -> {
			Arrays.stream(ints).forEach(i -> System.out.print("\t" + i + "\t"));
			System.out.println();
		});
	}
}
