package com.hackerrank.algorithms.implementation.easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class _008_BirthdayCakeCandles {
	
	// Complete the birthdayCakeCandles function below.
	static int birthdayCakeCandles(int[] arr) {
		//		return (int) Arrays.stream(arr).filter(i -> i == Arrays.stream(arr).max().orElse(0)).count();
		int max = Arrays.stream(arr).max().orElse(0);
		int count = 0;
		for (int val : arr) {
			if (val == max) {
				count++;
			}
		}
		return count;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(birthdayCakeCandles(new int[]{1, 2, 5, 8, 5, 8, 3, 3}));
		if (true) return;
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int arCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		int[] ar = new int[arCount];
		
		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for (int i = 0; i < arCount; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}
		
		int result = birthdayCakeCandles(ar);
		
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		
		bufferedWriter.close();
		
		scanner.close();
	}
}
