package com.hackerrank.algorithms.implementation.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _003_AVeryBigSum {
	
	private static void sum(long[] arr) {
		
		List<Byte> result = new ArrayList<>();
		char currentChar;
		
		for (int i = 0; i < arr.length; i++) {
			String val = String.valueOf(arr[i]);
			for (int j = val.length() - 1; j >= 0; j--) {
				Byte currByte = Byte.parseByte(String.valueOf(val.charAt(j)));
				Byte writtenByte = result.get(val.length() - 1 - j);
				result.add(val.length() - 1 - j, (byte) ((currByte + writtenByte)%10));
			}
		}
		
		System.out.println();
	}
	
	private static void sumWithByteArray(long[] arr) {
	
	}
	
	private static long sumWithJava8(long[] arr) {
		return Arrays.stream(arr).sum();
	}
	
	
	public static void main(String[] args) {
		sum(new long[]{5, 10000000000003L, 10000000000003L, 10000000000003L});
	}
	
}
