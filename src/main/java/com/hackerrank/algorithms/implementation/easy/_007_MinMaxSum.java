package com.hackerrank.algorithms.implementation.easy;

import java.util.Scanner;

public class _007_MinMaxSum {
	
	// Complete the miniMaxSum function below.
	private static void miniMaxSum(int[] arr) {
		
		//		long sum = Arrays.stream(arr).sum();
		//		OptionalInt max = Arrays.stream(arr).max();
		//		OptionalInt min = Arrays.stream(arr).min();
		//		System.out.println("" + (sum - max.orElse(0)) + " " + (sum - min.orElse(0)));
		
		long sum = 0, min = 0, max = 0;
		for (int i = 0; i < arr.length; i++) {
			long val = arr[i];
			sum += val;
			if (i == 0) {
				min = val;
				max = val;
			} else {
				min = Math.min(min, val);
				max = Math.max(max, val);
			}
		}
		System.out.println("" + (sum - max) + " " + (sum - min));
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		//		int[] arr = new int[5];
		//
		//		String[] arrItems = scanner.nextLine().split(" ");
		//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//
		//		for (int i = 0; i < 5; i++) {
		//			int arrItem = Integer.parseInt(arrItems[i]);
		//			arr[i] = arrItem;
		//		}
		//
		//		miniMaxSum(arr);
		//
		//		scanner.close();
		
		miniMaxSum(new int[]{1, 2, 3, 4, 5});
	}
}
