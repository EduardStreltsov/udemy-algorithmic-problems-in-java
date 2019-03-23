package com.hackerrank.algorithms.implementation.easy;

import java.util.Arrays;

public class _004_DiagonalDifference {
	
	private static int[][] getRandomMatrix(int n) {
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = ((int) (Math.random() * 2)) == 1 ? 1 : -1 * (int) (Math.random() * 100);
			}
		}
		
		return arr;
	}
	
	private static int difference(int[][] arr) {
		int diagonalSum1 = 0;
		int diagonalSum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			diagonalSum1 += arr[i][i];
			diagonalSum2 += arr[i][arr.length - 1 - i];
		}
		return Math.abs(diagonalSum1 - diagonalSum2);
	}
	
	public static void main(String[] args) {
		int n = (int) (Math.random() * 100);
		System.out.println("Side of the matrix is " + n);
		int[][] arr = getRandomMatrix(n);
		printMatrix(arr);
		System.out.println("The difference is " + difference(arr));
	}
	
	private static void printMatrix(int[][] arr) {
		Arrays.stream(arr).forEach(ints -> {
			Arrays.stream(ints).forEach(i -> System.out.print("\t" + i + "\t"));
			System.out.println();
		});
	}
}
